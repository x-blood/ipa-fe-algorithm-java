package fe2019.spring;

public class main2 {

    public static void main(String[] args) {
        System.out.println("[DEBUG]Starting 2009 Spring No.2");
        algo algo = new algo();
        char[] Text = new char[]{'0', 'A', 'A', 'C', 'B', 'B', 'A', 'A', 'C', 'A', 'B', 'A', 'B', 'A', 'B'};
        char[] Pat = new char[]{'0', 'A', 'C', 'A', 'B', 'A', 'B'};
        int result = algo.BitapMatch(Text, Pat);
        System.out.println("[DEBUG]result：" + result);
        System.out.println("[DEBUG]Finished 2009 Spring No.2");
    }

}
