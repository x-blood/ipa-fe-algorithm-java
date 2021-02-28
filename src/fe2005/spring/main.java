package fe2005.spring;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        System.out.println("[DEBUG]Starting 2005 Spring");

        algo algo = new algo();
        System.out.println("[DEBUG]初期状態：" + Arrays.toString(algo.A));
        algo.HeapSort(algo.A.length - 1);
        System.out.println("[DEBUG]終了状態：" + Arrays.toString(algo.A));

        System.out.println("[DEBUG]Finished 2005 Spring");
    }
}
