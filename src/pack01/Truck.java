package pack01;
import pack02.Car;          //다른pack의 클래스 쓰려면 import
public class Truck extends Car{                      // pack02의 Car를 상속받은것
	Truck(){
		System.out.println("패키지1의 트럭생성자");
	}

	public static void main(String[] args) {

		Truck truck=new Truck();                              //pack02 Car생성자(부모생성자 먼저호출) + Truck생성자 (자식호출)
				System.out.println(Car.CAR_NAME);  // pack02 Car이름이 나옴 
				System.out.println(pack02.Car.CAR_NAME);
	
	}

}
