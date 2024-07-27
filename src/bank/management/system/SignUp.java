package bank.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
public class SignUp extends JFrame implements ActionListener{
    JTextField textName,textFName,textEmail,textMs,textAdd,textCity,textPin,textState;
    JDateChooser dateChooser;
    JRadioButton r1,r2,m1,m2,m3;
    JButton next;

    //!for generating the random form number
    Random ran = new Random();
    long first4=(ran.nextLong()%9000L)+1000L;  //or ran.nextLong()%10000L
    String first=" "+Math.abs(first4);
    SignUp() {
        super("SignUp page");
        

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);


        JLabel label1 = new JLabel("Application form no."+ first);
        label1.setBounds(180,20,600,40);
        label1.setFont(new Font("RaleWay",Font.BOLD,38));
        add(label1);


        JLabel label2 = new JLabel("Page 1");
        label2.setBounds(360,70,600,30);
        label2.setFont(new Font("RaleWay",Font.BOLD,22));
        add(label2);


        JLabel label3 = new JLabel("Personal Details");
        label3.setBounds(310,90,600,40);
        label3.setFont(new Font("RaleWay",Font.BOLD,22));
        add(label3);

        //!Name
        JLabel labelName = new JLabel("Name: ");
        labelName.setBounds(100,150,100,30);
        labelName.setFont(new Font("RaleWay",Font.BOLD,20));
        add(labelName);


        textName= new JTextField();
        textName.setBounds(260,150,350,30);
        textName.setFont(new Font("RaleWay",Font.BOLD,18));
        add(textName);

        //!Father's Name
        JLabel labelFName = new JLabel("Father's Name: ");
        labelFName.setBounds(100,200,200,30);
        labelFName.setFont(new Font("RaleWay",Font.BOLD,20));
        add(labelFName);


        textFName= new JTextField();
        textFName.setBounds(260,200,350,30);
        textFName.setFont(new Font("RaleWay",Font.BOLD,18));
        add(textFName);


        //!DOB
        JLabel DOB= new JLabel("Date-of-Birth: ");
        DOB.setBounds(100,250,200,30);
        DOB.setFont(new Font("RaleWay",Font.BOLD,20));
        add(DOB);


        dateChooser= new JDateChooser();
        dateChooser.setBounds(260,250,350,30);
        dateChooser.setFont(new Font("RaleWay",Font.BOLD,18));
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);

        //!Gender
        JLabel labelG= new JLabel("Gender: ");
        labelG.setBounds(100,300,200,30);
        labelG.setFont(new Font("RaleWay",Font.BOLD,20));
        add(labelG);


        r1 = new JRadioButton("Male");
        r1.setBounds(260,300,100,30);
        r1.setFont(new Font("RaleWay",Font.BOLD,18));
        r1.setBackground(new Color(189, 188, 181));
        add(r1);


        r2 = new JRadioButton("Female");
        r2.setBounds(360,300,100,30);
        r2.setFont(new Font("RaleWay",Font.BOLD,18));
        r2.setBackground(new Color(189, 188, 181));
        add(r2);


        //*Grouping 2 buttons..by this we can select only one button at a time
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);


        //!Email
        JLabel labelEmail = new JLabel("Email: ");
        labelEmail.setBounds(100,350,200,30);
        labelEmail.setFont(new Font("RaleWay",Font.BOLD,20));
        add(labelEmail);


        textEmail= new JTextField();
        textEmail.setBounds(260,350,350,30);
        textEmail.setFont(new Font("RaleWay",Font.BOLD,18));
        add(textEmail);

        //!Marriage Status
        JLabel labelMs = new JLabel("Marriage Status: ");
        labelMs.setBounds(100,400,200,30);
        labelMs.setFont(new Font("RaleWay",Font.BOLD,20));
        add(labelMs);


        m1 = new JRadioButton("Married");
        m1.setBounds(260,400,100,30);
        m1.setFont(new Font("RaleWay",Font.BOLD,18));
        m1.setBackground(new Color(189, 188, 181));
        add(m1);


        m2 = new JRadioButton("Unmarried");
        m2.setBounds(390,400,140,30);
        m2.setFont(new Font("RaleWay",Font.BOLD,18));
        m2.setBackground(new Color(189, 188, 181));
        add(m2);

        m3 = new JRadioButton("Others");
        m3.setBounds(530,400,100,30);
        m3.setFont(new Font("RaleWay",Font.BOLD,18));
        m3.setBackground(new Color(189, 188, 181));
        add(m3);

        //!Address
        JLabel labelAdd = new JLabel("Address: ");
        labelAdd.setBounds(100,450,200,30);
        labelAdd.setFont(new Font("RaleWay",Font.BOLD,20));
        add(labelAdd);


        textAdd= new JTextField();
        textAdd.setBounds(260,450,350,30);
        textAdd.setFont(new Font("RaleWay",Font.BOLD,18));
        add(textAdd);


        //!City
        JLabel labelCity = new JLabel("City: ");
        labelCity.setBounds(100,500,200,30);
        labelCity.setFont(new Font("RaleWay",Font.BOLD,20));
        add(labelCity);


        textCity= new JTextField();
        textCity.setBounds(260,500,350,30);
        textCity.setFont(new Font("RaleWay",Font.BOLD,18));
        add(textCity);


        //!Pin
        JLabel labelPin = new JLabel("Pin Code: ");
        labelPin.setBounds(100,550,200,30);
        labelPin.setFont(new Font("RaleWay",Font.BOLD,20));
        add(labelPin);


        textPin= new JTextField();
        textPin.setBounds(260,550,350,30);
        textPin.setFont(new Font("RaleWay",Font.BOLD,18));
        add(textPin);


        //!State
        JLabel labelState = new JLabel("State: ");
        labelState.setBounds(100,600,200,30);
        labelState.setFont(new Font("RaleWay",Font.BOLD,20));
        add(labelState);


        textState= new JTextField();
        textState.setBounds(260,600,350,30);
        textState.setFont(new Font("RaleWay",Font.BOLD,18));
        add(textState);


        //!Next Button
        next = new JButton("Next");
        next.setFont(new Font("RaleWay",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);



        
        getContentPane().setBackground(new Color(189, 188, 181));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno=first;
        String name=textName.getText();
        String fname=textFName.getText();
        String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(r1.isSelected()){
            gender="Male";
        }
        else if(r2.isSelected()){
            gender="Female";
        }
        String email=textEmail.getText();
        String marital=null;
        if(m1.isSelected()){
            marital="Married";
        }
        else if(m2.isSelected()){
            marital="Unmarried";
        }
        else if(m3.isSelected()){
            marital="Others";
        }
        String address=textAdd.getText();
        String city=textCity.getText();
        String pincode=textPin.getText();
        String state=textState.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }
            else{
                Connect con1 = new Connect();
                String q="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new SignUp2(formno);
                setVisible(false);
            }

        }catch(Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new SignUp();
    }
    
}
