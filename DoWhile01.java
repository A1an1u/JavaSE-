public class DoWhile01 {
    public static void main(String[] args) {
        //do....while 结构
        int i = 11;
        do {
            //首先执行一边do结构内的代码块
            //再判断while()内的表达式
            System.out.println(i);
            i++;
        }while (i <= 10);//如果为false，则返回执行do内的代码块进行变量迭代，为true，则跳出循环。
        System.out.println("Exit do and while...");
    }
}
