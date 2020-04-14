package mproj;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.*;
public class Tester {
	public static void main(String [] args) {
		int num = 0;
		Matrix[] m = new Matrix[10];
		JButton create = new JButton("Create new matrix");
		JButton add = new JButton("Add");
        JButton subtract = new JButton("Subtract");
        JButton multiply = new JButton("Multiply");
        JButton scalar = new JButton("Scalar Multiplication");
        JButton transpose = new JButton("Transpose");
        JButton edit = new JButton("Edit");
        JButton view = new JButton("View");
        
        JPanel p = new JPanel();
        p.add(add);
        p.add(subtract);
        p.add(multiply);
        p.add(scalar);
        p.add(transpose);
        p.add(edit);
        p.add(create);
        p.add(view);
        p.setSize(600,500);
        
        
        
        String row = JOptionPane.showInputDialog("Enter the amount of rows for matrix 1");
        String column = JOptionPane.showInputDialog("Enter the amount of columns for matrix 1");
    	m[0] = (new Matrix(Integer.valueOf(row), Integer.valueOf(column)));
    	
        DefaultTableModel tableModel = new DefaultTableModel(m[0].g(), m[0].c());
        

        JTable[] mat = new JTable[10];
        mat[0] = new JTable(tableModel);
        for (int i = 1; i <= 9; i++) {
        	mat[i] = new JTable(tableModel);
        }
        JScrollPane matrix1Scroll = new JScrollPane(mat[0]);
        JPanel p2 = new JPanel();
        p2.add(matrix1Scroll);
        JFrame g = new JFrame();
        p.setLocation(0,200);
        g.add(p);
        g.setSize(600,500);

        g.setVisible(true);
        tableModel.addTableModelListener(tableModelEvent -> {
            
        	for (int i = 0; i <= 9; i++) {
        	if (mat[i].isEditing()){
                Object value = mat[i].getValueAt(mat[i].getSelectedRow(), mat[i].getSelectedColumn());
                m[i].set(mat[i].getSelectedRow(),mat[i].getSelectedColumn(),Double.parseDouble((String)value));
            }
        	}
        });
        
        create.addActionListener(actionEvent -> {
        	Integer n = Integer.valueOf(JOptionPane.showInputDialog("Matrix Number"));
        	if (m[n-1] == null) {
        	String rows2 = JOptionPane.showInputDialog("Enter the amount of rows");
            String columns2 = JOptionPane.showInputDialog("Enter the amount of columns");
        	m[n-1] = (new Matrix(Integer.valueOf(rows2), Integer.valueOf(columns2)));
        	JFrame gui3 = new JFrame();
        	tableModel.setDataVector(m[n-1].g(), m[n-1].c());
            mat[n-1] = new JTable(tableModel);
            
            matrix1Scroll.getViewport().add(mat[n-1]);

            gui3.add(matrix1Scroll);
            gui3.setSize(1000,500);
            gui3.setVisible(true);

        	}
        	else JOptionPane.showMessageDialog(null, "There is a matrix already there");
        });
        
        edit.addActionListener(actionEvent -> {
        	Integer n = Integer.valueOf(JOptionPane.showInputDialog("Matrix Number"));
        	if (m[n-1] != null) {

        	JFrame gui3 = new JFrame();
        	tableModel.setDataVector(m[n-1].g(), m[n-1].c());
            mat[n-1] = new JTable(tableModel);
            
            matrix1Scroll.getViewport().add(mat[n-1]);

            gui3.add(matrix1Scroll);
            gui3.setSize(1000,500);
            gui3.setVisible(true);
            tableModel.fireTableDataChanged();
        	}
        	else JOptionPane.showMessageDialog(null, "There is no matrix there");
       });
        view.addActionListener(actionEvent -> {
        	JFrame gui3 = new JFrame();
        	JScrollPane[] j = new JScrollPane[10];
        	JPanel[] t = new JPanel[10];
        	gui3.setLayout(new GridBagLayout());
        	for (int n = 1; n <= 10; n++) {
        		if (m[n-1] != null) {
        	
		        	tableModel.setDataVector(m[n-1].g(), m[n-1].c());
		            mat[n-1] = new JTable(tableModel);
	
		            
		            j[n-1] = new JScrollPane(mat[n-1]);
		            t[n-1].add(j[n-1]);
		            gui3.add(t[n-1]);
		            
		            gui3.setSize(1000,500);
        		}
        	}
        	gui3.setVisible(true);
       });
        
	}
}
