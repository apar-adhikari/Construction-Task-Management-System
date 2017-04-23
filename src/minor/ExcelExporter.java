/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minor;

/**
 *
 * @author Bikash
 */
import java.io.*;
import javax.swing.*;
import javax.swing.table.TableModel;
import java.util.*;

public class ExcelExporter {
    ExcelExporter(){}

    /**
     *
     * @param table
     * @param file
     */
    public void exportTable(JTable table,File file) throws IOException{
        
        TableModel model=table.getModel();
        FileWriter out=new FileWriter(file);
       // BufferedWriter bw= new BufferedWriter(out);
        for(int i=1;i<model.getColumnCount();i++ ){
            out.write(model.getColumnName(i)+"\t");
        }
     out.write("\n");
        for(int i=0;i<model.getRowCount();i++ ){
            for(int j=1;j<model.getColumnCount();j++ ){
            out.write(model.getValueAt(i, j).toString()+"\t");
            
           }
            out.write("\n");
        }
        out.close();
     JOptionPane.showMessageDialog(null, "Created:C:/Users/Bikash/Documents");
    }
    
      
}
