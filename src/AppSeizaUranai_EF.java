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

		System.out.println("�`�`�`�`�`�`�����̐肢�`�`�`�`�`�`");

		aries(rankArray.get(0));
		taurus(rankArray.get(1));
		gemini(rankArray.get(2));
		cancer(rankArray.get(3));
		leo(rankArray.get(4));
		virgo(rankArray.get(5));
		libra(rankArray.get(6));
		scorpio(rankArray.get(7));

		System.out.println("�`�`�`�`�`�`�ǂ������!�`�`�`�`�`�`");


	}
	public static void aries(int rank){
		//���R ��炳��
	}
	public static void taurus(int rank){
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
				System.out.println("プラス思考でいきましょう");
				break;
		}
	}
	public static void gemini(int rank){
		//�ԉ� �Ă���
	}
	public static void cancer(int rank){
		//���i
	}
	public static void leo(int rank){
		//��R �Ö킳��
	}
	public static void virgo(int rank){
		//�㏗�� ������
	}
	public static void libra(int rank){
		//�ɐ��E�l����
	}
	public static void scorpio(int rank){
		//�ɓ��C������
	}
}
