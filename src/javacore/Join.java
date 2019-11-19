package javacore;


public class Join {

    public static void main(String[] args) {

        String[] a = {"foo", "bar", "tra", "param pam", "hey", "hello-hello"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);

            // We don't need separator after last item
            if (i < a.length - 1) {
                sb.append(",");
            }
        }


        String s1 = sb.toString();
        System.out.println("s1: " + s1);

        String join = String.join(",", a);
        System.out.println("join: " + join);
    }
}

