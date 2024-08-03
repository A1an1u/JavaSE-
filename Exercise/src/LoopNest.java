import java.util.Scanner;

public class LoopNest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sumNum = 0;         //每个班的总分
        double allNum = 0;         //整个年级所有班级总分
        int allStudentsNum = 0; //整个年级所有学生人数
        int studentNum = 0;     //每个班级人数
        int classNum = 0;       //年级班级数量
        int qualifiedNum = 0;
        //班级数量少于3开始第一层循环，循环一次，班级数+1，班级数累加到3，后跳出第一层循环
        for(; classNum < 3; classNum++){
            //班级人数少于5人开始第二层循环，循环一次人数+1，人数为5后跳出第二层循环
            for(; studentNum < 5; studentNum++){
                //输入成绩，代码运行从0开始排序，所以classNum和studentNum都需要+1
                System.out.print("输入" + (classNum+1) + "班，第"+(studentNum+1)+"位同学的成绩：");
                double score = sc.nextDouble();
                //将总分累加进变量sumNum
                sumNum += score;
                if(score >= 60){
                    qualifiedNum++;
                }
            }
            //跳出第二层循环后打印一次循环平均分
            System.out.println((classNum+1) + "班平均分为："+sumNum/studentNum);
            //累加一次班级人数到年级人数变量内
            allStudentsNum += studentNum;
            //班级人数清零，重新计数
            studentNum = 0;
            //累加一次班级总分进入年级总分变量内
            allNum += sumNum;
            //班级分数清零，重新计数
            sumNum = 0;
        }
        //跳出第一层循环，计算年级所有人的平均分
        System.out.println("年级" + classNum +"个班平均分为："+allNum/allStudentsNum*classNum+"总及格人数："+qualifiedNum);
    }
}
