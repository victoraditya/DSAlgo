package test;

public class Test {

    static Integer id = 10;

    public static void main(String[] args) {
        System.out.println(id);
        try {
            throw new Exception("thorwn Exception");
        } catch (Exception e) {

        }
    }

}
