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
		switch(rank){
			case 1:
				System.out.println("‡ˆÊF1ˆÊ");
				System.out.println("l¶‚É‰e‹¿‚ð‹y‚Ú‚·l‚Æ‚Ìo‰ï‚¢‚ª");
				break;
			case 2:
				System.out.println("‡ˆÊF2ˆÊ");
				System.out.println("K‰^‚Ì—_‚ª”÷Î‚Þ‚·‚Ä‚«‚Èˆê“ú");
				break;
			case 3:
				System.out.println("‡ˆÊF3ˆÊ");
				System.out.println("ƒI[ƒvƒ“‚È‘Ô“x‚Å‰ß‚²‚·‚Ì‚ª‘åŽ–");
				break;
			case 4:
				System.out.println("‡ˆÊF4ˆÊ");
				System.out.println("•é‚ç‚µ‚Ì’†‚ÉV‚½‚È‚à‚Ì‚ðŽæ‚è“ü‚ê‚é‚Æ‹g");
				break;
			case 5:
				System.out.println("‡ˆÊF5ˆÊ");
				System.out.println("‹¹‚ª‚Æ‚«‚ß‚­ƒV[ƒ“‚É‘˜‹ö‚·‚é“ú");
				break;
			case 6:
				System.out.println("‡ˆÊF6ˆÊ");
				System.out.println("ƒCƒ[ƒWƒ`ƒFƒ“ƒW‚É“K‚µ‚Ä‚¢‚é“ú");
				break;
			case 7:
				System.out.println("‡ˆÊF7ˆÊ");
				System.out.println("‹¹‚ª‚Æ‚«‚ß‚­‚æ‚¤‚È‚à‚Ì‚ðŒ©‚Â‚¯‚ç‚ê‚»‚¤");
				break;
			case 8:
				System.out.println("‡ˆÊF8ˆÊ");
				System.out.println("ŽhŒƒ‚ð‹‚ß‚Ä–`Œ¯‚ð‚µ‚½‚­‚È‚è‚»‚¤");
				break;
			case 9:
				System.out.println("‡ˆÊF9ˆÊ");
				System.out.println("ŽhŒƒ‚â•Ï‰»‚ð‹‚ß‚é“ú");
				break;
			case 10:
				System.out.println("‡ˆÊF10ˆÊ");
				System.out.println("–³—‚È–ñ‘©‚ð‚µ‚È‚¢‚æ‚¤‚É’ˆÓ");
				break;
			case 11:
				System.out.println("‡ˆÊF11ˆÊ");
				System.out.println("Šy‚µ‚Ý‚ðŒ©‚Â‚¯‚ÄãŽè‚É‹C•ª“]Š·‚ð");
				break;
			case 12:
				System.out.println("‡ˆÊF12ˆÊ");
				System.out.println("ƒvƒ‰ƒXŽvl‚Å‚¢‚«‚Ü‚µ‚å‚¤");
				break;
		}
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
