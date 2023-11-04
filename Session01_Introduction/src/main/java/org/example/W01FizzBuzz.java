package org.example;

public class W01FizzBuzz {
    public static void showFizzBuzz(int n){
        for(int i=1;i<=n;++i){
            int ok=0;
            if(i%3==0) {
                System.out.print("Fizz");
                ok=1;
            }
            if(i%5==0) {
                System.out.print("Buzz");
                ok = 1;
            }
            if (ok==0) System.out.print(i);
            System.out.print('\n');
        }
        
    }

    public static void main(String[] args){

        showFizzBuzz( 100);
    }
}
