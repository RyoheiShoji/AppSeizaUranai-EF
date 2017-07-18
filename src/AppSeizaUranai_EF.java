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

		System.out.println("～～～～～～今日の占い～～～～～～");

		aries(rankArray.get(0));
		taurus(rankArray.get(1));
		gemini(rankArray.get(2));
		cancer(rankArray.get(3));
		leo(rankArray.get(4));
		virgo(rankArray.get(5));
		libra(rankArray.get(6));
		scorpio(rankArray.get(7));

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
}
