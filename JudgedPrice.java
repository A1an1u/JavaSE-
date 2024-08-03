import java.util.Scanner;
public class JudgedPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入月份：");
        int month = sc.nextInt();
        System.out.println("输入年龄：");
        int age = sc.nextInt();
        boolean isJudged = month >= 4 && month <= 10;
        if(isJudged && age>=18 && age<=60)
            System.out.println("你的票价为60元");
        else if(isJudged && age<18)
            System.out.println("你的票价为30元");
        else if(isJudged && age>=60)
            System.out.println("你的票价为20元");
        else if(!isJudged && age>=18 && age<=60)
            System.out.println("你的票价为40元");
        else if(!isJudged && age>=60 || !isJudged && age<=18)
            System.out.println("你的票价为20元");
    }
}