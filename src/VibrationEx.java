import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;

public class VibrationEx extends JFrame implements Runnable{
	
	Thread th; // 전역변수로 스레드를 잡아줌
	public VibrationEx() {
		setTitle("진동하는 프레임 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		setSize(200,200);                        //창의 사이즈
		setLocation(300,300);             //창이 시작하는 위치
		setVisible(true);
		
		getContentPane().addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if(!th.isAlive()) return;           //!는 not의 의미
				th.interrupt();                           //클릭하면 진동이 멈추도록하는 이벤트
			}
		});
		
	th=new Thread(this);            //runnable로 했으므로 this를 쓸수 있음
	th.start();
	
	}
	public void run() {            //쓰레드는 run이 반드시 필요함
		Random r= new Random();         //무작위 추출 함수 
		while(true) {
			try {
				Thread.sleep(20);
			}
			catch(InterruptedException e) {
				return;
			}
			int x= getX() + r.nextInt()%5;     //x좌표를 가져와서 + 랜덤으로 가져와서 5로나눈나머지
			int y= getY()+r.nextInt()%5;  //5px안에서 왔다갔다하도록 하는 장치
			setLocation(x,y);                   //더 크게 하면 넓은범위로 왔다갔다함    
		}
			}
			public static void main(String[] args) {
				new VibrationEx();

	}

}
