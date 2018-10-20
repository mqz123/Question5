package task1;

interface vehicle{
	int timeAndMoney(String placeOfBegin, String destination, int distance);
	void print(String placeOfBegin, String destination, int diatance);
	String car = null, high_speed = null, plane = null;
	int timeToStop = 20, timeToAirplane = 30;
	int returnStopTime = 20, returnAirplaneTime = 30;
	int timeToTicket = 10;
	int timeToCheck = 5;
	int timeToWait = 20;
	int carSpeed = 110, high_speedSpeed = 300, planeSpeed = 900;
	double priceCar = 0.32, priceHigh_speed = 0.45, pricePlane = 0.75;
}

class Car implements vehicle{

	@Override
	public int timeAndMoney(String placeOfBegin, String destination, int distance) {
		int needTime = (int)(distance / carSpeed)*60;
		double needMoney = priceCar * distance;
		System.out.println("汽车从"+placeOfBegin+"到达"+destination+"所需的钱为（RMB）："+needMoney);
		return needTime;
	}

	@Override
	public void print(String placeOfBegin, String destination, int distance) {
		System.out.println("汽车从"+placeOfBegin+"到达"+destination+"所需的时间为（分钟）："+timeAndMoney(placeOfBegin, destination, distance));
	}
	
}

class High_Speed implements vehicle{
	@Override
	public int timeAndMoney(String placeOfBegin, String destination, int distance) {
		int needTime = (int)(distance / high_speedSpeed)*60 + timeToTicket
				+ timeToCheck+ timeToWait;
		double needMoney = distance * priceHigh_speed;
		System.out.println("高铁从"+placeOfBegin+"到达"+destination+"所需的钱为（RMB）："+needMoney);
		return needTime;
	}
	
	@Override
	public void print(String placeOfBegin, String destination, int distance) {
		System.out.println("高铁从"+placeOfBegin+"到达"+destination+"所需的时间为（分钟）："+timeAndMoney(placeOfBegin, destination, distance));
	}
}

class Plane implements vehicle{
	@Override
	public  int timeAndMoney(String placeOfBegin, String destination, int distance) {
		int needTime = (int)(distance / planeSpeed)*60 + timeToTicket
				+ timeToCheck+ timeToWait;
		double needMoney = distance * pricePlane;
		System.out.println("飞机从"+placeOfBegin+"到达"+destination+"所需的钱为（RMB）："+needMoney);
		return needTime;
	}
	
	@Override
	public void print(String placeOfBegin, String destination, int distance) {
		System.out.println("飞机从"+placeOfBegin+"到达"+destination+"所需的时间为（分钟）："+timeAndMoney(placeOfBegin, destination, distance));
	}
}
