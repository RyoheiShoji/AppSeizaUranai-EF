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

		System.out.println("``````¡“ú‚Ìè‚¢``````");

		aries(rankArray.get(0));
		taurus(rankArray.get(1));
		gemini(rankArray.get(2));
		cancer(rankArray.get(3));
		leo(rankArray.get(4));
		virgo(rankArray.get(5));
		libra(rankArray.get(6));
		scorpio(rankArray.get(7));

		System.out.println("``````—Ç‚¢ˆê“ú‚ð!``````");


	}
	public static void aries(int rank){
		//”©ŽR ‘ñ–ç‚³‚ñ
	}
	public static void taurus(int rank){
		//‘åŒË —T‹M‚³‚ñ
	}
	public static void gemini(int rank){
		//”Ô‰® ãÄ‚³‚ñ
	}
	public static void cancer(int rank){
		//¯Ži
	}
	public static void leo(int rank){
		//ìŽR Ã–í‚³‚ñ
	}
	public static void virgo(int rank){
		//ã—Ž­ •à‚³‚ñ
	}
	public static void libra(int rank){
		//ˆÉ¨—El‚³‚ñ
	}
	public static void scorpio(int rank){
		//ˆÉ“¡ŠC¯‚³‚ñ
	}
}
