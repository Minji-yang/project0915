package pack01;

public class Exam02 {

	public static void main(String[] args) {
		class Car extends Thread{
			String carName;
			Car(String carName){
				this.carName=carName;
				}
			public void run() {
				for(int i=0;i<3;i++) {
					try {
						Thread.sleep(10);
						System.out.println(carName+"~~달립니다.");
					} catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		  Car car1=new Car("$자동차1");      //()안이 비면 오류나네
		  car1.start();
		  Car car2=new Car("$자동차2");
		 car2.start();
		 Car car3=new Car("$자동차3");
		 car3.start();
		
	}

}
