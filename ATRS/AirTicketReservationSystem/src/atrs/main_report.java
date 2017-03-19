/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atrs;

import java.util.Map;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import javax.swing.JOptionPane;
/**
 *
 * @author Sameera
 */
public class main_report {
    public void view(Map m, String Path){
        try {
            DBconnect dbconnect = new DBconnect();
            JasperReport jr = JasperCompileManager.compileReport(Path);
            JasperPrint jp = JasperFillManager.fillReport(jr, m, dbconnect.ConnectDB());
            
            JasperViewer.viewReport(jp, false);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error in viewing report");
        }
    }
}
