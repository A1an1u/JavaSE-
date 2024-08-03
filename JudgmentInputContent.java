import java.util.Scanner;

public class JudgmentInputContent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("输入年龄：");
//        int age = sc.nextInt();
//        if (age >= 18) {
//            System.out.println("死刑");
//        }
//        else{
//            System.out.println("无期徒刑");
//        }
//        double d1 = sc.nextDouble();
//        double d2 = sc.nextDouble();
//        boolean b1 = d1 > 10.0;
//        boolean b2 = d2 > 20.0;
//        if (b1 && b2) {
//            System.out.println(d1+d2);
//        }
//        else{
//            System.out.println("不符合规则");
//        }
//        int a = sc.nextInt(),b = sc.nextInt(),c = a + b;
//        System.out.println(c);
//        boolean b1= c % 3 == 0,b2= c % 5 == 0;
//        if (b1 && b2){
//            System.out.println("可以同时被3和5整除");
//        }
//        else{
//            System.out.println("这两个数不可以同时被3和5整除");
//        }
//        System.out.println("输入年份来判断是否为闰年:");
//        int year = sc.nextInt();
//        boolean isJudged = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
//        if (isJudged) {
//            System.out.println("该年份是闰年！");
//        }
//        else{
//            System.out.println("该年份不是闰年");
//        }
        System.out.println("输入马宝国的信用积分:");
        int a = sc.nextInt();
        if(a==100){
            System.out.println("信用等级:⭐⭐⭐⭐⭐");
        }
        else if(a<100 && a>=80){
            System.out.println("信用等级:⭐⭐⭐⭐");

        }
        else if(a<80 && a>=60){
            System.out.println("信用等级:⭐⭐⭐");

        }else{
            System.out.println("信用等级:⭐");

        }
    }
}
