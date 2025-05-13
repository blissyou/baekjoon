public class main {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};

        increase(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    static void increase(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i]++;
        }
    }
}
