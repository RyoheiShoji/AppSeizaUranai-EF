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
	}
	public static void gemini(int rank){
		//番屋 翔さん
	}
	public static void cancer(int rank){
		//庄司
	}
	public static void leo(int rank){
	switch(rank){
	case 1:
		System.out.println("今回の運勢は1位だと思います。\t\n多分星５が１％排出の某ソシャゲで星5が出るんじゃないかと思います。");
		break;
	case 2:
		System.out.println("今回の運勢は2位だと思います。\t\n多分5vの個体値のポケモンが生まれるかと思います。");
		break;
	case 3:
		System.out.println("今回の運勢は3位だと思います。\t\n多分ランクマで超越ができると思います。");
		break;
	case 4:
		System.out.println("今回の運勢は4位だと思います。\t\n多分この町がゾンビだらけになっても生き残れると思います。");
		break;
	case 5:
		System.out.println("今回の運勢は5位だと思います。\t\n多分次回予告が発生すると思います。");
		break;
	case 6:
		System.out.println("今回の運勢は6位だと思います。\t\n多分某パズルゲームでダイヤの卵が排出されると思います。");
		break;
	case 7:
		System.out.println("今回の運勢は7位だと思います。\t\n多分某0キロメートルでヒロインの変顔が観れると思います。");
		break;
	case 8:
		System.out.println("今回の運勢は8位だと思います。\t\n多分幻のDT（佐藤大地）に会えると思います。");
		break;
	case 9:
		System.out.println("今回の運勢は9位だと思います。\t\n多分twitterで殺害予告されると思います。");
		break;
	case 10:
		System.out.println("今回の運勢は10位だと思います。\t\n多分黒塗りの車にぶつかると思います。");
		break;
	case 11:
		System.out.println("今回の運勢は11位だと思います。\t\n多分ブルーベリー色の鬼に追いかけられると思います。");
		break;
	case 12:
		System.out.println("今回の運勢は12位だと思います。\t\n多分死にます。");
		break;
}
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
