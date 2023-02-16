import javax.swing.*;
import java.util.concurrent.atomic.AtomicInteger;

public class MyFrame extends JFrame {

    MyFrame(){

        JButton myButton1 = new JButton("MyButton1");
        JButton myButton2 = new JButton("MyButton2");
        myButton1.setBounds(100,100,200,100);
        myButton2.setBounds(100,200,200,100);
        JLabel myLabel = new JLabel("No buttons clicked");
        myLabel.setBounds(100,20,300,100);

        this.add(myButton1);
        this.add(myButton2);
        this.add(myLabel);

        AtomicInteger counter = new AtomicInteger();
        AtomicInteger counter2 = new AtomicInteger();

        myButton1.addActionListener(
                (e)-> {
                    System.out.println("You clicked MyButton1");
                    counter.getAndIncrement();
                    myLabel.setText("You clicked MyButton1 " + counter + " time(s)");
                }
        );

        myButton2.addActionListener(
                (e)-> {
                    System.out.println("You clicked MyButton2");
                    counter2.getAndIncrement();
                    myLabel.setText("You clicked MyButton2 " + counter2 + " time(s)");
                }
        );

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setLayout(null);

        this.setVisible(true);
    }
}
