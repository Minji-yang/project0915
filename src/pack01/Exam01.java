package pack01;

public class Exam01 {

	public static void main(String[] args) {
		class Car{
			String carName;
			Car(String carName){this.carName=carName;}
			
			public void run() {
				for (int i=0;i<3;i++) {
					try {
						Thread.sleep(10);      //1000 이 1초
						System.out.println(carName+"~달립니다.");
				} catch (Exception e) {
		        }
		     }
   	}
   }
		Car car1 = new Car("$자동차1");
		car1.run();

		Car car2 =new Car("$자동차2");
		car2.run();

		Car car3 = new Car("$자동차3");
		car3.run();
	}

}