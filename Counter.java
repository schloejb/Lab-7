import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 public class Counter implements ActionListener {

  int leftCount = 0;
  int rightCount = 0;

  JLabel leftLabel;
  JLabel rightLabel;

  Counter() {
    JFrame frame = new JFrame("Let's count");
    frame.setLayout(new FlowLayout());
    frame.setSize(200,110);

    JButton left = new JButton("Left");
    JButton right = new JButton("Right");
    JButton reset = new JButton("Reset");

    left.addActionListener(this);
    right.addActionListener(this);
    reset.addActionListener(this);

    frame.add(left);
    frame.add(right);
    frame.add(reset);

    leftLabel = new JLabel("Count " + leftCount);
    frame.add(leftLabel);

    rightLabel = new JLabel("Count " + rightCount);
    frame.add(rightLabel);

    frame.setVisible(true);
  }
  public void actionPerformed(ActionEvent ae){
    if(ae.getActionCommand().equals("Left")){
      leftCount += 1;
      leftLabel.setText("You pressed left");
    }
    else if (ae.getActionCommand().equals("Right")){
      rightCount += 1;
      rightLabel.setText("You pressed right");
    }
    else if (ae.getActionCommand().equals("Reset")){
      leftCount = 0;
      rightCount = 0;
      leftLabel.setText("Counter Reset");
      rightLabel.setText("Counter Reset");

    }
  }
}