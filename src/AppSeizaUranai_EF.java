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
		switch(rank){
		case 1:
			System.out.println("新たな夢や希望に向けて前進");
			System.out.println("開運おまじない");
			System.out.println("人に大切な相談をする前には、鏡の前で一番いい笑顔をしてから話し始めて。");
			break;
		case 2:
			System.out.println("お気に入りが増えて心躍る日に");
			System.out.println("開運おまじない");
			System.out.println("「だって」「でも」と言いそうになったら、5秒待ってから、発言してみて。");
			break;
		case 3:
			System.out.println("いつもと違う行動で勢いが生まれる日");
					System.out.println("開運おまじない");
					System.out.println("通勤・通学の電車。今日は後ろから3両目に乗るとラッキー。");
					break;
		case 4:
			System.out.println("パターンをくずすと新鮮な気分に");
			System.out.println("開運おまじない");
			System.out.println("疎遠になってしまった人に手紙を書きましょう。顔を思い浮かべながら書くとスムーズに。");
			break;

		case 5:
			System.out.println("向上心旺盛な人から刺激を受けそう");
			System.out.println("開運おまじない");
			System.out.println("左手をおでこにあてて、その上を握った右手で10回軽くたたいてみて。");
		break;

		case 6:
			System.out.println("ルールに縛られず自由に行動を");
			System.out.println("開運おまじない");
			System.out.println("いつも誘ったことのない人をひとりだけ誘って、一緒に食事に行きましょう。");
			break;
		case 7:
			System.out.println("状況が二転三転し、落ち着かない日");
			System.out.println("開運おまじない");
			System.out.println("枕もとに水晶を置き、北の方向に頭を向けて眠りましょう。クールな思考に！");
			break;
		case 8:
			System.out.println("新しいエリアに目が向く日です");
			System.out.println("開運おまじない");
			System.out.println("今日は、通勤や通学で利用している駅の違う出口から出るか、駅をひと回りしてみましょう。");
			break;
		case 9:
			System.out.println("新境地を開く展開がありそう");
			System.out.println("開運おまじない");
			System.out.println("月を見ながら5回まばたきを。月のパワーを取り込むおまじない。疲れ目も解消されます。");
			break;
		case 10:
			System.out.println("用事を抱え込みすぎないよう注意");
			System.out.println("開運おまじない");
			System.out.println("毎日のように飲んだり食べたりしている好物を、今日は断ってみましょう。リフレッシュします");
			break;
		case 11:
			System.out.println("焦って答えを出す必要はなし");

			System.out.println("開運おまじない");
			System.out.println("家を出る前に、コップ半分の水にひとつまみの塩を入れて飲みましょう。");
			break;
		case 12:
			System.out.println("すべきことに優先順位をつけて");
			System.out.println("開運おまじない");
			System.out.println("濃いめのコーヒーにスプーン1杯のハチミツを入れて飲みましょう。");
			break;
		}

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
		if(rank == 1) {
			System.out.println(rank + "位です。");
			System.out.println("ご機嫌用");
		}else if(rank == 2){
			System.out.println(rank + "位です。");
			System.out.println("いい日ですね");
		}else if(rank == 3){
			System.out.println(rank + "位です。");
			System.out.println("少しいい日です");
		}else if(rank == 4){
			System.out.println(rank + "位です。");
			System.out.println("事故に気を付けて");
		}else if(rank == 5){
			System.out.println(rank + "位です。");
			System.out.println("けがをするかも");
		}else if(rank == 6){
			System.out.println(rank + "位です。");
			System.out.println("人混みは避けよう");
		}else if(rank == 7){
			System.out.println(rank + "位です。");
			System.out.println("突然雨がふるかも");
		}else if(rank == 8){
			System.out.println(rank + "位です。");
			System.out.println("友達には気を付けよう");
		}else if(rank == 9){
			System.out.println(rank + "位です。");
			System.out.println("運転を避けよう");
		}else if(rank == 10){
			System.out.println(rank + "位です。");
			System.out.println("上に気を付けて");
		}else if(rank == 11){
			System.out.println(rank + "位です。");
			System.out.println("外出は控えよう");
		}else if(rank == 12){
			System.out.println(rank + "位です。");
			System.out.println("何もしない日にしよう");
		}
	}
	public static void scorpio(int rank){
		//伊藤海星さん
	}
	public static void sagittarius(int rank){
		//下平啓太さん
	}
	public static void capricorn(int rank){
		//三浦皐一郎
		System.out.println("ヤギ座の順位は ");

		if(rank == 1) {
			System.out.println(rank + "位です。");
			System.out.println("今日も良い一日を");
		}else if(rank == 2){
			System.out.println(rank + "位です。");
			System.out.println("まぁ、良い一日です");
		}else if(rank == 3){
			System.out.println(rank + "位です。");
			System.out.println("そこそこですねぇ");
		}else if(rank == 4){
			System.out.println(rank + "位です。");
			System.out.println("早く帰って寝よう");
		}else if(rank == 5){
			System.out.println(rank + "位です。");
			System.out.println("微妙");
		}else if(rank == 6){
			System.out.println(rank + "位です。");
			System.out.println("怪我に気を付けて");
		}else if(rank == 7){
			System.out.println(rank + "位です。");
			System.out.println("雷に気を付けよう");
		}else if(rank == 8){
			System.out.println(rank + "位です。");
			System.out.println("住所特定に気を付けよう");

		}else if(rank == 9){
			System.out.println(rank + "位です。");
			System.out.println("安全確認に徹しよう");
		}else if(rank == 10){
			System.out.println(rank + "位です。");
			System.out.println("事故にきをつけて");
			System.out.println("炎上にきをつけて");
		}else if(rank == 11){
			System.out.println(rank + "位です。");
			System.out.println("外出は控えよう");
		}else if(rank == 12){
			System.out.println(rank + "位です。");
			System.out.println("早く帰って寝よう");
		}
	}


