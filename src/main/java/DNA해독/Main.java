package DNA해독;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    static int getIndex(char c){
        switch (c){
            case 'A': return 0;
            case 'G': return 1;
            case 'C': return 2;
            case 'T': return 3;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        //염기서열 표를 2차원 배열로 구현
        char[][] table = {
                {'A','C','A','G'},
                {'C','G','T','A'},
                {'A','T','C','G'},
                {'G','A','G','T'}
        };

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();

        //염기서열 표를와 유저가 넣은 input값을 뒤에서부터 대조후 문자 변환
        for(int i= arr.length-1; i>0; i--){
            int row = getIndex(arr[i-1]);
            int col = getIndex(arr[i]);
            char newChar = table[row][col];
            arr[i-1] = newChar;
        }
        //결과 출력
        System.out.println(arr[0]);

    }


}
