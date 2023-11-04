package org.example;

public class W02PrintingPatterns {
    public static void trianglePattern1(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;++j)
            {
                System.out.print(num + " ");
                num++;
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args){

        trianglePattern1(5);
    }
}
