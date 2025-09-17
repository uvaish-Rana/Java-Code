package Statement;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("enter number:");
        int num=inp.nextInt();
        if(num%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
