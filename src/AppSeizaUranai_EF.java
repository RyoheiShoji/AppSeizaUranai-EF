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
	}
	public static void taurus(int rank){
		//大戸 裕貴さん
	}
	public static void gemini(int rank){
		//番屋 翔さん
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
