import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class AppSeizaUranai_EF {
	Random ra;
	static ArrayList<Integer> rankArray;
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

		System.out.println("～～～～～～今日の占い～～～～～～");

		aries(rankArray.get(0));
		taurus(rankArray.get(1));
		gemini(rankArray.get(2));
		cancer(rankArray.get(3));
		leo(rankArray.get(4));
		virgo(rankArray.get(5));
		libra(rankArray.get(6));
		scorpio(rankArray.get(7));
		sagittarius(rankArray.get(8));

		System.out.println("～～～～～～良い一日を！～～～～～～");


	}
	public static void aries(int rank){
		//畠山 拓也さん
		String fortune[] = {"", "１位！！！！！ 宝くじを買いましょう。",
				"２位！！！！ なにか楽しいことが起こりそう。。",
				"３位！！！ とてもいい日になりそう。",
				"４位！！ 友人から何かもらえそう。",
				"５位！ なにか良いことが起こりそう。",
				"６位 いつもと変わらない日になりそう。",
				"７位 少し嫌なことがありそう。",
				"８位 辛いことが起こりそう。",
				"９位 悲しいことが起こりそう。",
				"１０位 外出の際は気を付けて。",
				"１１位 夜道に気を付けて。",
				"１２位 ｱｱｱｱｱｱｱｱｱｱｱｱ!!!!!"	};

		System.out.println("おひつじ座のあなたは" + fortune[rank]);
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
	}
}
