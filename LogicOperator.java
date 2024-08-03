public class LogicOperator {
    public static void main(String[] args) {
        //&& and &
        int a = 5;
        int b = 6;
        if(a<1 && ++b==10){
            System.out.println("666");
        }
        System.out.println(b);
//        if(a>1 && ++b<10){
//            System.out.println("666");
//        }
//        System.out.println(b);

        if(a<1 & ++b<10){
            System.out.println("ok");
        }
        System.out.println(b);//变量b被自增了，说明++b被执行。
        //短路与 和 逻辑与 的区别不仅仅在于符号，其底层逻辑是：
        //1短路与（&&）是判断第一个条件的结果为false时则断开后面的判断条件
        //2逻辑与（&）是在第一个判断为false时依然判断第二项、第三项等等。运行速度没有短路与快。

        boolean a1 = a>0;
        boolean b1 = b<15;
        if(a1 || b1 || ++b>15){
            String a2 = String.valueOf(a1);
            String b2 = String.valueOf(b1);
            System.out.println(a2+" "+b2);
            System.out.println("ok");
            System.out.println(b);
        }
        if(a1 | b1 | ++b>15){
            String a2 = String.valueOf(a1);
            String b2 = String.valueOf(b1);
            System.out.println(a2+" "+b2);
            System.out.println("ok");
            System.out.println(b);
        }
        //短路或 和 逻辑或 的区别不仅仅在于符号，其底层逻辑是：
        //1短路或（||）是判断第一个条件的结果为true时则断开后面的判断条件
        //2逻辑或（|）是在第一个判断为true时依然判断第二项、第三项等等。运行速度没有短路与快。
    }
}
