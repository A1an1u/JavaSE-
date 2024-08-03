import java.util.Scanner;

public class DoWhileExercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a = true;
        boolean lifeState = true;
        int blood = 20;
        int sumNum = 0;
        do {
            System.out.println("老张问：还不还钱【y/n】?");
            char answer = sc.next().charAt(0);
//            if (answer == 'n') {
//                System.out.println("你他妈找死！吃我一鞭腿！！！");
//            } else if (answer == 'y') {
//                System.out.println("算你小子识相！！！");
//                a = false;
//            }
//            else {
//                System.out.println("别耍小聪明！快说还不还钱！！");
//            }
            switch (answer) {
                case 'y':
                    System.out.println("【老张】算你小子识相！！！");
                    a = false;
                    break;
                case 'n':
                    System.out.println("【老张】你TM找死！吃我一鞭腿！！！");
                    sumNum ++;
                    blood--;
                    if(sumNum < 5 ){
                        System.out.println("【系统提示】你受到了"+sumNum+"鞭腿伤害");
                    }else if(sumNum >= 5 && sumNum < 10) {
                        System.out.println("【系统提示】你已经受到了"+sumNum+"鞭腿伤害，快打120急救！！！");
                    }
                    else {
                        System.out.println("【系统提示】【极度危险】你已经受到了"+sumNum+"鞭腿伤害，快叫如来佛祖！！！");
                    }
                    if (blood <= 0) {
                        System.out.println("【系统提示】┭┮﹏┭┮你被活活打死啦！！！");
                        lifeState = false;
                    }
                    break;
                default:
                    System.out.println("【老张】别耍小聪明！快说还不还钱！！");
            }
        }while(lifeState&&a);
        if(sumNum >= 5 && lifeState){
            System.out.println("【系统提示】大哥你真头铁，挨了"+sumNum+"鞭腿才还钱");
        }
        else if(sumNum !=0 &&sumNum < 5){
            System.out.println("【系统提示】识时务者为俊杰，挨"+sumNum+"鞭腿就还钱");
        }
        else if(sumNum == 0){
            System.out.println("【系统提示】原来是个软骨头，别人还没动手你就跪了~");
        } else if (!lifeState) {
            System.out.println("【系统提示】挨了"+sumNum+"鞭腿被打死也不还钱，系统授予你【不屈英魂】专属称号");
            System.out.println("【系统提示】获得 【不屈英魂】专属称号 * 1");
            System.out.println("【系统提示】任务：宁死不屈，宁愿被打死也不还钱 1/1  【完成】");
            System.out.println("【系统提示】============游戏结束=====================");






        }


    }
}
