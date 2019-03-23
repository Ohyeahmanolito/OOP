/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.six.partOne;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author ITRO
 */
public class SampleGUI {

    public SampleGUI() {
        JFrame frame;

        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);

        model.addColumn("Col1");
        model.addColumn("Col2");

        String[] rowValues = {"at COL 1", "at COL 2"};
        // Create the first row
        model.insertRow(0, rowValues);

        rowValues = new String[]{"NNN", "KKK", "FFF"};
        model.insertRow(1, rowValues);

        rowValues = new String[]{"XXX"};
        int position = 2;
        model.insertRow(position, rowValues);

        rowValues = new String[]{"Masarap na balot", "makikita sa red"};
        position = 2;
        model.insertRow(position, rowValues);

        JScrollPane sp = new JScrollPane(table);

        frame = new JFrame();
        frame.add(sp);
        frame.setTitle("JTable Example");
        frame.setSize(500, 200);
        frame.setVisible(true);
    }
}
