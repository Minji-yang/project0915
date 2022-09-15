import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

 class TimerThread3 implements Runnable{
	JLabel timerLabel;
	public TimerThread3(JLabel timerLabel) {
		this.timerLabel=timerLabel;
	}
	 public void run() {        //스레드실행	부분
		 int n=0;
		 while(true)
		 {timerLabel.setText(Integer.toString(n)); n++;  //스트링으로바꿔
		  try {
			  Thread.sleep(10);
		  }catch(InterruptedException e) {return;}
		 }
	 }
 }
	 public class TimerThreadrun extends JFrame{
		 TimerThreadrun(){
			 setTitle("Thread");
			 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 Container c=getContentPane();
			 c.setLayout(new FlowLayout());
		
			 JLabel timerLabel=new JLabel();
			 timerLabel.setFont(new Font("Gothic",Font.ITALIC,30));
			 c.add(timerLabel);
			 
			 TimerThread3 th=new TimerThread3(timerLabel);
			  Thread trd=new Thread(th);
			 
			 setSize(150,150);
			 setVisible(true);
			 trd.start();
		 }
		 
	 

	public static void main(String[] args) {
		new TimerThreadrun();
	}

}
