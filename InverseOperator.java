public class InverseOperator {
    public static void main(String[] args) {
        //!---->取反操作 true -> false false -> true
        System.out.println(20>10);
        System.out.println(!(20>10));

        //逻辑异或 ^ 两边不同则为true 否则为false

        boolean a = false^true;
        System.out.println(a);
    }
}
