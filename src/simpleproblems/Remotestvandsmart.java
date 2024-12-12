package simpleproblems;
interface TVremote{
	public  void keybuttons();
	void vpolumeup();
	void volumedown();

}
interface SmartTv{
	public void Netflix();
	void youtube();
}

class TV implements TVremote,SmartTv{
	@Override
	public void Netflix() {
	System.out.println("Netflix shows");	
	}
	@Override
	public void youtube() {
 System.out.println("Youtube shows");
	}
	@Override
	public void keybuttons() {
System.out.println("1-10 keywords");
	}

	@Override
	public void vpolumeup() {
System.out.println("volumeincrease");
	}

	@Override
	public void volumedown() {
System.out.println("volumedecrese");		
	}

}
public class Remotestvandsmart {

	public static void main(String[] args) {
	TVremote myTv=new TV();
	myTv.volumedown();
	myTv.vpolumeup();
	myTv.keybuttons();
	SmartTv myTV2=new TV();
	myTV2.Netflix();
	myTV2.youtube();
	}

}
