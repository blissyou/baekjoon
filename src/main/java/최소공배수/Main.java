package 최소공배수;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int[] a = new int[N];
        int[] b = new int[N];
        int[] res = new int[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            a[i] = Integer.parseInt(st.nextToken());

            b[i] = Integer.parseInt(st.nextToken());

            res[i] =a[i]*b[i]/gcd(a[i],b[i]);

        }
        for (int i = 0; i < N; i++) {
            System.out.println(res[i]);
        }
    }

    public static int gcd(int a, int b){
            while (b != 0){
                int r = a % b;
                a = b;
                b = r;
            }
            return a;
    }
}
