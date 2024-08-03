public class DoWhileExercise {
    public static void main(String[] args) {
        //do while
        //打印0-100的数
        int beginNum = 1;
        int endNum = 5;
        int sumNum = 0;
        while (beginNum <= endNum) {
            System.out.println(beginNum);
            sumNum += beginNum;
            beginNum++;
        }
        System.out.println(sumNum);

        //计算1-100之间的和


    }
}
