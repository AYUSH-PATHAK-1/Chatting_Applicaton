import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class server extends JFrame implements ActionListener {
    Color skin=new Color(220, 248, 198);
    JTextField text;
    JPanel  a1;
    Box vertical=Box.createVerticalBox();
    server(){
        setTitle("WhatsApp Lite");
        setLayout(null);


        JPanel p1=new JPanel();
        p1.setBackground(new Color(37, 211, 102));
        p1.setBounds(0,0,450,70);
        p1.setLayout(null);
        add(p1);


        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/arrow.png"));
        Image i2=i1.getImage().getScaledInstance(19,19,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel back=new JLabel(i3);
        back.setBounds(16,24,25,25);
        p1.add(back);
        back.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent ae){
                    System.exit(0);
                }

        });


        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("images/1.png"));
        Image i5 = i4.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel profile = new JLabel(i6);
        profile.setBounds(52, 10, 50, 50);
        p1.add(profile);


        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("images/zoom.png"));
        Image i8 = i7.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel video = new JLabel(i9);
        video.setBounds(280, 20, 30, 30);
        p1.add(video);


        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("images/phone.png"));
        Image i11 = i10.getImage().getScaledInstance(25, 25 , Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel phone = new JLabel(i12);
        phone.setBounds(340, 20, 30, 30);
        p1.add(phone);

        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("images/dots.png"));
        Image i14 = i13.getImage().getScaledInstance(27, 27, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        JLabel dot = new JLabel(i15);
        dot.setBounds(395, 20, 30, 30);
        p1.add(dot);

        JLabel name=new JLabel("Roger");
        name.setBounds(120,12,100,30);
        name.setForeground(Color.BLACK);
        name.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p1.add(name);

        JLabel status=new JLabel("Online");
        status.setBounds(120,38,100,30);
        status.setForeground(Color.white);
        status.setFont(new Font("SAN_SERIF",Font.BOLD,14));
        p1.add(status);

        a1=new JPanel();
        a1.setBounds(5,75,430,525);
        a1.setBackground(skin);
        a1.setLayout(null);
        add(a1);

        text=new JTextField();
        text.setBounds(5,612,365,40);
        text.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(text);

        ImageIcon i16 = new ImageIcon(ClassLoader.getSystemResource("images/send.png"));
        Image i17 = i16.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT);
        ImageIcon i18 = new ImageIcon(i17);
        JLabel send = new JLabel(i18);
        send.setBounds(385, 614, 30, 30);
        add(send);
        send.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent ae){
                String out=text.getText();


                JPanel p2=formatLabel(out);
//                p2.add(output);


                a1.setLayout(new BorderLayout());

                JPanel right=new JPanel(new BorderLayout());
                right.add(p2,BorderLayout.LINE_END);
                vertical.add(right);
                vertical.add(Box.createVerticalStrut(15));

                a1.add(vertical,BorderLayout.PAGE_START);
                repaint();
                invalidate();
                validate();


                text.setText("");
            }

        });

//        JButton send=new JButton("SEND");
//        send.setBounds(330,614,100,36);
//        send.setForeground(Color.WHITE);
//        send.setFont(new Font("SAN_SERIF",Font.BOLD,16));
//        send.setBackground(new Color(37, 211, 102));
//        send.addActionListener(this);
//        add(send);


        setSize(450,700);
        setLocation(200,50);
//        setUndecorated(true);
        getContentPane().setBackground(skin);



        setVisible(true);


    }

    public void  actionPerformed(ActionEvent ae){
//           String out=text.getText();
//
//           JLabel output=new JLabel(out);
//           JPanel p2=new JPanel();
//           p2.add(output);
//
//
//           a1.setLayout(new BorderLayout());
//
//           JPanel right=new JPanel(new BorderLayout());
//           right.add(p2,BorderLayout.LINE_END);
//           vertical.add(right);
//           vertical.add(Box.createVerticalStrut(15));
//
//           a1.add(vertical,BorderLayout.PAGE_START);
//           repaint();
//           invalidate();
//           validate();
    }


     public static JPanel formatLabel(String out){
            JPanel panel=new JPanel();
            panel.setLayout(new BorderLayout());

            JLabel output=new JLabel("<html><p style=\"width:150px\">"+out+"</p></html>");
            output.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
            output.setBackground(new Color(37,211,102));
            output.setOpaque(true);
            output.setBorder(new EmptyBorder(15,15,15,50));



            panel.add(output);


//         Calendar cal=Calendar.getInstance();
//         SimpleDateFormat sdf=new SimpleDateFormat("HH:mm");
//         JLabel time=new JLabel();
//         time.setText(sdf.format(cal.getTime()));
//
//         panel.add(time);

            return panel;
    }

    public static void main(String[] args) {
        new server();
    }
}
