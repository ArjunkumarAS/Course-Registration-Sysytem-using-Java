

package mainframe;

 import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.util.Random;

 public class Mainframe implements ItemListener
{
   JFrame jf;
   JLabel l1,l2,l3; 
   Checkbox a1,a2,a3,a4;
   CheckboxGroup cg;
  
  
  public Mainframe()
  {
    jf=new JFrame();
    jf.setSize(1000,1000);
    jf.setTitle("THE ULTIMATE UNIVERSITY");
    jf.setLayout(null);
   
 
   
   jf.setContentPane(new JLabel(new ImageIcon("main.jpg")));
   
    Font f=new Font("Sylfaen",Font.BOLD,60);

  
    l2=new JLabel("THE ULTIMATE UNIVERSITY");
    l2.setFont(f);
    l2.setBounds(100,100,1000,200);
    l3=new JLabel("-------------KNOWLEDGE IS POWER-----------------");
    Font f1=new Font("Sylfaen",Font.BOLD,30);
    l3.setFont(f1);
    l3.setBounds(80,150,1000,200);
  
    l1=new JLabel("Select Your corresponding course to create Accomplishments");
    l1.setFont(f1);
    l1.setBounds(30,700,1000,200);
   
    
    cg=new  CheckboxGroup();
    a1=new Checkbox("Engineering and Technology",cg,false);
    a1.setBackground(Color.lightGray);
    a1.setBounds(250, 400, 200, 50);
    a1.addItemListener(this);
    a2=new Checkbox("Arts and Science",cg,false);
   a2.setBackground(Color.lightGray);
    a2.setBounds(550, 400, 150, 50);
    a2.addItemListener(this);
    a3=new Checkbox("Medicine",cg,false);
   a3.setBackground(Color.lightGray);
    a3.setBounds(250, 500, 100, 50);
    a3.addItemListener(this);
    a4=new Checkbox("Law",cg,false);
    a4.setBackground(Color.lightGray);
    a4.setBounds(550,500,50,50);
    a4.addItemListener(this);
    //FlowLayout FL = new FlowLayout( FlowLayout.CENTER,30,30);
    
    jf.add(a1);
    jf.add(a2);
    jf.add(a3);
    jf.add(a4);
    jf.add(l2);
    jf.add(l3);
     jf.add(l1);
    jf.setVisible(true);
    
   jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   
   
   jf.addWindowStateListener(new WindowAdapter()
   {
       @Override
       public void windowStateChanged(WindowEvent e)
       {
           if(e.getNewState()==JFrame.MAXIMIZED_BOTH)
           {
               jf.setExtendedState(JFrame.NORMAL);
               Toolkit.getDefaultToolkit().beep();
              // tooltip.display();
           }
       }
   });
   
  }
   public void itemStateChanged(ItemEvent e)
   {
       Checkbox ch=cg.getSelectedCheckbox();
       switch(ch.getLabel())
               {
           case "Engineering and Technology":
           {
              jf.dispose();
              new ENGINEERING();break;
           }
           case "Medicine":
           {
               jf.dispose();
               new MEDICINE();break;
           }
           case "Arts and Science":
           {
               jf.dispose();
               new ARTS_AND_SCIENCE();break;
           }
           case "Law":
           {
               jf.dispose();
               new LAW();
               break;
               
           }
               }
   }
    public static void main(String[] args) 
  {
      
      Mainframe m= new Mainframe();
  }
  
 }    
 class ENGINEERING implements ItemListener,ActionListener
 {
    JFrame f;
    Checkbox c1,c2,c3,c4,c5,c6;
    CheckboxGroup cbg;
    Label l,l1;
    Button b;
   
   ENGINEERING()
   {
   f = new JFrame();
   f.setSize(1000,1000);
   f.setTitle("WELCOME TO ENGINEERING");
   f.setLayout(null);
   f.setContentPane(new JLabel(new ImageIcon("engineer.jpg")));
    Font f1=new Font("Sylfaen",Font.BOLD,30);
    l=new Label("ONE MAN'S ENGINEERING IS ANOTHER MAN'S ENGINNERING!!");
    l.setFont(f1);
    l.setBounds(20,750,1000,50);
    Font f2=new Font("Sylfaen",Font.BOLD,20);
    l1=new Label("ENGINEERS TURN DREAMS INTO REALITY. BE PROUD TO BE AN ENGINEER!!");
    l1.setFont(f2);
    l1.setBounds(30,850,1000,50);
    f.add(l);
    f.add(l1);
    
    
    cbg = new CheckboxGroup ();
    c1 = new Checkbox("BE(Mechanical Engineering)",cbg,false);
    c1.setBackground(Color.WHITE);
    c1.setBounds(100,120,300,100);
    c1.addItemListener(this);
    
    c2 = new Checkbox("BE(Electrical And Electronic Engineering)",cbg,false);
    c2.setBackground(Color.WHITE);
    c2.setBounds(100,220,300,100);
    c2.addItemListener(this);
    
     c3= new Checkbox("BE(Electronic and Communication Engineering)",cbg,false);
    c3.setBackground(Color.WHITE);
    c3.setBounds(100,320,300,100);
    c3.addItemListener(this);
    
    c4 = new Checkbox("BE(Civil Engineering)",cbg,false);
    c4.setBackground(Color.WHITE);
    c4.setBounds(100,420,300,100);
    c4.addItemListener(this);
    
    c5 =new Checkbox("BE(Computer Science and Engineering)",cbg,false);
    c5.setBackground(Color.WHITE);
    c5.setBounds(100,520,300,100);
    c5.addItemListener(this);
    
    c6=new Checkbox("B.Tech(INFORMATION TECHNOLOGY)",cbg,false);
    c6.setBackground(Color.WHITE);
    c6.setBounds(100,620,300,100);
    c6.addItemListener(this);
    
     b=new Button("BACK");
     b.setBounds(900,10,50,50);
     b.addActionListener(this);
  
    f.add(c1);
    f.add(c2); 
    f.add(c3); 
    f.add(c4);
    f.add(c5);
    f.add(c6);
    f.add(b);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
     f.addWindowStateListener(new WindowAdapter()
   {
       @Override
       public void windowStateChanged(WindowEvent e)
       {
           if(e.getNewState()==JFrame.MAXIMIZED_BOTH)
           {
               f.setExtendedState(JFrame.NORMAL);
               Toolkit.getDefaultToolkit().beep();
              // tooltip.display();
           }
       }
   });
     

    }
   public void itemStateChanged(ItemEvent e)
   {
      Checkbox ch=cbg.getSelectedCheckbox();
       switch(ch.getLabel())
       {
           case "BE(Mechanical Engineering)":
           {
               f.dispose();
               new register();
               break;
           }
           
          case "BE(Electrical And Electronic Engineering)":
          {   f.dispose();
               new register();
               break;
          }
          case  "BE(Electronic and Communication Engineering)":
          {  f.dispose();
               new register();
               break;
          }
          
           case  "BE(Civil Engineering)":
           {  
               f.dispose();
               new register();
               break;
           }
           case  "BE(Computer Science and Engineering)":
           {   f.dispose();
               new register();
               break;
           }
          case  "B.Tech(INFORMATION TECHNOLOGY)":
          {
              f.dispose();
              new register();
               break;
          }
       }
   }   
   
    public void actionPerformed(ActionEvent e)
    {
        f.dispose();
        new Mainframe();
    }  
    
 } 

    
    
class MEDICINE implements ItemListener,ActionListener{
      JFrame jf;
    Checkbox c1,c2,c3,c4,c5,c6;
    CheckboxGroup cbg;
    Panel p;
    Label l;
    Button b;
    public MEDICINE()
    {
    
   jf = new JFrame();
   jf.setSize(1000,1000);
   jf.setLayout(null);
   jf.setVisible(true);
   jf.setContentPane(new JLabel(new ImageIcon("doctor.jpg")));
   jf.setTitle("WELCOME TO MEDICINE");
   p=new Panel();
   p.setBounds(0,900,1000,200);
   Font f=new Font("Sylfaen",Font.BOLD,30);
   l=new Label("A DOCTOR IS AN ANOTHER GOD TO THE HUMANS.");
   l.setFont(f);
   p.add(l);
   jf.add(p);
    cbg = new CheckboxGroup ();
     c1 = new Checkbox("MBBS(Bachelor of Medicine,Bachelor of Surgery)",cbg,false);
    c1.setBackground(Color.WHITE);
    c1.setBounds(100,120,300,100);
    c1.addItemListener(this);
     c2 = new Checkbox("BDS(Bachelor of Dental Surgery)",cbg,false);
    c2.setBackground(Color.WHITE);
    c2.setBounds(100,220,300,100);
    c2.addItemListener(this);
    c3= new Checkbox("BAMS(Bachelor of Ayurveda,Medicine and Surgery)",cbg,false);
    c3.setBackground(Color.WHITE);
    c3.setBounds(100,320,300,100);
    c3.addItemListener(this);
    c4 = new Checkbox("BNYS(Bachelor of Natropathy and Yogic Science)",cbg,false);
    c4.setBackground(Color.WHITE);
    c4.setBounds(100,420,300,100);
    c4.addItemListener(this);
     c5 =  new Checkbox("BSMS(Bachelor of Siddha Medicine and Surgery)",cbg,false);
    c5.setBackground(Color.WHITE);
    c5.setBounds(100,520,300,100);
    c5.addItemListener(this);
     c6=new Checkbox("BHMS(Bachelor of Homeopathic  Medicine and Surgery)",cbg,false);
    c6.setBackground(Color.WHITE);
    c6.setBounds(100,620,300,100);
    c6.addItemListener(this);
    
    b=new Button("BACK");
     b.setBounds(900,10,50,50);
    b.addActionListener(this);
    
     jf.add(c1);
    jf.add(c2); 
    jf.add(c3); 
    jf.add(c4);
    jf.add(c5);
    jf.add(c6);
    jf.add(b);
    
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
     jf.addWindowStateListener(new WindowAdapter()
   {
       @Override
       public void windowStateChanged(WindowEvent e)
       {
           if(e.getNewState()==JFrame.MAXIMIZED_BOTH)
           {
               jf.setExtendedState(JFrame.NORMAL);
               Toolkit.getDefaultToolkit().beep();
              // tooltip.display();
           }
       }
   });
    
    }
     public void itemStateChanged(ItemEvent e)
     {
     Checkbox cd=cbg.getSelectedCheckbox();
     switch(cd.getLabel())
     {
         case "MBBS(Bachelor of Medicine,Bachelor of Surgery)":
         {
             jf.dispose();
             new register();
             break;
         }
         case "BDS(Bachelor of Dental Surgery)":
         {
             jf.dispose();
             new register();
             break;
         }
         case "BAMS(Bachelor of Ayurveda,Medicine and Surgery)":
         {
              jf.dispose();
             new register();
             break;
             
         }
         case "BNYS(Bachelor of Natropathy and Yogic Science)":
         {
              jf.dispose();
             new register();
             break;
         }
         case "BSMS(Bachelor of Siddha Medicine and Surgery)":
         {
              jf.dispose();
             new register();
             break;
         }
         case "BHMS(Bachelor of Homeopathic  Medicine and Surgery)":
         {
              jf.dispose();
             new register();
             break;
         }
     }
   }
     
   public void actionPerformed(ActionEvent e)
    {
        jf.dispose();
        new Mainframe();
    }  
    
}
 
class  ARTS_AND_SCIENCE implements ItemListener,ActionListener
{
    JFrame jf;
    Checkbox c1,c2,c3,c4,c5,c6,c7,c8;
    CheckboxGroup cbg;
    Label l1,l2,l3;
    Button b;
    
    
    ARTS_AND_SCIENCE()
    {
   jf = new JFrame();
   jf.setSize(1000,1000);
   jf.setLayout(null);
   jf.setVisible(true); 
   jf.setTitle("WELCOME TO ARTS AND SCIENCE");
   jf.setContentPane(new JLabel(new ImageIcon("geometry.jpeg")));
   cbg = new CheckboxGroup ();
   l1=new Label("ARTS");
   Font fs=new Font("Verdana",Font.BOLD,30);
   l1.setFont(fs);
   l1.setBounds(150,50,100,50);
   
    c1 = new Checkbox("B.A(TAMIL)",cbg,false);
    c1.setBackground(Color.WHITE);
    c1.setBounds(100,120,300,100);
    c1.addItemListener(this);
   c2 = new Checkbox("B.A(ENGLISH)",cbg,false);
    c2.setBackground(Color.WHITE);
    c2.setBounds(100,220,300,100);
    c2.addItemListener(this);
    c3= new Checkbox("B.A(HISTORY)",cbg,false);
    c3.setBackground(Color.WHITE);
    c3.setBounds(100,320,300,100);
    c3.addItemListener(this);
   c4 = new Checkbox("B.A(ECONOMICS)",cbg,false);
    c4.setBackground(Color.WHITE);
    c4.setBounds(100,420,300,100);
    c4.addItemListener(this);
   
    l2=new Label("SCIENCE");
    l2.setFont(fs);
    l2.setBounds(600,50,150,50);
    c5 =  new Checkbox("B.Sc(Computer Science)",cbg,false);
    c5.setBackground(Color.WHITE);
    c5.setBounds(550,120,300,100);
    c5.addItemListener(this);
    c6 =  new Checkbox("B.Sc(Maths)",cbg,false);
    c6.setBackground(Color.WHITE);
    c6.setBounds(550,220,300,100);
    c6.addItemListener(this);
    c7=  new Checkbox("B.Sc(Physics)",cbg,false);
    c7.setBackground(Color.WHITE);
    c7.setBounds(550,320,300,100);
    c7.addItemListener(this);
    c8 =  new Checkbox("B.Sc(Chemistry)",cbg,false);
    c8.setBackground(Color.WHITE);
    c8.setBounds(550,420,300,100);
    c8.addItemListener(this);
    l3=new Label("Both of them have to develop original ideas and push frontiers!!");
   Font f=new Font("Verdana",Font.BOLD,30);
   l3.setFont(f);
   l3.setBounds(20,600,1000,100);
   
     b=new Button("BACK");
     b.setBounds(900,10,50,50);
     b.addActionListener(this);
    
    jf.add(l1);
    jf.add(l2);
    jf.add(c1);
    jf.add(c2); 
    jf.add(c3); 
    jf.add(c4);
    jf.add(c5);
    jf.add(c6);
    jf.add(c7);
    jf.add(c8);
    jf.add(l3);
    jf.add(b);
    
     jf.addWindowStateListener(new WindowAdapter()
   {
       @Override
       public void windowStateChanged(WindowEvent e)
       {
           if(e.getNewState()==JFrame.MAXIMIZED_BOTH)
           {
               jf.setExtendedState(JFrame.NORMAL);
               Toolkit.getDefaultToolkit().beep();
              // tooltip.display();
           }
       }
   });
     
   jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void itemStateChanged(ItemEvent e){
    Checkbox ch=cbg.getSelectedCheckbox();
    switch(ch.getLabel())
    {
        case "B.A(TAMIL)":
            jf.dispose();
            new register();
            break;
        case "B.A(ENGLISH)":
            jf.dispose();
            new register();
            break;
        case "B.A(HISTORY)":
            jf.dispose();
            new register();
            break;
        case "B.A(ECONOMICS)":
            jf.dispose();
            new register();
            break;
        case "B.Sc(Computer Science)":
            jf.dispose();
            new register();
            break;
        case "B.Sc(Maths)":
            jf.dispose();
            new register();
            break;
        case "B.Sc(Physics)":
            jf.dispose();
            new register();
            break;
        case "B.Sc(Chemistry)":
            jf.dispose();
            new register();
            break;
            
    }
    
    } 
    public void actionPerformed(ActionEvent e)
    {
        jf.dispose();
        new Mainframe();
    }
    
    
}
   
class LAW implements ItemListener,ActionListener{
    JFrame jf;
    Checkbox c1,c2;
    CheckboxGroup cbg;
    Label l;
    Button b;
   public  LAW()
   {
       jf = new JFrame();
      jf.setSize(1000,1000);
       jf.setLayout(null);
     jf.setVisible(true);
     jf.setTitle("WELCOME TO LAW");
     jf.setContentPane(new JLabel(new ImageIcon("justice.jpeg")));
   
      cbg = new CheckboxGroup ();
      c1 = new Checkbox("BABL(Bachelor of Arts and Bachelor of Laws)",cbg,false);
      c1.setBackground(Color.white);
      c1.setBounds(450,120,300,100);
      c1.addItemListener(this);
    
        c2 = new Checkbox("L.L.B.(Bachelor of Law/Laws)(hons)",cbg,false);
       c2.setBackground(Color.white);
        c2.setBounds(450,220,300,100);
        c2.addItemListener(this);
        
        l =new Label("A Good Lawyer always determines the Justice.");
        l.setBounds(150,800,700,50);
        Font f=new Font("Verdana",Font.BOLD,30);
        l.setFont(f);
        
       b=new Button("BACK");
       b.setBounds(900,10,50,50);
       b.addActionListener(this);
         

        
        
    
         jf.add(c1);
         jf.add(c2);
         jf.add(l);
         jf.add(b);
         
          jf.addWindowStateListener(new WindowAdapter()
   {
       @Override
       public void windowStateChanged(WindowEvent e)
       {
           if(e.getNewState()==JFrame.MAXIMIZED_BOTH)
           {
               jf.setExtendedState(JFrame.NORMAL);
               Toolkit.getDefaultToolkit().beep();
              // tooltip.display();
           }
       }
   });
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
   }
   
   
    public void itemStateChanged(ItemEvent e){
     Checkbox ch=cbg.getSelectedCheckbox();
    switch(ch.getLabel())
    {
        case "BABL(Bachelor of Arts and Bachelor of Laws)":
             jf.dispose();
            new register();
            break;
            
        case "L.L.B.(Bachelor of Law/Laws)(hons)":
             jf.dispose();
            new register();
            break;
    }
  }
    
     public void actionPerformed(ActionEvent e)
    {
        jf.dispose();
        new Mainframe();
    }
 }


class register extends finalframe implements ActionListener ,ItemListener
{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
JButton b;
Checkbox c;
JFrame jf;
JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
public register()
{
jf=new JFrame();
jf.setTitle("REGISTRATION FORM");
jf.setSize(1000,1000);
jf.setVisible(true);
GridLayout fl=new GridLayout(11,2);
jf.setLayout(fl);

l1=new JLabel("NAME:");
l2=new JLabel("FATHER NAME:");
l3=new JLabel("MOTHER NAME:");
l4=new JLabel("DATE OF BIRTH:");
l5=new JLabel("BLOOD GROUP:");
l6=new JLabel("PHONE NUMBER:");
l7=new JLabel("FATHER'S PHONE NUMBER:");
l8=new JLabel("ADDRESS:");
l9=new JLabel("EMAIL-ID:");
l10=new JLabel("STATE:");
t1=new JTextField("",20);
t2=new JTextField("",20);
t3=new JTextField("",20);
t4=new JTextField("",20);
t5=new JTextField("",10);
t6=new JTextField("",10);
t7=new JTextField("",20);
t8=new JTextField("",50);
t9=new JTextField("",20);
t10=new JTextField("",20);

 jf.add(l1); jf.add(t1); 
 jf.add(l2); jf.add(t2); 
 jf.add(l3); jf.add(t3);  
 jf.add(l4); jf.add(t4); 
 jf.add(l5); jf.add(t5);
 jf.add(l6); jf.add(t6);
 jf.add(l7); jf.add(t7); 
 jf.add(l8); jf.add(t8); 
 jf.add(l9); jf.add(t9);
 jf.add(l10); jf.add(t10);
 
b=new JButton("SUBMIT !!");
b.setBackground(Color.green);   c=new Checkbox("BACK");
b.addActionListener(this);      c.addItemListener(this);
jf.add(b);                      jf.add(c);


 jf.addWindowStateListener(new WindowAdapter()
   {
       @Override
       public void windowStateChanged(WindowEvent e)
       {
           if(e.getNewState()==JFrame.MAXIMIZED_BOTH)
           {
               jf.setExtendedState(JFrame.NORMAL);
               Toolkit.getDefaultToolkit().beep();
              // tooltip.display();
           }
       }
   });
 
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

 public void actionPerformed(ActionEvent ae)
 {
     s1=t1.getText().toString();
     s2=t2.getText().toString();
     s3=t3.getText().toString();
     s4=t4.getText().toString();
     s5=t5.getText().toString();
     s6=t6.getText().toString();
     s7=t7.getText().toString();
     s8=t8.getText().toString();
     s9=t9.getText().toString();
     s10=t10.getText().toString();
     if(s1.equals(""))
     {
     JOptionPane.showMessageDialog(null,"NAME IS MANDATORY!!");
      return;
     } 
      if(s2.equals(""))
     {
          JOptionPane.showMessageDialog(null," FATHER NAME IS MANDATORY!!");
          return;
     }
      if(s3.equals(""))
     {
          JOptionPane.showMessageDialog(null," MOTHER NAME IS MANDATORY!!");
          return;
     }
      if(s4.equals(""))
     {
          JOptionPane.showMessageDialog(null,"DATE OF BIRTH IS MANDATORY!!");
          return;
     }
      if(s5.equals(""))
     {
          JOptionPane.showMessageDialog(null,"BLOOD GROUP IS MANDATORY!!");
          return;
     }
      if(s6.equals(""))
     {
          JOptionPane.showMessageDialog(null,"PHONE NO IS MANDATORY!!");
          return;
     }
     if((s6.length()<10)||(s7.length()<10))
     {
         JOptionPane.showMessageDialog(null,"Please ensure entered phone number is valid!!");
          return;
         
     }  
     if(s7.equals(""))
     {
          JOptionPane.showMessageDialog(null,"FATHER'S PHONE NO IS MANDATORY!!");
          return;
     }
      if(s8.equals(""))
     {
          JOptionPane.showMessageDialog(null,"ADDRESS IS MANDATORY!!");
          return;
     }
      if(s9.equals(""))
     {
          JOptionPane.showMessageDialog(null,"EMAIL IS MANDATORY!!");
          return;
     }
     if(s10.equals(""))
     {
          JOptionPane.showMessageDialog(null,"STATE IS MANDATORY!!");
          return;
     }
   else
     {
    jf.dispose();
    finalframe h=new finalframe();
    String s=t1.getText();
    h.t.setText("HI! "+s+"<------->YOUR REGISTRATION IS SUCCESSFUL!!!!!");
     }
 
 }
 public void itemStateChanged(ItemEvent e){
     jf.dispose(); new Mainframe();
 }
 
}
class finalframe implements ActionListener{
    JFrame jf;
    Panel p,p2,p3;
    TextField t,t2,t3;
    Button b;
    finalframe()
    {
        Random ran=new Random();
        
        int l;
        l=ran.nextInt(1000);
        jf=new JFrame();
        jf.setVisible(true);
        jf.setTitle("COFIRMATION FORM");
        jf.setBackground(Color.white);
        jf.setSize(1000,1000);
        jf.setLayout(null);
        jf.setContentPane(new JLabel(new ImageIcon("grad.jpg")));
        p=new Panel();
        p.setBounds(150,200,800,100);
       // Dimension d=new Dimension(800,100);
        Font fs=new Font("Verdana",Font.BOLD,20);
        t=new TextField();
        t.setEditable(false);
        t.setFont(fs);
    //    t.setPreferredSize(d);
        t2=new TextField();
        t2.setText("For Contact:093441 089771");
        t2.setEditable(false);
        t2.setFont(fs);
        p2=new Panel();
       p2.setBounds(50,800,400,50); 
       
       t3=new TextField();
       t3.setEditable(false);
       t3.setFont(fs);
       t3.setText("Your Registration number is:"+Integer.toString(l));
       p3=new Panel();
       p3.setBounds(250,300,350,50);
       
       b=new Button("BACK");
       b.setBounds(900,10,50,50);
       b.addActionListener(this);
        
       p3.add(t3);
       p2.add(t2);
        p.add(t);
        jf.add(p);
        jf.add(p2);
        jf.add(p3);
        jf.add(b);
        
         jf.addWindowStateListener(new WindowAdapter()
   {
       @Override
       public void windowStateChanged(WindowEvent e)
       {
           if(e.getNewState()==JFrame.MAXIMIZED_BOTH)
           {
               jf.setExtendedState(JFrame.NORMAL);
               Toolkit.getDefaultToolkit().beep();
              // tooltip.display();
           }
       }
   });
         
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        jf.dispose();
        new register();
    }
}


   


    
