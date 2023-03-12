package week1.assignment1;

public class Mobile {
	public void makeCall()
	{
		String mobileModel ="GooglePixel 4A";
		float mobileWeight =20.4f;
		System.out.println("Mobile model is "+mobileModel);
		System.out.println("Mobile weight is "+mobileWeight);
	}
	public void sendMsg()
	{
		boolean isFullyCharged=true;
		int mobileCost=14500;
		System.out.println("Mobile charge condition "+isFullyCharged);
		System.out.println("Mobile cost is "+mobileCost);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile call = new Mobile();
		call.makeCall();
		call.sendMsg();
        System.out.println("This is my mobile");
	}

}
