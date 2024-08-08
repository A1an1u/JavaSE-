public class Return {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            if(i  == 5){
                System.out.println(i);
                return;//return放在main方法中会直接结束程序。
            }
            System.out.println(i);
        }
    }
}
