package test.exception;

public class ExceptionTest {

    public static int test() {
        try {
            int i = 10 / 0;
            System.out.println(i);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException " + e);
            return 1;
        } catch (Exception e) {
            System.out.println("Exception " + e);
            return 2;
        } finally {
            System.out.println("Finally");
            return 3;
        }
    }

    public static void main(String[] args) {
        int i = test();
        System.out.println(i);
    }

}
