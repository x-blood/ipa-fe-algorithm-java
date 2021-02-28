package fe2005.spring;

import java.util.Arrays;

public class main4 {

    public static void main(String[] args) {
        System.out.println("[DEBUG]Starting 2005 Spring No.4");

        algo4 algo4 = new algo4();
        System.out.println("[DEBUG]初期状態：" + Arrays.toString(algo4.A));
        algo4.HeapSort(algo4.A.length - 1);
        System.out.println("[DEBUG]終了状態：" + Arrays.toString(algo4.A));

        System.out.println("[DEBUG]Finished 2005 Spring No.4");
    }
}
