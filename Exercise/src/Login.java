import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String username = "丁真", password = "123456";
        int ordinalNum = 3;
        Scanner sc = new Scanner(System.in);
        for (int i = 1;i <= ordinalNum;i++){
            System.out.print("请输入用户名：");
            String inputUsername = sc.next();
            if(inputUsername.equals(username)){
                System.out.print("用户名验证通过，请输入用户名【丁真】的密码：");
                String inputPassword = sc.next();
                if (inputPassword.equals(password)){
                    System.out.print("登录成功");
                    break;
                }
                System.out.println("密码输入错误，你还有"+(ordinalNum-i)+"次数机会");
            }
            else{
                System.out.println(inputUsername+"用户名输入错误，你还有"+(ordinalNum-i)+"次数机会");
            }
        }
    }
}
