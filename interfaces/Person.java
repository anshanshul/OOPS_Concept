package interfaces;

public  abstract class Person implements Student,YouTuber,VideoEditor{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj = new  Person();
		obj.editvideo();
		obj.MakeVideo();
		obj.Study();
		
		YouTuber obj2 = obj;
		obj2.editvideo();
		obj2.MakeVideo();
		
		

	}

	@Override
	public void Study() {
		// TODO Auto-generated method stub
		System.out.println("person is studying");
		
	}

	@Override
	public void MakeVideo() {
		// TODO Auto-generated method stub
		System.out.println("person is making a video");
		
	}

	@Override
	public void editvideo() {
		// TODO Auto-generated method stub
		System.out.println("person will edit the video when it will need");
	}

}
