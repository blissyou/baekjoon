package 큐;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] que = new int[10001];
    static int first = 0;
    static int last = 0;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s) {
                case "push" :
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    sb.append(pop()).append("\n");
                    break;
                case "size" :
                    sb.append(size()).append("\n");
                    break;
                case "empty" :
                    sb.append(empty()).append("\n");
                    break;
                case "front" :
                    sb.append(front()).append("\n");
                    break;
                case "back" :
                    sb.append(back()).append("\n");
                    break;


            }
        }
        System.out.println(sb);

    }
    public static void push(int X) {
        que[last] = X;
        last++;
    }
    public static int pop(){
        if(last - first== 0){
            return -1;
        }
        else{
            int P = que[first];
            first++;
            return P;
        }
    }
    public static int size(){
        return last - first;
    }
    public static int empty(){
        if(last - first == 0){
            return 1;
        }
        else {
            return 0;
        }
    }
    public static int front(){
        if(last - first == 0){
            return -1;
        }
        else {
            return que[first];
        }
    }
    public static int back(){
        if(last - first == 0){
            return -1;
        }
        else {
            return que[last-1];
        }
    }
}
