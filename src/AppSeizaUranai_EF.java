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

		for(int i = 0;i < 8;i++){
			int num = ra.nextInt(12) + 1;
			while(rankArray.contains(num)){
				num = ra.nextInt(12) + 1;
			}
			rankArray.add(num);
		}
	}
	public static void main(String[] args){

		System.out.println("〜〜〜〜〜〜今日の占い〜〜〜〜〜〜");

		aries(rankArray.get(0));
		taurus(rankArray.get(1));
		gemini(rankArray.get(2));
		cancer(rankArray.get(3));
		leo(rankArray.get(4));
		virgo(rankArray.get(5));
		libra(rankArray.get(6));
		scorpio(rankArray.get(7));

		System.out.println("〜〜〜〜〜〜良い一日を!〜〜〜〜〜〜");


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

		System.out.println("おひつじ座のあなたは" + fortune);
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
		
		System.out.println("おとめ座の貴方は第 " + rank + " 位!!!";
		switch(rank) {
			case 1:
				System.out.println("マンションを一棟買っちゃおう");
				System.out.println("ラッキーアイテム : ペプシ・コーラ");
				break;
			case 2:
				System.out.println("目標に少しだけ近づくかも...?");
				System.out.println("ラッキーアイテム : コカ・コーラ");
				break;
			case 3:
				System.out.println("５０円が道端に落ちてるかも！交番へ");
				System.out.println("ラッキーアイテム : 鉢にさす緑のヤクルトみたいなやつ");
				break;
			case 4:
				System.out.println("全身黄色コーデで金運アップ");
				System.out.println("ラッキーアイテム : 冷やし中華大盛");
				break;
			case 5:
				System.out.println("半日ラーメンを食べて歩こう");
				System.out.println("ラッキーアイテム : 煮干しラーメン");
				break;
			case 6:
				System.out.println("岡山県産白桃を食べると運気アップ...?");
				System.out.println("ラッキーアイテム : 岡山県産白桃");
				break;
			case 7:
				System.out.println("新しいことに挑戦してみよう");
				System.out.println("ラッキーアイテム : ノートパソコン");
				break;
			case 8:
				System.out.println("今日はアツゥイから水分補給を忘れずに");
				System.out.println("ラッキーアイテム : 四川麻婆豆腐");
				break;
			case 9:
				System.out.println("好きなことで食べていこう！多分うまくいくかも...");
				System.out.println("ラッキーアイテム : LUMIX GH5");
				break;
			case 10:
				System.out.println("今日は早めに寝よう");
				System.out.println("ラッキーアイテム : おふとぅんともふもふ毛布");
				break;
			case 11:
				System.out.println("今日明日は学校を休んだほうがいいかも");
				System.out.println("ラッキーアイテム : だるま");
				break;
			case 12:
				System.out.println("どうあがいても絶望");
				System.out.println("ラッキーアイテム : ヌンチャク");
				break;
		}
	}
	public static void libra(int rank){
		//伊勢勇人さん
	}
	public static void scorpio(int rank){
		//伊藤海星さん
	}
}
