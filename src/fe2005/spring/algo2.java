package fe2005.spring;

public class algo2 {

    private static final char EOS = '\\';

    public void Replace(char[] A, char[] S, char[] D, char[] B) {
        int Aidx, Sidx, Didx, Bidx, Idx;
        Aidx = 0;
        Bidx = 0;
        while (A[Aidx] != EOS) {
            if (A[Aidx] == S[0]) {
                Idx = Aidx;
                Sidx = 0;

                do {
                    Sidx = Sidx + 1;
                    Aidx = Aidx + 1;
                } while (A[Aidx] == S[Sidx] && A[Aidx] != EOS);

                if (S[Sidx] == EOS) {
                    Didx = 0;
                    while (D[Didx] != EOS) {
                        B[Bidx] = D[Didx];
                        Didx = Didx + 1;
                        Bidx = Bidx + 1;
                    }
                } else {
                    B[Bidx] = S[0];
                    Aidx = Idx + 1;
                    Bidx = Bidx + 1;
                }
            } else {
                B[Bidx] = A[Aidx];
                Aidx = Aidx + 1;
                Bidx = Bidx + 1;
            }
        }
        B[Bidx] = EOS;
    }

}
