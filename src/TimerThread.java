import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

 class TimerThread1 extends Thread{
	JLabel timerLabel;
	public TimerThread1(JLabel timerLabel) {
		this.timerLabel=timerLabel;
	}
	 public void run() {        //스레드실행	부분
		 int n=0;
		 while(true)
		 {timerLabel.setText(Integer.toString(n)); n++;  //스트링으로바꿔
		  try {
			  Thread.sleep(1000);
		  }catch(InterruptedException e) {return;}
		 }
	 }
 }
	 public class TimerThread extends JFrame{
		 TimerThread(){
			 setTitle("Thread");
			 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 Container c=getContentPane();
			 c.setLayout(new FlowLayout());
		
			 JLabel timerLabel=new JLabel();
			 timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
			 c.add(timerLabel);
			 TimerThread1 th=new TimerThread1(timerLabel);
			 
			 setSize(150,150);
			 setVisible(true);
			 th.start();
		 }
		 
	 

	public static void main(String[] args) {
		new TimerThread();
	}

}
