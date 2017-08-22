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

		System.out.println("～～～～～～良い一日を!～～～～～～");


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


		//伊藤海星さん
		}
	}


