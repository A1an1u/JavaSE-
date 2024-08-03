public class WhileExercise {
    public static void main(String[] args) {
        int i = 0, j = 5;
        while (i <= 5) {
            System.out.println(i + "+" + (j-i) + "=" + j);
            i++;
        }
        i = 20;
        //打印20~200之间的偶数
        while(i>=20&&i<=200){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
