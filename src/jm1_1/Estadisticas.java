    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jm1_1;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import jm.Dominio.Puntajes;
import jmRepositorio.Jm1repository1;
import jmRepositorio.PuntajesRepository;

/**
 *
 * @author USUARIO
 */
public class Estadisticas extends javax.swing.JInternalFrame {
    
PuntajesRepository punto = new PuntajesRepository();
Jm1repository1 jm =new Jm1repository1();
    /**
     * Creates new form Estadistica
     */
    public Estadisticas() {
        initComponents();
        
         llenar_tabla();
         setCellRender(tbResult);
    }
    
      private void llenar_tabla(){
        ArrayList<Puntajes> puntajes= punto.getPuntajes();
        int tamaño=puntajes.size();
        DefaultTableModel ModelDatos = new DefaultTableModel();
        try {
            String[] columnNames = {"PRIMER NIVEL","SEGUNDO NIVEL","TERCER NIVEL"};
            ModelDatos.setColumnIdentifiers(columnNames);
            Object[] fila = new Object[tbResult.getColumnCount()];
            for(int i=0;i<tamaño;i++){
                fila[0] = puntajes.get(i).getPrimer_nivel();
                fila[1] = puntajes.get(i).getSegundo_nivel();
                fila[2] = puntajes.get(i).getTercer_nivel();
              
                
                ModelDatos.addRow(fila);
            }
            
        } catch (Exception ex) {
          //  System.out.println("Error en el metodo llenar el arrayList "+ex);
        }
        tbResult.setModel(ModelDatos);
        TableColumnModel columnModel = tbResult.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(300);
        columnModel.getColumn(1).setPreferredWidth(300);
        columnModel.getColumn(2).setPreferredWidth(300);
        
    }
    
     public void setCellRender(JTable table) {
        Enumeration<TableColumn> en = table.getColumnModel().getColumns();
        while (en.hasMoreElements()) {
            TableColumn tc = en.nextElement();
            tc.setCellRenderer(new CellRender());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbResult = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 153));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Estadistica");
        setToolTipText("");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbResult);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 630, 160));

        jLabel1.setFont(new java.awt.Font("Castellar", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("SU RESULTADO OBTENIDO EN CADA NIVEL ES EL SIGUIENTE :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 700, 20));

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setForeground(new java.awt.Color(0, 102, 153));
        jButton1.setText("ACTUALIZAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 120, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        llenar_tabla();
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbResult;
    // End of variables declaration//GEN-END:variables
}
