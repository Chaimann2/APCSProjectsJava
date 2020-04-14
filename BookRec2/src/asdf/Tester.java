package asdf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Tester {
	public static void main(String [] args){
		
		Book b[] = new Book[55];
		Reader q[] = new Reader[86];
		String qwerty[] = new String[86];
		int i = 0;
		File f = new File("books.txt");
		String s;
		Scanner r;
		try {
			r = new Scanner(f);
			while(r.hasNextLine()){
				s = r.nextLine();
		        String[] t = s.split(",");
		        b[i] = new Book(t[0], t[1]);
		        i++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		  
		for (Book a : b) {
            
		} 
		f = new File("readerratings.txt");
		int x = 0, u = 0;
		int v = 0;
		String a = null;
		int numbers[] = new int[55];
		int k;
		for (i = 0; i < 86; i++) {
			q[i] = new Reader();
		}
		try {
			r = new Scanner(f);
			while (r.hasNextLine()) {
				a = r.nextLine();
				while (r.hasNextInt()) {
					k = r.nextInt();
					if (k != 0) {
					numbers[v] = k;
					v++;
					} else {
						numbers[v] = 0;
						v++;
					}
				}
				v = 0;
				for (int h = 0; h < 55; h++) {
				
				q[u].s[h] = numbers[h];
				
				}
				
				
				x++;
				if (x % 2 == 1) {
					u = (x-1) / 2;
					
				}
				else {
					
					u = x/2;
					
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		u = 0;
		f = new File("readerratings.txt");
		try {
			r = new Scanner(f);
			while (r.hasNext()) {
				String l = r.nextLine();
				u++;
				if (u % 2 == 1) {
					int op = (u - 1)/2;
					q[op].setName(l);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int j;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		for (i = 0; i<86; i++) {
			qwerty[i] = q[i].getName();
		}
		
		
		
		
		
		JFrame frame = new JFrame();
		
		DefaultListModel<String> model = new DefaultListModel<>();
		
		
		
		
		for (i = 0; i<86;i++) {
			model.addElement(qwerty[i]);

		}
		
		
		frame.setBounds(100, 100, 869, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Method A Recommendation");
		btnNewButton.setBounds(572, 11, 255, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Method B Recommendation");
		btnNewButton_1.setBounds(572, 45, 255, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Method C Recommendation");
		btnNewButton_2.setBounds(572, 79, 255, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(629, 192, 117, 140);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Rating:");
		lblNewLabel_1.setBounds(639, 339, 48, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_3 = new JButton("Previous");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(530, 229, 89, 66);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(754, 229, 89, 66);
		frame.getContentPane().add(btnNext);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(195, 15, 300, 406);
		frame.getContentPane().add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 128, 410);
		frame.getContentPane().add(scrollPane);
		
		JList list = new JList(model);
		scrollPane.setViewportView(list);
		
	
		JLabel lblNewLabel_3 = new JLabel("Most Similar Reader:");
		lblNewLabel_3.setBounds(572, 137, 136, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(710, 137, 86, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(514, 49, 48, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel label = new JLabel("");
		label.setBounds(683, 339, 48, 14);
		frame.getContentPane().add(label);
		
		JButton btnMethodDRecommendation = new JButton("Method D Recommendation");
		btnMethodDRecommendation.setBounds(572, 113, 255, 23);
		frame.getContentPane().add(btnMethodDRecommendation);
		
		JLabel temp = new JLabel();
		JLabel another = new JLabel();
		
		frame.setVisible(true);
		
		
		list.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				lblNewLabel_5.setText((String) list.getSelectedValue());
				int ui = 0;
				if (lblNewLabel_5.getText() != ""	){
					String scale = lblNewLabel_5.getText();
					
					for (int lk = 0; lk < 86; lk++) {
						if(scale == q[lk].getName()) {
							ui  = lk;
						}
					}
				}
				int inbook = 0;
				for (int i = 0; i < 55; i++) {
					if (q[ui].s[i] != 0) {
						inbook = i; 
						break;
					}
				}
				BufferedImage img = null;
				try {
					img = ImageIO.read(new File(b[inbook].getTitle() +".jpg"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				Image dimg = img.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon icon = new ImageIcon(dimg);
				lblNewLabel.setIcon(icon);
				label.setText(Integer.toString(q[ui].s[inbook]));
				temp.setText(Integer.toString(ui));
				another.setText(Integer.toString(inbook));
			}
			
		}
		);
		
		btnNext.addActionListener(actionEvent1 -> {
			int alt = Integer.parseInt(another.getText());
			int picbook = Integer.parseInt(temp.getText());
			if (alt != 54) {
			alt++;
			} else {
				alt = 0;
			}
			BufferedImage img = null;
			try {
				img = ImageIO.read(new File(b[alt].getTitle() +".jpg"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			Image dimg = img.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon icon = new ImageIcon(dimg);
			lblNewLabel.setIcon(icon);
			label.setText(Integer.toString(q[picbook].s[alt]));
			temp.setText(Integer.toString(picbook));
			another.setText(Integer.toString(alt));
			
		});
		
		btnNewButton_3.addActionListener(actionEvent1 -> {
			int alt = Integer.parseInt(another.getText());
			int picbook = Integer.parseInt(temp.getText());
			if (alt != 0) {
			alt--;
			} else {
				alt = 54;
			}
			BufferedImage img = null;
			try {
				img = ImageIO.read(new File(b[alt].getTitle() +".jpg"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			Image dimg = img.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon icon = new ImageIcon(dimg);
			lblNewLabel.setIcon(icon);
			label.setText(Integer.toString(q[picbook].s[alt]));
			temp.setText(Integer.toString(picbook));
			another.setText(Integer.toString(alt));
			
		});
		int vg = 0;
		for (i = 0; i < 55; i++) {
			for (j = 0; j < 86; j++) {
				if (q[j].s[i] != 0) {
					b[i].settot(q[j].s[i]);
					vg++;
				}
			}
			if (vg != 0) {
				b[i].setavg(vg);
			}
			vg = 0;
			System.out.println(b[i].getTot() + " " + b[i].getAvg());
		}
		
		
		
		
		btnNewButton.addActionListener(actionEvent1 -> {
			if (lblNewLabel_5.getText() != ""	){
				String scale = lblNewLabel_5.getText();
				int e = 0;
				for (int lk = 0; lk < 86; lk++) {
					if(scale == q[lk].getName()) {
						e  = lk;
					}
				}
				int reader = e;
				int y = 0, m = 0;
				for (int op = 0; op < 55; op++) {
					if (b[op].getTot() > y && q[e].s[op] == 0) {
						y = b[op].getTot();
						m = op;
					}
				}

				BufferedImage img = null;
				try {
					img = ImageIO.read(new File(b[m].getTitle() +".jpg"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				Image dimg = img.getScaledInstance(lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon icon = new ImageIcon(dimg);
				lblNewLabel_2.setIcon(icon);
				} else {
					JOptionPane.showMessageDialog(null, "Please select a reader");
				}
			
		});
		
		
		btnNewButton_2.addActionListener(actionEvent1 -> {
			if (lblNewLabel_5.getText() != ""	){
				String scale = lblNewLabel_5.getText();
				int e = 0;
				for (int lk = 0; lk < 86; lk++) {
					if(scale == q[lk].getName()) {
						e  = lk;
					}
				}
				int kg = 0;
				for (int ii = 0; ii < 55; ii++) {
					for ( int jj = 0; jj < 86; jj++) {
						
							b[ii].settot1(q[e].best(q[jj]) * q[jj].s[ii]);

					}
					

				}
				int reader = e;
				double y = 0;
				int m = 0;
				for (int op = 0; op < 55; op++) {
					if (b[op].getTot1() > y && q[e].s[op] == 0) {
						y = b[op].getTot1();
						m = op;
					}
				}

				BufferedImage img = null;
				try {
					img = ImageIO.read(new File(b[m].getTitle() +".jpg"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				Image dimg = img.getScaledInstance(lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon icon = new ImageIcon(dimg);
				lblNewLabel_2.setIcon(icon);

			}else {
				JOptionPane.showMessageDialog(null, "Please select a reader");
			}
			
			
		});
		
		
		
		
		
		btnMethodDRecommendation.addActionListener(actionEvent1 -> {
			if (lblNewLabel_5.getText() != ""	){
				String scale = lblNewLabel_5.getText();
				int e = 0;
				for (int lk = 0; lk < 86; lk++) {
					if(scale == q[lk].getName()) {
						e  = lk;
					}
				}
				int reader = e;
				double y = 0;
				int m = 0;
				for (int op = 0; op < 55; op++) {
					if (b[op].getAvg() > y && q[e].s[op] == 0) {
						y = b[op].getAvg();
						m = op;
					}
				}

				BufferedImage img = null;
				try {
					img = ImageIO.read(new File(b[m].getTitle() +".jpg"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				Image dimg = img.getScaledInstance(lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon icon = new ImageIcon(dimg);
				lblNewLabel_2.setIcon(icon);
				} else {
					JOptionPane.showMessageDialog(null, "Please select a reader");
				}
		});
		
		
		btnNewButton_1.addActionListener(actionEvent1 ->{
			
			if (lblNewLabel_5.getText() != ""	){
			String scale = lblNewLabel_5.getText();
			int e = 0;
			for (int lk = 0; lk < 86; lk++) {
				if(scale == q[lk].getName()) {
					e  = lk;
				}
			}
			int top = 0;
			int reader = 0; 

			for  (int op = 0; op<86; op++) {
				if (op == e) {
					
				}else {
					if (q[e].best(q[op]) > top) {
						
						top = q[e].best(q[op]);
						reader = op;
					}
						
			}
			}
			int y = 0, m = 0;
			for (int op = 0; op < 55; op++) {
				if (q[reader].s[op] > y && q[e].s[op] == 0) {
					y = q[reader].s[op];
					m = op;
				}
			}

			BufferedImage img = null;
			try {
				img = ImageIO.read(new File(b[m].getTitle() +".jpg"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			Image dimg = img.getScaledInstance(lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon icon = new ImageIcon(dimg);
			lblNewLabel_2.setIcon(icon);
			lblNewLabel_4.setText(q[reader].getName());
			} else {
				JOptionPane.showMessageDialog(null, "Please select a reader");
			}
			
		});
	}
}
