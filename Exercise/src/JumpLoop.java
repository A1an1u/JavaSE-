public class JumpLoop {
    public static void main(String[] args) {
        int i = 1;
        for(; i <= 500000; i++){
            int value =(int)(Math.random()*100000);
            System.out.println((char)value);
            System.out.println(value);

            if(value == '陆'){
                System.out.println(i+"次");
                break;
            }
        }
        if(i > 500000){
            System.out.println("抽奖结束你没有抽中");
        }
        else {
            System.out.println("恭喜哦！！抽中97");

        }
    }
}
