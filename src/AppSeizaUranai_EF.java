import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class AppSeizaUranai_EF {
	Random ra;
	ArrayList<Integer> rankArray;
	Scanner sc;

	public AppSeizaUranai_EF(){
		ra = new Random();
		rankArray = new ArrayList<Integer>();
		sc = new Scanner(System.in);

		for(int i = 0;i < 9;i++){
			int num = ra.nextInt(12) + 1;
			while(rankArray.contains(num)){
				num = ra.nextInt(12) + 1;
			}
			rankArray.add(num);
		}
	}
	public static void main(String[] args){
		AppSeizaUranai_EF ef = new AppSeizaUranai_EF();
		System.out.println("～～～～～～今日の占い～～～～～～");

		aries(ef.rankArray.get(0));
		taurus(ef.rankArray.get(1));
		gemini(ef.rankArray.get(2));
		cancer(ef.rankArray.get(3));
		leo(ef.rankArray.get(4));
		virgo(ef.rankArray.get(5));
		libra(ef.rankArray.get(6));
		scorpio(ef.rankArray.get(7));
		sagittarius(ef.rankArray.get(8));

		System.out.println("～～～～～～良い一日を！～～～～～～");


	}
	public static void aries(int rank){
		//畠山 拓也さん
	}
	public static void taurus(int rank){
		//大戸 裕貴さん
	}
	public static void gemini(int rank){
		//番屋 翔さん
	}
	public static void cancer(int rank){
		//庄司
	}
	public static void leo(int rank){
		//作山 静弥さん
	}
	public static void virgo(int rank){
		//上女鹿 歩さん
	}
	public static void libra(int rank){
		//伊勢勇人さん
	}
	public static void scorpio(int rank){
		//伊藤海星さん
	}
	public static void sagittarius(int rank){
		//下平啓太さん
		System.out.println("いて座");
		System.out.println("金運アップ、仕事もうまくいきそう！!");
	}
}
