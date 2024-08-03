import java.util.Scanner;

public class JudgedWeeks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char days = sc.next().charAt(0);
        switch (days) {
            case 'a':
                System.out.println("星期一");
                break;
            case 'b':
                System.out.println("星期二");
                break;
            case 'c':
                System.out.println("星期三");
                break;
            case 'd':
                System.out.println("星期四");
                break;
            case 'e':
                System.out.println("星期五");
                break;
            case 'f':
                System.out.println("星期六");
                break;
            case 'g':
                System.out.println("星期日");
                break;
            default:
                System.out.println("请输入正确代码");
        }
    }

}
