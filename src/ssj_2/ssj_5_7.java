package ssj_2;

public class ssj_5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fee1 = 10000;
		double fee2 =0;
		double m=10000*Math.pow(1.05, 10.0);
		for(int i=0;i<14;i++){
		fee1*=1.05;
			if(i>9) {
			fee2+=fee1;
			}
			}
		
		System.out.printf("The fee is %.2f\nThe sum is %.2f",m,fee2);
	}

}
