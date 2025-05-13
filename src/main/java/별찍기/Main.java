package 별찍기;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int j = 0;

        for(int i = 0 ; i < n ; i++){
            System.out.print("*");
            for(; j <= n ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
