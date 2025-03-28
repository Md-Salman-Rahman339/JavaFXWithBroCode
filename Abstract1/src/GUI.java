import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUI implements ActionListener {

    JFrame jFrame=new JFrame();
    JLabel username=new JLabel();
    JTextArea UNI=new JTextArea();
    JLabel pass=new JLabel();
    JTextArea PI=new JTextArea();
    JButton login=new JButton();
    JLabel show =new JLabel();

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==login){
            if(UNI.getText().equals("abc")&& PI.getText().equals("123")){
                System.out.println("Successfull");
            }
            else{
                System.out.println("try again");
                show.setText("try again");
            }

        }
    }
    public GUI(){
        //setting bounds for the components
        username.setBounds(50, 50, 100, 50);
        UNI.setBounds(200, 50, 100, 50);
        pass.setBounds(50, 150, 100, 50);
        PI.setBounds(200, 150, 100, 50);
        login.setBounds(100, 250,100, 50);
        show.setBounds(100, 350, 100, 50);
        //adding the components to the container
        jFrame.add(username);
        jFrame.add(UNI);
        jFrame.add(pass);
        jFrame.add(PI);
        jFrame.add(login);
        jFrame.add(show);

        username.setText("username");
        pass.setText("password");
        login.setText("login");

        login.addActionListener(this);


        jFrame.setLocation(100, 50);
        jFrame.setSize(600, 600);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }
}
