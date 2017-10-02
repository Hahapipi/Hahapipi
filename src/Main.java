import java.util.Scanner;

public class Main {
    //id:106022414
    //name:林虹汶
    //date:20171002
    //purpose:偶奇數轉換
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int v1 =scn.nextInt() % 2;
        if (v1 == 1) {
            System.out.println("奇數");
        }else{
            System.out.println("偶數");
        }
    }
}
