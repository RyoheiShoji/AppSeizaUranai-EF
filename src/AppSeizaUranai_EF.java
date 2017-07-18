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

		System.out.println("乣乣乣乣乣乣崱擔偺愯偄乣乣乣乣乣乣");

		aries(rankArray.get(0));
		taurus(rankArray.get(1));
		gemini(rankArray.get(2));
		cancer(rankArray.get(3));
		leo(rankArray.get(4));
		virgo(rankArray.get(5));
		libra(rankArray.get(6));
		scorpio(rankArray.get(7));

		System.out.println("乣乣乣乣乣乣椙偄堦擔傪!乣乣乣乣乣乣");


	}
	public static void aries(int rank){
		//敥嶳 戱栫偝傫
		String fortune[] = {"", "侾埵両両両両両 曮偔偠傪攦偄傑偟傚偆丅",
								"俀埵両両両両 側偵偐妝偟偄偙偲偑婲偙傝偦偆丅丅",
								"俁埵両両両 偲偰傕偄偄擔偵側傝偦偆丅",
								"係埵両両 桭恖偐傜壗偐傕傜偊偦偆丅",
								"俆埵両 側偵偐椙偄偙偲偑婲偙傝偦偆丅",
								"俇埵 偄偮傕偲曄傢傜側偄擔偵側傝偦偆丅",
								"俈埵 彮偟寵側偙偲偑偁傝偦偆丅",
								"俉埵 恏偄偙偲偑婲偙傝偦偆丅",
								"俋埵 斶偟偄偙偲偑婲偙傝偦偆丅",
								"侾侽埵 奜弌偺嵺偼婥傪晅偗偰丅",
								"侾侾埵 栭摴偵婥傪晅偗偰丅",
								"侾俀埵 北北北北北北!!!!!"	};

		System.out.println("偍傂偮偠嵗偺偁側偨偼" + fortune);
	}
	public static void taurus(int rank){
		//戝屗 桾婱偝傫
	}
	public static void gemini(int rank){
		//斣壆 隳偝傫
	}
	public static void cancer(int rank){
		//彲巌
	}
	public static void leo(int rank){
		//嶌嶳 惷栱偝傫
	}
	public static void virgo(int rank){
		//忋彈幁 曕偝傫
		
		System.out.println("偍偲傔嵗偺婱曽偼戞 " + rank + " 埵!!!";
		switch(rank) {
			case 1:
				System.out.println("儅儞僔儑儞傪堦搹攦偭偪傖偍偆");
				break;
			case 2:
				System.out.println("栚昗偵彮偟偩偗嬤偯偔偐傕...?");
				break;
			case 3:
				System.out.println("俆侽墌偑摴抂偵棊偪偰傞偐傕両岎斣傊");
				break;
			case 4:
				System.out.println("慡恎墿怓僐乕僨偱嬥塣傾僢僾");
				break;
			case 5:
				System.out.println("敿擔儔乕儊儞傪怘傋偰曕偙偆");
				break;
			case 6:
				System.out.println("壀嶳導嶻敀搷傪怘傋傞偲塣婥傾僢僾...?");
				break;
			case 7:
				System.out.println("怴偟偄偙偲偵挧愴偟偰傒傛偆");
				break;
			case 8:
				System.out.println("崱擔偼傾僣僁僀偐傜悈暘曗媼傪朰傟偢偵");
				break;
			case 9:
				System.out.println("岲偒側偙偲偱怘傋偰偄偙偆両懡暘偆傑偔偄偔偐傕...");
				break;
			case 10:
				System.out.println("崱擔偼憗傔偵怮傛偆");
				break;
			case 11:
				System.out.println("崱擔柧擔偼妛峑傪媥傫偩傎偆偑偄偄偐傕");
				break;
			case 12:
				System.out.println("偳偆偁偑偄偰傕愨朷");
				break;
		}
	}
	public static void libra(int rank){
		//埳惃桬恖偝傫
	}
	public static void scorpio(int rank){
		//埳摗奀惎偝傫
	}
}
