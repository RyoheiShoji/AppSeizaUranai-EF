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
		capricorn(ef.rankArray.get(9));

		System.out.println("～～～～～～良い一日を！～～～～～～");


	}
	public static void aries(int rank){
		//畠山 拓也さん
	}
	public static void taurus(int rank){
		//大戸 裕貴さん
	switch(rank){
		case 1:
			System.out.println("順位：1位");
			System.out.println("人生に影響を及ぼす人との出会いが");
			break;
		case 2:
			System.out.println("順位：2位");
			System.out.println("幸運の女神が微笑むすてきな一日");
			break;
		case 3:
			System.out.println("順位：3位");
			System.out.println("オープンな態度で過ごすのが大事");
			break;
		case 4:
			System.out.println("順位：4位");
			System.out.println("暮らしの中に新たなものを取り入れると吉");
			break;
		case 5:
			System.out.println("順位：5位");
			System.out.println("胸がときめくシーンに遭遇する日");
			break;
		case 6:
			System.out.println("順位：6位");
			System.out.println("イメージチェンジに適している日");
			break;
		case 7:
			System.out.println("順位：7位");
			System.out.println("胸がときめくようなものを見つけられそう");
			break;
		case 8:
			System.out.println("順位：8位");
			System.out.println("刺激を求めて冒険をしたくなりそう");
			break;
		case 9:
			System.out.println("順位：9位");
			System.out.println("刺激や変化を求める日");
			break;
		case 10:
			System.out.println("順位：10位");
			System.out.println("無理な約束をしないように注意");
			break;
		case 11:
			System.out.println("順位：11位");
			System.out.println("楽しみを見つけて上手に気分転換を");
			break;
		case 12:
			System.out.println("順位：12位");
			System.out.println("今日は外出せず家でゴロゴロしていましょう");
	}
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
	}
	public static void capricorn(int rank){
		//三浦皐一郎
	}
}
