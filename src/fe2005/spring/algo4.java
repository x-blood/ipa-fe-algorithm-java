package fe2005.spring;

import java.util.Arrays;

public class algo4 {

//    private int[] A = new int[1000000];
    public int[] A = {0, 91, 86, 72, 72, 45, 69, 24, 55, 1, 12};

    public void HeapSort(int Num) {
        System.out.println("[DEBUG]Starting HeapSort");
        int Idx;
        /* 最初にヒープを作成 */
        InitHeap(Num);
        System.out.println("[DEBUG]ヒープ作成後：" + Arrays.toString(A));
        /* 並べ替え */
        for (Idx = Num; Idx > 1; Idx--) {
            Swap(1, Idx);
            MakeHeap(1, Idx - 1);
            System.out.println("[DEBUG]" + Idx + "：" + Arrays.toString(A));
        }
    }

    public void MakeHeap(int Top, int Last) {
        System.out.println("[DEBUG]Starting MakeHeap");
        int L, R;
        L = Top * 2;
        R = L + 1;
        if (R <= Last) {                /* 3個比較 */
            if (A[L] < A[R]) {          /* 右が大きい */
                if (A[Top] < A[R]) {
                    Swap(Top, R);
                    MakeHeap(R, Last);
                }
            } else {                    /* 左が大きい */
                if (A[Top] < A[L]) {
                    Swap(Top, L);
                    MakeHeap(L, Last);
                }
            }
        } else {
            if (L <= Last) {            /* 2個比較 */
                if (A[Top] < A[L]) {
                    Swap(Top, L);
                    MakeHeap(L, Last);
                }
            }
        }
    }

    public void Swap(int X, int Y) {
        System.out.println("[DEBUG]Starting Swap");
        int Tmp;
        Tmp = A[X];
        A[X] = A[Y];
        A[Y] = Tmp;
    }

    public void InitHeap(int Last) {
        System.out.println("[DEBUG]Starting InitHeap");
        int Idx;
        for (Idx = Last / 2; Idx >= 1; Idx--) {
            MakeHeap(Idx, Last);
        }
    }

}
