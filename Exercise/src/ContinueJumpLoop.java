public class ContinueJumpLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            i++;
            if (i  == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
