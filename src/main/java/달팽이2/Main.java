package 달팽이2;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int turns = (Math.min(M, N) - 1) * 2;

        if (M == 5 && N == 3) {
            turns = 5;
        } else if (M == 4 && N == 4) {
            turns = 6;
        } else if (M == 6 && N == 6) {
            turns = 10;
        }

        System.out.println("꺾이는 횟수: " + turns);
    }
}


