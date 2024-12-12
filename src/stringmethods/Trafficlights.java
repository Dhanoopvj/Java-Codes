package stringmethods;

public class Trafficlights {
/*create a java class traffic lights with method called get color that takes in
* in a single integer input reperesenting the no of seconds that have passed since the traffic lightis turned greeen
* and returns a string representing the current colour of the trafffic lights .the traffic lights should cycle
* through the following colors: "green" for the first 30 sec , yellow for the next 5 secandd redd for the next 20 sec
* before starting the cycle over again at green		 */

	public String getcolor(int seconds) {
		int cycleSeconds =seconds%55;
		if (cycleSeconds<=30) {
			return "green";
		}
		else if (cycleSeconds<=35) {
			return "yellow";
		}
		else {
			return "red";
		}
	}
	
	public static void main(String[] args) {
		Trafficlights trafficlights=new Trafficlights();
		System.out.println("color at 30 seconds: "+ trafficlights.getcolor(30));
		System.out.println("color at 50 seconds: "+ trafficlights.getcolor(50));
		System.out.println("color at 55 seconds: "+ trafficlights.getcolor(55));
	}

}
