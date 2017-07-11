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
	}
	public static void libra(int rank){
		//埳惃桬恖偝傫
	}
	public static void scorpio(int rank){
		//埳摗奀惎偝傫
	}
}
