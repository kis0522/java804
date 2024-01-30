package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();		//자동형변환
		vehicle.run();
		//vehicle.checkFare();				자동형변환으로 인해 Bus 안에 있는 checkFare는 가져올수 없다.
		
		Bus bus = (Bus) vehicle;			//강제형변환

		bus.run();
		bus.checkFare();
	}
}