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
			int num = ra.nextInt(9);
			while(rankArray.contains(num)){
				num = ra.nextInt(9);
			}
			rankArray.add(num);
		}
	}
	public static void main(String[] args){
		AppSeizaUranai_EF ef = new AppSeizaUranai_EF();
		System.out.println("～～～～～～今日の占い～～～～～～");
		System.out.println("");

		for(int i = 0;i < 10;i++){
			randomfortune(ef.rankArray.get(i),i);
		}

		System.out.println("～～～～～～良い一日を！～～～～～～");


	}
	public static void randomfortune(int arr,int cou){
		switch(arr){
			case 0:
				aries(cou);
				break;
			case 1:
				taurus(cou);
				break;
			case 2:
				gemini(cou);
				break;
			case 3:
				cancer(cou);
				break;
			case 4:
				leo(cou);
				break;
			case 5:
				virgo(cou);
				break;
			case 6:
				libra(cou);
				break;
			case 7:
				scorpio(cou);
				break;
			case 8:
				sagittarius(cou);
				break;
			case 9:
				capricorn(cou);
				break;
		}
		
	}
	public static void aries(int rank){
		//畠山 拓也さん
		System.out.println("おひつじ座の貴方は");
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
		System.out.println("");
	}
	public static void taurus(int rank){
		//大戸 裕貴さん
		System.out.println("おうし座の貴方は");
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
		System.out.println("");
	}
	public static void gemini(int rank){
		//番屋 翔さん
		System.out.println("ふたご座の貴方は第 " + rank + " 位!!!");
		if(rank == 1){
			System.out.println("恋のビッグチャンス到来でモテモテ。気になる人には積極的なアピールを");
			System.out.println("ラッキーポイント"+ "インテリア雑貨ショップ");
		}
		else if(rank == 2){
			System.out.println("ユニークな発想で注目の的。迷わず提案してチャレンジ");
			System.out.println("アイスレモンティー");
		}
		else if(rank == 3){
			System.out.println("好きな人とバッタリ遭遇。古風な考え方で好感度↑");
			System.out.println("フランスの曲");
		}
		else if(rank == 4){
			System.out.println("ステキな文章がひらめく日。手書きの手紙がポイント！");
			System.out.println("演歌");
		}
		else if(rank == 5){
			System.out.println("新たな道が開ける予感♪好奇心を持つことが大切");
			System.out.println("ミネラルウオーター");
		}
		else if(rank == 6){
			System.out.println("うれしい知らせがありそう。電話は早めに取るのが正解");
			System.out.println("ベランダ");
		}
		else if(rank == 7){
			System.out.println("過去のトラブルで大混乱。課題を洗い出して即解決");
			System.out.println("経済ニュース");
		}
		else if(rank == 8){
			System.out.println("人間関係が悪化して孤立。素直に気持ちを表現して");
			System.out.println("大判のハンカチ");
		}
		else if(rank == 9){
			System.out.println("口だけの約束で評価↓。有言実行の姿勢が大事");
			System.out.println("雑誌");
		}
		else if(rank == 10){
			System.out.println("知識が足りずにアタフタ。勉強をやり直して再挑戦");
			System.out.println("無地のノート");
		}
		else if(rank == 11){
			System.out.println("何をやっても空回りして疲れ気味…おいしいものを食べてリフレッシュ");
			System.out.println("動画サイト");
		}
		else if(rank == 12){
			System.out.println("物事を決められずイライラ。迷ったときは時間をおいてみて！");
			System.out.println("白い便箋");
		}
		System.out.println("");
	}
	public static void cancer(int rank){
		//庄司
		System.out.println("かに座の貴方は第 " + rank + " 位");
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
		System.out.println("");
	}
	public static void leo(int rank){
		System.out.print(" しし座の順位は");
	switch(rank){
	case 1:
		System.out.println("1位だと思います。\t\n多分星５が１％排出の某ソシャゲで星5が出るんじゃないかと思います。");
		break;
	case 2:
		System.out.println("2位だと思います。\t\n多分5vの個体値のポケモンが生まれるかと思います。");
		break;
	case 3:
		System.out.println("3位だと思います。\t\n多分ランクマで超越ができると思います。");
		break;
	case 4:
		System.out.println("4位だと思います。\t\n多分この町がゾンビだらけになっても生き残れると思います。");
		break;
	case 5:
		System.out.println("5位だと思います。\t\n多分次回予告が発生すると思います。");
		break;
	case 6:
		System.out.println("6位だと思います。\t\n多分某パズルゲームでダイヤの卵が排出されると思います。");
		break;
	case 7:
		System.out.println("7位だと思います。\t\n多分某0キロメートルでヒロインの変顔が観れると思います。");
		break;
	case 8:
		System.out.println("8位だと思います。\t\n多分幻のDT（佐藤大地）に会えると思います。");
		break;
	case 9:
		System.out.println("9位だと思います。\t\n多分twitterで殺害予告されると思います。");
		break;
	case 10:
		System.out.println("10位だと思います。\t\n多分黒塗りの車にぶつかると思います。");
		break;
	case 11:
		System.out.println("11位だと思います。\t\n多分ブルーベリー色の鬼に追いかけられると思います。");
		break;
	case 12:
		System.out.println("12位だと思います。\t\n多分死にます。");
		break;
	}
		System.out.println("");
		//作山 静弥さん
	}
	public static void virgo(int rank){
		//上女鹿 歩さん
		System.out.println("おとめ座の貴方は第 " + rank + " 位!!!");
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
		System.out.println("");
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
		System.out.println("");
	}
		public static void scorpio(int rank){
		if(rank == 1) {
			System.out.println(rank + "位です。");
			System.out.println("ご機嫌");
		}else if(rank == 2){
			System.out.println(rank + "位です。");
			System.out.println("良い一日です");
		}else if(rank == 3){
			System.out.println(rank + "位です。");
			System.out.println("いつも通り");
		}else if(rank == 4){
			System.out.println(rank + "位です。");
			System.out.println("早く帰ろう");
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
			System.out.println("に気を付けよう");
		}else if(rank == 9){
			System.out.println(rank + "位です。");
			System.out.println("安全確認に徹しよう");
		}else if(rank == 10){
			System.out.println(rank + "位です。");
			System.out.println("事故にきをつけて");
		}else if(rank == 11){
			System.out.println(rank + "位です。");
			System.out.println("外出は控えよう");
		}else if(rank == 12){
			System.out.println(rank + "位です。");
			System.out.println("何もしない");
		}
			System.out.println("");
	}
	public static void sagittarius(int rank){
		//下平啓太さん
		System.out.println("いて座の貴方は第 " + rank + " 位!!!");
		System.out.println("金運アップ、仕事もうまくいきそう！!");
		System.out.println("");
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
		System.out.println("");
	}
}

