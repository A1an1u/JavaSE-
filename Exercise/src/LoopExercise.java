public class LoopExercise {
    public static void main(String[] args){
        //某人有100,000元，经过一次路口就要缴费，当余额大于50000时缴费余额总数的5%，小于等于50000时每次1000元，求他可以过多少个路口？
        //定义当前余额
        double currentBalance = 100000;
        //定义扣除费用
        double ded = 0f;
        //开始过路口，定义第一个路口：
        int begin = 0;
        while(currentBalance>0){
            if(currentBalance>50000){
                ded = (currentBalance*0.05);
                currentBalance-=ded;//扣钱
                begin++;//增加通过路口次数
                System.out.println("成功通过第"+begin+"个路口，"+"本次扣费"+ded+"元"+"你的余额"+currentBalance);
            }
            else if(currentBalance<=50000){
                if(currentBalance-1000<=0){
                    System.out.println("您的余额剩余"+(float)currentBalance+"不足以抵扣本次过路费用，请充值");
                    break;
                }
                currentBalance -= 1000;
                begin++;
                System.out.println("成功通过第"+begin+"个路口，"+"本次扣费"+1000+"元"+"你的余额"+currentBalance);
            }
        }
        System.out.println("您的余额为："+(float)currentBalance+"通过次数为："+begin);
    }
}
