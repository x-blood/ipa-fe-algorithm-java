package fe2005.spring;

import java.util.Arrays;

public class main2 {

    public static void main(String[] args) {
        System.out.println("[DEBUG]Starting 2005 Spring No.2");
        algo2 algo2 = new algo2();
        char[] A = new char[]{'a', 'a', 'b', 'c', 'a', 'b', 'b', '\\'};
        char[] S = new char[]{'a', 'b', '\\'};
        char[] D = new char[]{'A', 'B', 'C', '\\'};
        char[] B = new char[100];
        System.out.println("[DEBUG]A：" + Arrays.toString(A));
        System.out.println("[DEBUG]S：" + Arrays.toString(S));
        System.out.println("[DEBUG]D：" + Arrays.toString(D));
        algo2.Replace(A, S, D, B);
        System.out.println("[DEBUG]B：" + Arrays.toString(B));
        System.out.println("[DEBUG]Finished 2005 Spring No.2");
    }

}
