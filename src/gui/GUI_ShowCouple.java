/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import contraceptiveMethodChoice.Couple;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import kNNAlgorithm.Neighbour;

/**
 *
 * @author Lucas
 */
public class GUI_ShowCouple extends javax.swing.JFrame {

    // array with the list of neighbours
    private ArrayList<Neighbour> neighbourhood = new ArrayList<>();
    private Couple point;
    
    
    public GUI_ShowCouple() {
        initComponents();
        
        initTable();
        
        populateTable();
    }
    
    public GUI_ShowCouple(ArrayList<Neighbour> neighbourhood, Couple couple) {
        initComponents();
        
        initTable();
        
        this.neighbourhood = neighbourhood;
        this.point = couple;
        populateTable();
    }
    
    private void initTable() {
        TableColumn col = new TableColumn();
        col = this.jTCouple.getColumnModel().getColumn(0);
        col.setPreferredWidth(50);
        col = this.jTCouple.getColumnModel().getColumn(1);
        col.setPreferredWidth(75);
        col = this.jTCouple.getColumnModel().getColumn(2);
        col.setPreferredWidth(100);
        col = this.jTCouple.getColumnModel().getColumn(3);
        col.setPreferredWidth(100);
        col = this.jTCouple.getColumnModel().getColumn(4);
        col.setPreferredWidth(75);
        col = this.jTCouple.getColumnModel().getColumn(5);
        col.setPreferredWidth(100);
        col = this.jTCouple.getColumnModel().getColumn(6);
        col.setPreferredWidth(100);
        col = this.jTCouple.getColumnModel().getColumn(7);
        col.setPreferredWidth(100);
        col = this.jTCouple.getColumnModel().getColumn(8);
        col.setPreferredWidth(100);
        col = this.jTCouple.getColumnModel().getColumn(9);
        col.setPreferredWidth(120);
        col = this.jTCouple.getColumnModel().getColumn(10);
        col.setPreferredWidth(100);
        col = this.jTCouple.getColumnModel().getColumn(11);
        col.setPreferredWidth(75);
    }
    
    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) this.jTCouple.getModel();
        //model.addRow(new Object[]{"teste 1", "Column 2", "Column 3"});
        
        Neighbour n = new Neighbour(-1, this.point, this.point);
        model.addRow( newNeighbourRow(n) );
        for(Neighbour neighbour : this.neighbourhood) {
            model.addRow( newNeighbourRow(neighbour) );
        }
    }
    
    private Object[] newNeighbourRow(Neighbour neighbour) {
        
        Couple couple = neighbour.getNeighbour();
        
        Object[] obj = new Object[] {
                neighbour.getIndex(),
                couple.getWifeAge(),
                categoryMean( couple.getWifeEducation() ),
                categoryMean( couple.getHusbandEducation() ),
                couple.getNumberChildren(),
                (couple.isWifeReligion())? "1[Islam]": "0[Non-Islam]",
                (couple.isWifeWork())? "1[No]": "0[Yes]",
                categoryMean( couple.getHusbandOccupation() ),
                categoryMean( couple.getStandardLivingIndex() ),
                (couple.isMediaExposure())? "1[Not good]": "0[Good]",
                coupleClass( couple.getContraceptiveMethod() ),
                (int)(neighbour.getSimilarity()*100) + "%"
            };
        
        return obj;
    }
    
    private String categoryMean (int category) {
        String rate = "";
        switch(category) {
            case 1: 
                rate = "low";
                break;
            case 2: 
                rate = "medium";
                break;
            case 3: 
                rate = "regular";
                break;
            case 4: 
                rate = "high";
                break;
            default:
                break;
        }
        return category + "[" + rate + "]";
    }
    
    private String coupleClass (int couple) {
        String rate = "";
        switch(couple) {
            case 1: 
                rate = "No-use";
                break;
            case 2: 
                rate = "Long-term";
                break;
            case 3: 
                rate = "Short-term";
                break;
            case 0: 
                rate = "No Class";
                break;
            default:
                break;
        }
        return couple + "[" + rate + "]";
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
        jTCouple = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTCouple.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "W's Age", "W' Edu.", "H's Edu.", "N Children", "W's Religion", "W's works?", "H's occupation", "S. of living", "Media exposure", "Class", "Similarity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTCouple.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTCouple);
        if (jTCouple.getColumnModel().getColumnCount() > 0) {
            jTCouple.getColumnModel().getColumn(0).setResizable(false);
            jTCouple.getColumnModel().getColumn(1).setResizable(false);
            jTCouple.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTCouple.getColumnModel().getColumn(2).setResizable(false);
            jTCouple.getColumnModel().getColumn(3).setResizable(false);
            jTCouple.getColumnModel().getColumn(4).setResizable(false);
            jTCouple.getColumnModel().getColumn(5).setResizable(false);
            jTCouple.getColumnModel().getColumn(6).setResizable(false);
            jTCouple.getColumnModel().getColumn(7).setResizable(false);
            jTCouple.getColumnModel().getColumn(8).setResizable(false);
            jTCouple.getColumnModel().getColumn(9).setResizable(false);
            jTCouple.getColumnModel().getColumn(10).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_ShowCouple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_ShowCouple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_ShowCouple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_ShowCouple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_ShowCouple().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTCouple;
    // End of variables declaration//GEN-END:variables
}
