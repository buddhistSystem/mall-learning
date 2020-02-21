package test.ioc.iocfactory.impl;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.xpath.XPathExpression;
import org.jdom2.xpath.XPathFactory;
import test.ioc.iocfactory.MyApplicationContext;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @Author: Administrator
 * @Date: 2019/11/5 0005 10:57
 * @Description:
 */
public class MyClassPathXmlApplicationContext implements MyApplicationContext {
    /**
     * 要解析的配置文件
     */
    private File file;
    /**
     * 存放实例的Map
     */
    private Map<String, Object> beanMap = new HashMap<>(16);

    public MyClassPathXmlApplicationContext(String configFile) {
        URL url = getClass().getClassLoader().getResource(configFile);
        System.out.println("url:" + url);
        try {
            file = new File(url.toURI());
            try {
                xmlParse(file);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    private void xmlParse(File file) throws JDOMException, IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        SAXBuilder builder = new SAXBuilder();
        Document document = builder.build(file);
        // 创建XPath对象,反射获取XPath对象
        XPathFactory factory = XPathFactory.instance();
        // 获取所有的Bean节点,XPath解析写的写法可以了解一下
        XPathExpression expression = factory.compile("//bean");
        List beans = expression.evaluate(document);
        Iterator iterator = beans.iterator();
        while (iterator.hasNext()) {
            Element bean = (Element) iterator.next();
            // 获取配置文件的id属性值
            String id = bean.getAttributeValue("id");
            String cls = bean.getAttributeValue("class");
            // 反射拿到类的相应信息,首先是拿到类的实例对象
            Class clazz = Class.forName(cls);
            Object object = clazz.newInstance();
            // 获取类的所有方法,然后通过set方法给这个对象设置属性值
            Method[] methods = clazz.getDeclaredMethods();
            // 遍历Bean节点下的所有属性和方法,一一匹配,反射设置对象的属性值
            List<Element> list = bean.getChildren("property");
            for (Element element : list) {
                for (int i = 0; i < methods.length; i++) {
                    String methodName = methods[i].getName();
                    // 属性名
                    String temp = "";
                    // 这里检索set方法
                    if (methodName.startsWith("set")) {
                        // 这里就只截取set方法的方法名并且转换为小写的名字
                        temp = methodName.substring(3, 4).toLowerCase() + methodName.substring(4);
                        // 属性为普通对象的属性
                        if (element.getAttribute("name") != null) {
                            if (temp.equals(element.getAttributeValue("name"))) {
                                // 反射给对象设置值
                                methods[i].invoke(object, element.getAttributeValue("value"));

                            }
                        } else { // 属性为引用对象的属性
                            methods[i].invoke(object, beanMap.get(element.getAttributeValue("ref")));
                        }
                    }
                }
            }
            // 将对象添加到容器里面
            beanMap.put(id, object);

        }
    }

    @Override
    public Object getBean(String name) {
        return beanMap.get(name);
    }

}
