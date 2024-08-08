public class AddLoop {
    //求1-100的和，在求出的和大于当前数20时，当前数的值
    public static void main(String[] args) {
        int value = 0;
        int i = 1;
        for (; i <= 100; i++) {
            value += i;
            System.out.println(i+"=>"+value);
            if (value-20>=i) {
                break;
            }
        }
        System.out.println(value+"大于"+i+"相差"+"20");
    }
}
