package Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ArrayRandom extends JFrame implements ActionListener {
	   
	    private String[] parole = {"sindaco","Nobile", "Sputacchio", "Brusio","Annamaria", "Alvarez", "crocii"};
	    private JButton b = new JButton("Premi");
	    private JLabel p = new JLabel("");
	   
	    public ArrayRandom() {
	        super("Array Random");
	       
	        setLayout(new BorderLayout());
	        setSize(300, 200);
	        
	        
	        add(b, BorderLayout.NORTH);
	        add(p, BorderLayout.CENTER);
	        b.addActionListener(this);
	        setVisible(true);
	    }
	   
	    public void actionPerformed(ActionEvent e) {
	    int r = (int) (Math.random() * parole.length);
	        String pr = parole[r];
	        p.setText(pr);
	    }
	   
	   
	}



