import java.util.Scanner;

public class ForExercise {
    public static void main(String[] args) {
        //题目一
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数，你就知道0-100之间有多少被其整除，并求和：");
        int input = sc.nextInt();
        int i = 0;
        int num1 = 0;
        int num2 = 0;
        for(; i <= 100; ){
            if( i%input == 0){
                System.out.println(i);
                num1++;
                num2 += i;
            }
            i++;
        }
        System.out.println("有以上" + num1 + "个数字可以被" + input + "整除,并且它们的总和是" + num2);
        //题目二
        int sum = sc.nextInt();
        int leftNum=0;
        int rightNum=sum;
        for(;leftNum <= sum;){
            System.out.println(leftNum + " + " + rightNum + " = " + (leftNum+rightNum));
            leftNum++;
            rightNum--;
        }
    }
}
