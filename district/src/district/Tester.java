package district;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;


public class Tester {
	


	/**
	 * Initialize the contents of the frame.
	 */

	public static void main (String [] args) throws FileNotFoundException {
		File fmn = new File("MaleNamesDictionary.txt");
		File ffn = new File("FemaleNamesDictionary.txt");
		File ln = new File("LastNames.txt");
		DefaultListModel<String> model = new DefaultListModel<>();
		DefaultListModel<String> model1 = new DefaultListModel<>();
		JLabel lblasdf = new JLabel();
		JLabel asdff = new JLabel();
		ArrayList<String>maleNames = new ArrayList<String>();
		ArrayList<String>femaleNames = new ArrayList<String>();
		ArrayList<String>lastNames = new ArrayList<String>();
		ArrayList<EStudent> elemSchool = new ArrayList<EStudent>(); 
		ArrayList<HStudent> highSchool = new ArrayList<HStudent>(); 
		ArrayList<MStudent> middleSchool = new ArrayList<MStudent>(); 
		Scanner bf = new Scanner(fmn);
		while (bf.hasNext()) maleNames.add(bf.nextLine());
		
		
		Scanner br = new Scanner(ffn);
		while (br.hasNext()) femaleNames.add(br.nextLine());
		
		Scanner tr = new Scanner(ln);
		while (tr.hasNext()) lastNames.add(tr.nextLine());
		
		String tempname;
		Random rnd = new Random();
		int x;
		int x1 =0;

		
		
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 637, 609);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 117, 404, 446);
		frame.getContentPane().add(scrollPane);
		
		JList jList1 = new JList(model);
		scrollPane.setViewportView(jList1);
		
		for (int i = 0; i < 1201; i++) {
			x = rnd.nextInt((12 - 3) + 1) + 3;
			if (x > 8 && x < 13) {
				if (x % 2 == 0) {
					tempname = femaleNames.get(rnd.nextInt(4000));
					
				}
				else {
					tempname = maleNames.get(rnd.nextInt(1000));
				}
			
				highSchool.add(new HStudent(tempname, lastNames.get(rnd.nextInt(65000)), x,rnd.nextInt((100 - 45) + 1) + 45, rnd.nextInt((100 - 45) + 1) + 45, rnd.nextInt((100 - 45) + 1) + 45));
				model.addElement(highSchool.get(highSchool.size() - 1).getIdnum() + " " + highSchool.get(highSchool.size() - 1).getLname() + ", " + highSchool.get(highSchool.size() - 1).getFname() + " Grade " + highSchool.get(highSchool.size() - 1).getGdLevel());
				System.out.print(highSchool.get(highSchool.size() - 1).toString());
			}
			else if (x < 9 && x > 5) {
				if (x % 2 == 0) {
					tempname = femaleNames.get(rnd.nextInt(4000));
					
				}
				else {
					tempname = maleNames.get(rnd.nextInt(1000));
				}
				
				middleSchool.add(new MStudent(tempname, lastNames.get(rnd.nextInt(65000)), x,rnd.nextInt((100 - 45) + 1) + 45, rnd.nextInt((100 - 45) + 1) + 45, rnd.nextInt((100 - 45) + 1) + 45));
				model.addElement(middleSchool.get(middleSchool.size() - 1).getIdnum() + " " + middleSchool.get(middleSchool.size() - 1).getLname() + ", " + middleSchool.get(middleSchool.size() - 1).getFname() + " Grade " + middleSchool.get(middleSchool.size() - 1).getGdLevel());
				System.out.print(middleSchool.get(middleSchool.size() - 1).toString());
			}
			else {
				if (x % 2 == 0) {
					tempname = femaleNames.get(rnd.nextInt(4000));
					
				}
				else {
					tempname = maleNames.get(rnd.nextInt(1000));
				}
				
				elemSchool.add(new EStudent(tempname, lastNames.get(rnd.nextInt(65000)), x,rnd.nextInt((100 - 45) + 1) + 45, rnd.nextInt((100 - 45) + 1) + 45, rnd.nextInt((100 - 45) + 1) + 45));
				model.addElement(elemSchool.get(elemSchool.size() - 1).getIdnum() + " " + elemSchool.get(elemSchool.size() - 1).getLname() + ", " + elemSchool.get(elemSchool.size() - 1).getFname() + " Grade " + elemSchool.get(elemSchool.size() - 1).getGdLevel());
				System.out.print(elemSchool.get(elemSchool.size() - 1).toString());
			}
		}
		
		JLabel lblAvg = new JLabel("New label");
		lblAvg.setBounds(10, 92, 191, 14);
		frame.getContentPane().add(lblAvg);
		
		JLabel lblName = new JLabel("New label");
		lblName.setBounds(10, 11, 125, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblGrade = new JLabel("New label");
		lblGrade.setBounds(10, 62, 63, 14);
		frame.getContentPane().add(lblGrade);
		
		JList list = new JList(model1);
		list.setBounds(138, 10, 257, 66);
		frame.getContentPane().add(list);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first_name = JOptionPane.showInputDialog("New First Name" );
				String last_name = JOptionPane.showInputDialog("New Last Name" );
				int sc11 = Integer.parseInt(JOptionPane.showInputDialog("New Score 1" ));
				int sc22 = Integer.parseInt(JOptionPane.showInputDialog("New Score 1" ));
				int sc33 = Integer.parseInt(JOptionPane.showInputDialog("New Score 1" ));
				int grLvl = Integer.parseInt(JOptionPane.showInputDialog("Grade of new Student" ));
				int x = grLvl;
				if (x > 8 && x < 13) {

					
					highSchool.add(new HStudent(first_name, last_name, x,sc11, sc22, sc33));
					model.addElement(highSchool.get(highSchool.size() - 1).getIdnum() + " " + highSchool.get(highSchool.size() - 1).getLname() + ", " + highSchool.get(highSchool.size() - 1).getFname() + " Grade " + highSchool.get(highSchool.size() - 1).getGdLevel());

				}
				else if (x < 9 && x > 5) {
					middleSchool.add(new MStudent(first_name, last_name, x,sc11, sc22, sc33));
					model.addElement(middleSchool.get(middleSchool.size() - 1).getIdnum() + " " + middleSchool.get(middleSchool.size() - 1).getLname() + ", " + middleSchool.get(middleSchool.size() - 1).getFname() + " Grade " + middleSchool.get(middleSchool.size() - 1).getGdLevel());

				}
				else {
					elemSchool.add(new EStudent(first_name, last_name, x,sc11, sc22, sc33));
					model.addElement(elemSchool.get(elemSchool.size() - 1).getIdnum() + " " + elemSchool.get(elemSchool.size() - 1).getLname() + ", " + elemSchool.get(elemSchool.size() - 1).getFname() + " Grade " + elemSchool.get(elemSchool.size() - 1).getGdLevel());

				}
				
				
			}
		});
		btnAdd.setBounds(405, 7, 103, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] asdf = jList1.getSelectedValue().toString().split(" ");
	        	int tempid = (Integer.parseInt(asdf[0]));
	        	lblasdf.setText(Integer.toString(tempid));
	        	int stu = 1000;
	        	model1.removeAllElements();
	        	for (int i = 0; i < highSchool.size(); i++) {
	        		if (highSchool.get(i).getIdnum() == tempid) {
	        			for (int j = i + 1; j < highSchool.size(); j++) {
	        				highSchool.get(i).set(highSchool.get(j));
	        				
	        			}
	        			Student.totalFees -= 150;
	    				highSchool.remove(middleSchool.size() - 1);
	        		}
	        		
	        	}
	        	
	        	for (int i = 0; i < elemSchool.size(); i++) {
	        		if (elemSchool.get(i).getIdnum() == tempid) {
	        			for (int j = i + 1; j < elemSchool.size(); j++) {
	        				elemSchool.get(i).set(elemSchool.get(j));
	        				
	        			}
	        			Student.totalFees -= 50;
	    				elemSchool.remove(middleSchool.size() - 1);
	        		}
	        		
	        		
	        	}
	        	
	        	for (int i = 0; i < middleSchool.size(); i++) {
	        		if (middleSchool.get(i).getIdnum() == tempid) {
	        			for (int j = i + 1; j < middleSchool.size(); j++) {
	        				middleSchool.get(i).set(middleSchool.get(j));
	        				
	        			}
	        			
	        		}
	        		Student.totalFees -= 100;
    				middleSchool.remove(middleSchool.size() - 1);
	        	}
	        	boolean con = true;
	        	int idsf = 0;
	        	model.remove(jList1.getSelectedIndex());
			}
		});
		btnDelete.setBounds(405, 32, 103, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnChange = new JButton("Change");
		btnChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnChange.setBounds(508, 7, 103, 23);
		frame.getContentPane().add(btnChange);
		btnChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int tempid = Integer.parseInt(lblasdf.getText());
	        	int stu = 1000;
	        	model1.removeAllElements();
	        	for (int i = 0; i < highSchool.size(); i++) {
	        		if (highSchool.get(i).getIdnum() == tempid) {

	        			asdff.setText(Integer.toString(i));
	        			lblasdf.setText("h");

	        		}
	        	}
	        	
	        	for (int i = 0; i < elemSchool.size(); i++) {
	        		if (elemSchool.get(i).getIdnum() == tempid) {

	        			asdff.setText(Integer.toString(i));
	        			lblasdf.setText("e");

	        		}
	        	}
	        	
	        	for (int i = 0; i < middleSchool.size(); i++) {
	        		if (middleSchool.get(i).getIdnum() == tempid) {
	        			asdff.setText(Integer.toString(i));
	        			lblasdf.setText("m");
	        		}
	        	}
				
				
				
				String[] options = {"Name", "Scores"};
				int x = JOptionPane.showOptionDialog(null, "What do you want to edit?",
		                "Choose what to edit",
		                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
				int i = Integer.parseInt(asdff.getText());
				if (x == 0) {
					String first_name = JOptionPane.showInputDialog("New First Name" );
					String last_name = JOptionPane.showInputDialog("New Last Name" );
					if (lblasdf.getText() == "e") {
						
						elemSchool.get(Integer.parseInt(asdff.getText())).setFname(first_name);
						elemSchool.get(Integer.parseInt(asdff.getText())).setLname(last_name);
						lblName.setText(elemSchool.get(Integer.parseInt(asdff.getText())).getLname() + ", " + elemSchool.get(Integer.parseInt(asdff.getText())).getFname());
						model.set(jList1.getSelectedIndex(), elemSchool.get(Integer.parseInt(asdff.getText())).getIdnum() + " " + elemSchool.get(Integer.parseInt(asdff.getText())).getLname() + ", " + elemSchool.get(Integer.parseInt(asdff.getText())).getFname() + " Grade " + elemSchool.get(Integer.parseInt(asdff.getText())).getGdLevel());
					}
					else if (lblasdf.getText() == "m") {
						middleSchool.get(Integer.parseInt(asdff.getText())).setFname(first_name);
						middleSchool.get(Integer.parseInt(asdff.getText())).setLname(last_name);
						lblName.setText(middleSchool.get(Integer.parseInt(asdff.getText())).getLname() + ", " + middleSchool.get(Integer.parseInt(asdff.getText())).getFname());
						model.addElement(middleSchool.get(i).getIdnum() + " " + middleSchool.get(i).getLname() + ", " + middleSchool.get(i).getFname() + " Grade " + middleSchool.get(i).getGdLevel());

					}
					else if (lblasdf.getText() == "h") {
						highSchool.get(Integer.parseInt(asdff.getText())).setFname(first_name);
						highSchool.get(Integer.parseInt(asdff.getText())).setLname(last_name);
						lblName.setText(highSchool.get(Integer.parseInt(asdff.getText())).getLname() + ", " + highSchool.get(Integer.parseInt(asdff.getText())).getFname());
						model.addElement(highSchool.get(i).getIdnum() + " " + highSchool.get(i).getLname() + ", " + highSchool.get(i).getFname() + " Grade " + highSchool.get(i).getGdLevel());

					}
					
				}
				else if (x == 1) {
					int sc11 = Integer.parseInt(JOptionPane.showInputDialog("New Score 1" ));
					int sc22 = Integer.parseInt(JOptionPane.showInputDialog("New Score 1" ));
					int sc33 = Integer.parseInt(JOptionPane.showInputDialog("New Score 1" ));
					if (lblasdf.getText() == "e") {
						
						elemSchool.get(Integer.parseInt(asdff.getText())).setSc1(sc11);
						elemSchool.get(Integer.parseInt(asdff.getText())).setSc2(sc22);
						elemSchool.get(Integer.parseInt(asdff.getText())).setSc3(sc33);
						model1.removeAllElements();
						model1.addElement(Integer.toString(elemSchool.get(i).getSc1()));
	        			model1.addElement(Integer.toString(elemSchool.get(i).getSc2()));
	        			model1.addElement(Integer.toString(elemSchool.get(i).getSc3()));
					}
					else if (lblasdf.getText() == "m") {
						middleSchool.get(Integer.parseInt(asdff.getText())).setSc1(sc11);
						middleSchool.get(Integer.parseInt(asdff.getText())).setSc2(sc22);
						middleSchool.get(Integer.parseInt(asdff.getText())).setSc3(sc33);
						model1.removeAllElements();
						model1.addElement(Integer.toString(middleSchool.get(i).getSc1()));
	        			model1.addElement(Integer.toString(middleSchool.get(i).getSc2()));
	        			model1.addElement(Integer.toString(middleSchool.get(i).getSc3()));
	        		}
					else if (lblasdf.getText() == "h") {
						highSchool.get(Integer.parseInt(asdff.getText())).setSc1(sc11);
						highSchool.get(Integer.parseInt(asdff.getText())).setSc2(sc22);
						highSchool.get(Integer.parseInt(asdff.getText())).setSc3(sc33);
						model1.removeAllElements();
						model1.addElement(Integer.toString(highSchool.get(i).getSc1()));
	        			model1.addElement(Integer.toString(highSchool.get(i).getSc2()));
	        			model1.addElement(Integer.toString(highSchool.get(i).getSc3()));
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
				}
			}
		});
		
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model1.removeAllElements();
				String first_name = JOptionPane.showInputDialog("Enter First Name you are searching for" );
				int asdfr = 0;
				for (int i = 0; i < highSchool.size(); i++) {
	        		if (highSchool.get(i).getFname().compareToIgnoreCase(first_name) == 0) {
	        			lblName.setText(highSchool.get(i).getLname() + ", " + highSchool.get(i).getFname());
	        			lblGrade.setText("Grade " + highSchool.get(i).getGdLevel());
	        			model1.addElement(Integer.toString(highSchool.get(i).getSc1()));
	        			model1.addElement(Integer.toString(highSchool.get(i).getSc2()));
	        			model1.addElement(Integer.toString(highSchool.get(i).getSc3()));
	        			DecimalFormat df = new DecimalFormat("###.###");
	        			lblAvg.setText("Total Grade : " + df.format(highSchool.get(i).getAvg()));
	        			asdfr++;
	        		}
	        	}
	        	
	        	for (int i = 0; i < elemSchool.size(); i++) {
	        		if (elemSchool.get(i).getFname().compareToIgnoreCase(first_name) == 0) {
	        			lblName.setText(elemSchool.get(i).getLname() + ", " + elemSchool.get(i).getFname());
	        			lblGrade.setText("Grade " + elemSchool.get(i).getGdLevel());
	        			model1.addElement(Integer.toString(elemSchool.get(i).getSc1()));
	        			model1.addElement(Integer.toString(elemSchool.get(i).getSc2()));
	        			model1.addElement(Integer.toString(elemSchool.get(i).getSc3()));
	        			DecimalFormat df = new DecimalFormat("###.###");
	        			lblAvg.setText("Average : " + df.format(elemSchool.get(i).getAvg()));
	        			asdfr++;
	        		}
	        	}
	        	
	        	for (int i = 0; i < middleSchool.size(); i++) {
	        		if (middleSchool.get(i).getFname().compareToIgnoreCase(first_name) == 0) {
	        			lblName.setText(middleSchool.get(i).getLname() + ", " + middleSchool.get(i).getFname());
	        			lblGrade.setText("Grade " + middleSchool.get(i).getGdLevel());
	        			model1.addElement(Integer.toString(middleSchool.get(i).getSc1()));
	        			model1.addElement(Integer.toString(middleSchool.get(i).getSc2()));
	        			model1.addElement(Integer.toString(middleSchool.get(i).getSc3()));
	        			DecimalFormat df = new DecimalFormat("###.###");
	        			lblAvg.setText("Average : " + df.format(middleSchool.get(i).getAvg()));
	        			asdfr++;
	        		}
	        	}
	        	if (asdfr == 0) {
	        		JOptionPane.showMessageDialog( null, "Student not found" );
	        	}
			}
		});
		
		JButton btnSort = new JButton("Sort");
		btnSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.removeAllElements();
				for(int i = 0; i < elemSchool.size(); i++) {
					for (int j = i + 1; j < elemSchool.size(); j++) {
						if (elemSchool.get(i).getGdLevel() < elemSchool.get(j).getGdLevel()) {
							EStudent tempE = new EStudent(elemSchool.get(i));
							elemSchool.get(i).set(elemSchool.get(j));
							elemSchool.get(j).set(tempE);

						}
					}
				}
				for (int i = 0; i < elemSchool.size(); i++) {
					for (int j = i + 1; j < elemSchool.size(); j++) {
						if (elemSchool.get(i).getLname().compareToIgnoreCase(elemSchool.get(j).getLname()) > 0 && elemSchool.get(i).getGdLevel() == elemSchool.get(j).getGdLevel()) {
							EStudent tempE = new EStudent(elemSchool.get(i));
							elemSchool.get(i).set(elemSchool.get(j));
							elemSchool.get(j).set(tempE);
						}
						
					}
				}
				for (int i = 0; i < elemSchool.size(); i++) {
					for (int j = i + 1; j < elemSchool.size(); j++) {
						if (elemSchool.get(i).getLname().compareToIgnoreCase(elemSchool.get(j).getLname()) == 0 && elemSchool.get(i).getGdLevel() == elemSchool.get(j).getGdLevel() && elemSchool.get(i).getFname().compareToIgnoreCase(elemSchool.get(j).getFname()) > 0) {
							EStudent tempE = new EStudent(elemSchool.get(i));
							elemSchool.get(i).set(elemSchool.get(j));
							elemSchool.get(j).set(tempE);
						}
						
					}
				}
				
				for(int i = 0; i < highSchool.size(); i++) {
					for (int j = i + 1; j < highSchool.size(); j++) {
						if (highSchool.get(i).getGdLevel() < highSchool.get(j).getGdLevel()) {
							HStudent tempH = new HStudent(highSchool.get(i));
							highSchool.get(i).set(highSchool.get(j));
							highSchool.get(j).set(tempH);
						}
					}
				}
				for (int i = 0; i < highSchool.size(); i++) {
					for (int j = i + 1; j < highSchool.size(); j++) {
						if (highSchool.get(i).getLname().compareToIgnoreCase(highSchool.get(j).getLname()) > 0 && highSchool.get(i).getGdLevel() == highSchool.get(j).getGdLevel()) {
							HStudent tempH = new HStudent(highSchool.get(i));
							highSchool.get(i).set(highSchool.get(j));
							highSchool.get(j).set(tempH);
						}
						
					}
				}
				for (int i = 0; i < highSchool.size(); i++) {
					for (int j = i + 1; j < highSchool.size(); j++) {
						if (highSchool.get(i).getLname().compareToIgnoreCase(highSchool.get(j).getLname()) == 0 && highSchool.get(i).getGdLevel() == highSchool.get(j).getGdLevel() && highSchool.get(i).getFname().compareToIgnoreCase(highSchool.get(j).getFname()) > 0) {
							HStudent tempH = new HStudent(highSchool.get(i));
							highSchool.get(i).set(highSchool.get(j));
							highSchool.get(j).set(tempH);
						}
						
					}
				}
				
				for(int i = 0; i < middleSchool.size(); i++) {
					for (int j = i + 1; j < middleSchool.size(); j++) {
						if (middleSchool.get(i).getGdLevel() < middleSchool.get(j).getGdLevel()) {
							MStudent tempM = new MStudent(middleSchool.get(i));
							middleSchool.get(i).set(middleSchool.get(j));
							middleSchool.get(j).set(tempM);
						}
					}
				}
				for (int i = 0; i < middleSchool.size(); i++) {
					for (int j = i + 1; j < middleSchool.size(); j++) {
						if (middleSchool.get(i).getLname().compareToIgnoreCase(middleSchool.get(j).getLname()) > 0 && middleSchool.get(i).getGdLevel() == middleSchool.get(j).getGdLevel()) {
							MStudent tempM = new MStudent(middleSchool.get(i));
							middleSchool.get(i).set(middleSchool.get(j));
							middleSchool.get(j).set(tempM);
						}
						
					}
				}
				for (int i = 0; i < middleSchool.size(); i++) {
					for (int j = i + 1; j < middleSchool.size(); j++) {
						if (middleSchool.get(i).getLname().compareToIgnoreCase(middleSchool.get(j).getLname()) == 0 && middleSchool.get(i).getGdLevel() == middleSchool.get(j).getGdLevel() && middleSchool.get(i).getFname().compareToIgnoreCase(middleSchool.get(j).getFname()) > 0) {
							MStudent tempM = new MStudent(middleSchool.get(i));
							middleSchool.get(i).set(middleSchool.get(j));
							middleSchool.get(j).set(tempM);
						}
						
					}
				}
				for (int i = 0; i < highSchool.size(); i++) {
					model.addElement(highSchool.get(i).getIdnum() + " " + highSchool.get(i).getLname() + ", " + highSchool.get(i).getFname() + " Grade " + highSchool.get(i).getGdLevel());
				}
				for (int i = 0; i < middleSchool.size(); i++) {
					model.addElement(middleSchool.get(i).getIdnum() + " " + middleSchool.get(i).getLname() + ", " + middleSchool.get(i).getFname() + " Grade " + middleSchool.get(i).getGdLevel());
				}
				for (int i = 0; i < elemSchool.size(); i++) {
					model.addElement(elemSchool.get(i).getIdnum() + " " + elemSchool.get(i).getLname() + ", " + elemSchool.get(i).getFname() + " Grade " + elemSchool.get(i).getGdLevel());
				}
			}
		});
		btnSort.setBounds(405, 83, 206, 23);
		frame.getContentPane().add(btnSort);
		//student loan
		btnSearch.setBounds(508, 32, 103, 23);
		frame.getContentPane().add(btnSearch);
		
		MouseListener mouseListener = new MouseAdapter() {
		    public void mouseClicked(MouseEvent e) {
		    		model1.removeAllElements();
		        	String[] asdf = jList1.getSelectedValue().toString().split(" ");
		        	int tempid = (Integer.parseInt(asdf[0]));
		        	lblasdf.setText(Integer.toString(tempid));
		        	int stu = 1000;
		        	model1.removeAllElements();
		        	for (int i = 0; i < highSchool.size(); i++) {
		        		if (highSchool.get(i).getIdnum() == tempid) {
		        			lblName.setText(highSchool.get(i).getLname() + ", " + highSchool.get(i).getFname());
		        			lblGrade.setText("Grade " + highSchool.get(i).getGdLevel());
		        			model1.addElement("Test 60%: " + Integer.toString(highSchool.get(i).getSc1()));
		        			model1.addElement("Quizzes 30% " + Integer.toString(highSchool.get(i).getSc2()));
		        			model1.addElement("Homework 10% " + Integer.toString(highSchool.get(i).getSc3()));
		        			DecimalFormat df = new DecimalFormat("###.###");
		        			lblAvg.setText("Total Grade : " + df.format(highSchool.get(i).getAvg()));
		        		}
		        	}
		        	
		        	for (int i = 0; i < elemSchool.size(); i++) {
		        		if (elemSchool.get(i).getIdnum() == tempid) {
		        			lblName.setText(elemSchool.get(i).getLname() + ", " + elemSchool.get(i).getFname());
		        			lblGrade.setText("Grade " + elemSchool.get(i).getGdLevel());
		        			model1.addElement("Test 33.33%: " + Integer.toString(elemSchool.get(i).getSc1()));
		        			model1.addElement("Quizzes 33.33%: " + Integer.toString(elemSchool.get(i).getSc2()));
		        			model1.addElement("Homework 33.33%: " + Integer.toString(elemSchool.get(i).getSc3()));
		        			DecimalFormat df = new DecimalFormat("###.###");
		        			lblAvg.setText("Total Grade : " + df.format(elemSchool.get(i).getAvg()));
		        		}
		        	}
		        	
		        	for (int i = 0; i < middleSchool.size(); i++) {
		        		if (middleSchool.get(i).getIdnum() == tempid) {
		        			lblName.setText(middleSchool.get(i).getLname() + ", " + middleSchool.get(i).getFname());
		        			lblGrade.setText("Grade " + middleSchool.get(i).getGdLevel());
		        			model1.addElement("Test 40%: " + Integer.toString(middleSchool.get(i).getSc1()));
		        			model1.addElement("Quizzes 35%: " + Integer.toString(middleSchool.get(i).getSc2()));
		        			model1.addElement("Homework 25%: " + Integer.toString(middleSchool.get(i).getSc3()));
		        			DecimalFormat df = new DecimalFormat("###.###");
		        			lblAvg.setText("Total Grade : " + df.format(middleSchool.get(i).getAvg()));
		        		}
		        	}
		        	
		         }
		    
		};
		jList1.addMouseListener(mouseListener);
		
		JButton btnTotalFees = new JButton("Total Fees");
		btnTotalFees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				JOptionPane.showMessageDialog( null, "Total fees are $" + Student.totalFees );
				
			}
		});
		btnTotalFees.setBounds(405, 58, 103, 23);
		frame.getContentPane().add(btnTotalFees);
		
		JButton btnTotalStudents = new JButton("Total Students");
		btnTotalStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = highSchool.size() + elemSchool.size() + middleSchool.size();
				JOptionPane.showMessageDialog( null, "Total number of students: " + x + "\nTotal High schoolers: " + highSchool.size() + "\nTotal Middle schoolers: " + middleSchool.size() + "\nTotal Elementary students: " + elemSchool.size());
				
				
			}
		});
		btnTotalStudents.setBounds(508, 58, 103, 23);
		frame.getContentPane().add(btnTotalStudents);
		
		
		frame.setVisible(true);
		
		
	}
}
