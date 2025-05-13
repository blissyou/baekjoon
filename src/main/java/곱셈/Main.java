package 곱셈;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Long A = Long.parseLong(st.nextToken());
        Long B = Long.parseLong(st.nextToken());
        Long C = Long.parseLong(st.nextToken());

        System.out.println(solve(A, B, C));

    }
    public static Long solve(Long A , Long B , Long C) {
        if (B == 1){
            return A%C;
        }
        else{
            Long half = solve(A , B/2 ,C);
            if(B % 2 == 1){
                return (half*half%C) * A%C;
            }
            return half*half%C;
        }
    }
}
