package mproj;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;

public class asdf {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					asdf window = new asdf();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public asdf() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 440, 609);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("New label");
		lblName.setBounds(10, 11, 125, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblGrade = new JLabel("New label");
		lblGrade.setBounds(10, 62, 63, 14);
		frame.getContentPane().add(lblGrade);
		
		JList list = new JList();
		list.setBounds(138, 10, 63, 66);
		frame.getContentPane().add(list);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdd.setBounds(211, 7, 103, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete.setBounds(211, 32, 103, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnChange = new JButton("Change");
		btnChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnChange.setBounds(314, 7, 103, 23);
		frame.getContentPane().add(btnChange);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearch.setBounds(314, 32, 103, 23);
		frame.getContentPane().add(btnSearch);
		
		JButton btnTotalFees = new JButton("Total Fees");
		btnTotalFees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTotalFees.setBounds(211, 58, 103, 23);
		frame.getContentPane().add(btnTotalFees);
		
		JButton btnTotalStudents = new JButton("Total Students");
		btnTotalStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTotalStudents.setBounds(314, 58, 103, 23);
		frame.getContentPane().add(btnTotalStudents);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 117, 404, 446);
		frame.getContentPane().add(scrollPane);
		
		JList jList1 = new JList();
		scrollPane.setViewportView(jList1);
		
		JButton btnSort = new JButton("Sort");
		btnSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSort.setBounds(211, 83, 206, 23);
		frame.getContentPane().add(btnSort);
		
		JLabel lblAvg = new JLabel("New label");
		lblAvg.setBounds(10, 92, 191, 14);
		frame.getContentPane().add(lblAvg);
	}
}
