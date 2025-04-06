package 더하기사이클;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> array = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int copy = N;
        int cnt =0;
        do{
            N = ((N%10)*10) + (((N/10) + (N%10))%10);
            cnt ++;
        }while(N != copy);
        System.out.println(cnt);
    }
}
