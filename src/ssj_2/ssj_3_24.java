package ssj_2;

public class ssj_3_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rand1 = (int)(Math.random()*100)%13;
		int rand2 = (int)(Math.random()*10)%4;
		String[] list1= {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String[] list2= {"Clubs","Diamonds","Hearts","Spades"};
		System.out.print("The card you picked is "+list1[rand1]+" of "+list2[rand2]);
	}

}
