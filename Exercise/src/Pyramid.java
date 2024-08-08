import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        System.out.print("输入生成的大三角层数：");
        Scanner sc = new Scanner(System.in);
        int level = sc.nextInt();//层数变量
        int add = level -1,reduce = level +1;//递增递减变量。
        for (int i = 1; i <= level; i++) {//层数循环：
            add++;//循环一次递增变量+1。
            reduce--;//循环一次递增变量-1。
            for (int j = 1; j <= 2*level-1; j++) {//输出循环：（循环一次打印一个字符）打印总数和循环条件是小于或等于2*level-1。
                if (i == 1) {//判断如果是第一行：
                    if (j == level) //判断如果输出的字符数等于层数：
                        System.out.print("*");//输出*。
                    else //否则，输出空格。
                        System.out.print(" ");
                }
                else if (i < level && i > 1) {//判断如果不是第一行也不是最后一行：
                    if (j  == add| j == reduce ) //判断输出的字符是否等于递增和递减的变量：
                        System.out.print("*");//如果是输出*。
                    else
                        System.out.print(" ");//否则输出空格。
                }
                else //判断为最后一行：
                    System.out.print("*");//循环输出*，直到跳出循环。
            }
            System.out.println();
        }


    }
}
