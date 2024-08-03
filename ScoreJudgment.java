import java.util.Scanner;

public class ScoreJudgment {
    public static void main(String[] args) {
        System.out.println("+++++++++欢迎参加歌手大赛+++++++++");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的参加分数，如低于8.0则会被out！");
        double score = sc.nextDouble();
        if (score >= 8.0) {
            System.out.println("恭喜你成功晋级！请选择您的组别，输入男/女");
            char grade = sc.next().charAt(0);
            if (grade == '男') {
                System.out.println("恭喜你成功晋级！请选择您的组别是："+grade+"子组，"+"你的分数是："+score);
            }
            else if (grade == '女'){
                System.out.println("恭喜你成功晋级！请选择您的组别是："+grade+"子组，"+"你的分数是："+score);
            }
            else {
                System.out.println("请选择正确的组别");
            }
        }
        else{
            System.out.println("8分都没有，哪凉快哪呆着去。");

        }
    }
}
