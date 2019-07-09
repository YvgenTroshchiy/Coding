package javacore;

public class Sample {

    public static void main(String[] args) {
        System.out.println(isNetworkError(null));
    }

    public static boolean isNetworkError(Object error) {
        return (error instanceof Exception);
    }
}
