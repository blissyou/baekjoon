package 터렛;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x1=0;
        int y1=0;
        int r1=0;
        int x2=0;
        int y2=0;
        int r2=0;
        int n = Integer.parseInt(br.readLine());
        int[] result = new int[n];
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            r1 = Integer.parseInt(st.nextToken());

            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            r2 = Integer.parseInt(st.nextToken());

            int distance = (int)(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));

            int r = (int)(Math.pow(r1+r2,2));
            int rm = (int)(Math.pow(r1-r2,2));
            if(r1==r2 && x1==x2 && y1==y2) {
                System.out.println(-1);
            }
            else if(distance == rm || distance == r) {
                System.out.println(1);
            }
            else if (rm < distance && distance < r) {
                System.out.println(2);
            }
            else{
                System.out.println(0);
            }
        }



    }
}
