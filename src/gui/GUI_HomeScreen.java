/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import kNNAlgorithm.kNNAlgorithm;
import contraceptiveMethodChoice.*;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import kNNAlgorithm.Neighbour;
import weka.WekaConnection;

/**
 *
 * @author Lucas
 */
public class GUI_HomeScreen extends javax.swing.JFrame {

    
    private Couple couple;
    private final ArrayList<Couple> coupleList = new ArrayList<>();
    private final kNNAlgorithm kNN;
    /**
     * Creates new form HomeScreen
     */
    public GUI_HomeScreen() {
        initializeHomeScreen();
        this.kNN = new kNNAlgorithm();
    }
    // couple object come back from createCouple
    public GUI_HomeScreen(Couple couple) {
        initializeHomeScreen();
        
        this.couple = couple;
        this.kNN = new kNNAlgorithm();
        this.kNN.setPoint(couple);
        
        
        jLCouple.setText( "\tCouple:\t" + couple.showCouple() );
        
        jB_LoadCouple.setEnabled(true);
        jB_GenerateCouple.setEnabled(true);
    }
    
    private void initializeHomeScreen() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jB_CreateCouple = new javax.swing.JButton();
        jB_LoadCouple = new javax.swing.JButton();
        jLCouple = new javax.swing.JLabel();
        jB_ShowLoadCouple = new javax.swing.JButton();
        jB_RunKnnSequencial = new javax.swing.JButton();
        jB_ShowSimilarity = new javax.swing.JButton();
        jBShowKNN = new javax.swing.JButton();
        jB_RunKnn2Level = new javax.swing.JButton();
        jB_CompareRetrievement = new javax.swing.JButton();
        jB_GenerateCouple = new javax.swing.JButton();
        jB_RunJ48 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contraceptive Method Choice");

        jB_CreateCouple.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jB_CreateCouple.setAlignmentX(0.5F);
        jB_CreateCouple.setLabel("Create New Couple");
        jB_CreateCouple.setMaximumSize(new java.awt.Dimension(175, 40));
        jB_CreateCouple.setName("jB_CreateCouple"); // NOI18N
        jB_CreateCouple.setSize(new java.awt.Dimension(100, 40));
        jB_CreateCouple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_CreateCoupleActionPerformed(evt);
            }
        });

        jB_LoadCouple.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jB_LoadCouple.setText("Load Couples File");
        jB_LoadCouple.setAlignmentX(0.5F);
        jB_LoadCouple.setEnabled(false);
        jB_LoadCouple.setMaximumSize(new java.awt.Dimension(175, 40));
        jB_LoadCouple.setName("JB_CreateNewCouple"); // NOI18N
        jB_LoadCouple.setSize(new java.awt.Dimension(100, 40));
        jB_LoadCouple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_LoadCoupleActionPerformed(evt);
            }
        });

        jB_ShowLoadCouple.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jB_ShowLoadCouple.setText("Show All Couples");
        jB_ShowLoadCouple.setAlignmentX(0.5F);
        jB_ShowLoadCouple.setEnabled(false);
        jB_ShowLoadCouple.setMaximumSize(new java.awt.Dimension(175, 40));
        jB_ShowLoadCouple.setName("JB_CreateNewCouple"); // NOI18N
        jB_ShowLoadCouple.setSize(new java.awt.Dimension(100, 40));
        jB_ShowLoadCouple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ShowLoadCoupleActionPerformed(evt);
            }
        });

        jB_RunKnnSequencial.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jB_RunKnnSequencial.setText("Run kNN - Sequencial");
        jB_RunKnnSequencial.setAlignmentX(0.5F);
        jB_RunKnnSequencial.setEnabled(false);
        jB_RunKnnSequencial.setMaximumSize(new java.awt.Dimension(175, 40));
        jB_RunKnnSequencial.setName("JB_CreateNewCouple"); // NOI18N
        jB_RunKnnSequencial.setSize(new java.awt.Dimension(100, 40));
        jB_RunKnnSequencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_RunKnnSequencialActionPerformed(evt);
            }
        });

        jB_ShowSimilarity.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jB_ShowSimilarity.setText("Show All Similiraty");
        jB_ShowSimilarity.setAlignmentX(0.5F);
        jB_ShowSimilarity.setEnabled(false);
        jB_ShowSimilarity.setMaximumSize(new java.awt.Dimension(175, 40));
        jB_ShowSimilarity.setName("JB_CreateNewCouple"); // NOI18N
        jB_ShowSimilarity.setSize(new java.awt.Dimension(100, 40));
        jB_ShowSimilarity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ShowSimilarityActionPerformed(evt);
            }
        });

        jBShowKNN.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBShowKNN.setText("Show K First Sim.");
        jBShowKNN.setAlignmentX(0.5F);
        jBShowKNN.setEnabled(false);
        jBShowKNN.setMaximumSize(new java.awt.Dimension(175, 40));
        jBShowKNN.setName("JB_CreateNewCouple"); // NOI18N
        jBShowKNN.setSize(new java.awt.Dimension(100, 40));
        jBShowKNN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBShowKNNActionPerformed(evt);
            }
        });

        jB_RunKnn2Level.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jB_RunKnn2Level.setText("Run kNN - 2 Level");
        jB_RunKnn2Level.setAlignmentX(0.5F);
        jB_RunKnn2Level.setEnabled(false);
        jB_RunKnn2Level.setMaximumSize(new java.awt.Dimension(175, 40));
        jB_RunKnn2Level.setName("JB_CreateNewCouple"); // NOI18N
        jB_RunKnn2Level.setSize(new java.awt.Dimension(100, 40));
        jB_RunKnn2Level.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_RunKnn2LevelActionPerformed(evt);
            }
        });

        jB_CompareRetrievement.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jB_CompareRetrievement.setText("Compare Retrievement");
        jB_CompareRetrievement.setAlignmentX(0.5F);
        jB_CompareRetrievement.setEnabled(false);
        jB_CompareRetrievement.setMaximumSize(new java.awt.Dimension(175, 40));
        jB_CompareRetrievement.setName("JB_CreateNewCouple"); // NOI18N
        jB_CompareRetrievement.setSize(new java.awt.Dimension(100, 40));
        jB_CompareRetrievement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_CompareRetrievementActionPerformed(evt);
            }
        });

        jB_GenerateCouple.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jB_GenerateCouple.setText("Generate Couples");
        jB_GenerateCouple.setAlignmentX(0.5F);
        jB_GenerateCouple.setEnabled(false);
        jB_GenerateCouple.setMaximumSize(new java.awt.Dimension(175, 40));
        jB_GenerateCouple.setName("jB_CreateCouple"); // NOI18N
        jB_GenerateCouple.setSize(new java.awt.Dimension(100, 40));
        jB_GenerateCouple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_GenerateCoupleActionPerformed(evt);
            }
        });

        jB_RunJ48.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jB_RunJ48.setText("Run C4.5");
        jB_RunJ48.setAlignmentX(0.5F);
        jB_RunJ48.setEnabled(false);
        jB_RunJ48.setMaximumSize(new java.awt.Dimension(175, 40));
        jB_RunJ48.setName("JB_CreateNewCouple"); // NOI18N
        jB_RunJ48.setSize(new java.awt.Dimension(100, 40));
        jB_RunJ48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_RunJ48ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLCouple, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jB_RunKnnSequencial, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jB_RunKnn2Level, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jB_CreateCouple, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jB_LoadCouple, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jB_GenerateCouple, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jB_ShowLoadCouple, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jB_ShowSimilarity, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBShowKNN, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jB_CompareRetrievement, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jB_RunJ48, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLCouple, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jB_CreateCouple, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_LoadCouple, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_GenerateCouple, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jB_ShowLoadCouple, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB_RunKnnSequencial, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_RunKnn2Level, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_ShowSimilarity, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBShowKNN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_CompareRetrievement, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_RunJ48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_CreateCoupleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_CreateCoupleActionPerformed
        GUI_CreateCouple createCouple = new GUI_CreateCouple();
        createCouple.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jB_CreateCoupleActionPerformed

    private void jB_LoadCoupleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_LoadCoupleActionPerformed
        try {
        
            CoupleData coupleData = new CoupleData();
            
            coupleData.setCurrentFile();
            // add all the couples retrived
            this.coupleList.addAll( coupleData.readCoupleData() );
      
            jB_ShowLoadCouple.setEnabled(true);
            jB_RunKnnSequencial.setEnabled(true);
            jB_RunKnn2Level.setEnabled(true);
            jB_RunJ48.setEnabled(true);
        } catch (Exception e) {
            showAlert(e);
        }
        
    }//GEN-LAST:event_jB_LoadCoupleActionPerformed

    private void jB_ShowLoadCoupleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ShowLoadCoupleActionPerformed
        System.out.println("Couples: ");
        System.out.println("\t->");
        int count = 0;
        for(Couple couple : this.coupleList) {
            System.out.println(couple.showCouple());
            count++;
        }
        System.out.println("Total Couples: " + count);
        
    }//GEN-LAST:event_jB_ShowLoadCoupleActionPerformed

    private void jB_RunKnnSequencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_RunKnnSequencialActionPerformed
        // execute the kNN algorithm again
        this.kNN.setMinSimilarity(0); // the sequencial process retrives all past cases
        this.kNN.createNeighbourhood(coupleList);
        
        this.jB_ShowSimilarity.setEnabled(true);
        this.jBShowKNN.setEnabled(true);
        // if user executed the another retrivement method
        if(this.kNN.getTime2Level() != 0){
            this.jB_CompareRetrievement.setEnabled(true);
        }
    }//GEN-LAST:event_jB_RunKnnSequencialActionPerformed

    private void jB_ShowSimilarityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ShowSimilarityActionPerformed
        //this.kNN.showNeighbourhood();
        
        GUI_ShowCouple showCouple = new GUI_ShowCouple(this.kNN.getNeighbourhood(), this.couple);
        showCouple.setVisible(true);
    }//GEN-LAST:event_jB_ShowSimilarityActionPerformed

    private void jBShowKNNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBShowKNNActionPerformed
        try {
            String input = JOptionPane.showInputDialog(null, "k = ", "Type k", JOptionPane.QUESTION_MESSAGE);
            int k = Integer.parseInt(input);
            int size = this.kNN.getNeighbourhood().size();
            if(k > size || k < 0)
            {
                JOptionPane.showMessageDialog(null, 
                    "Invalid input or not similar enough neighbours!",
                    "Error!",
                    JOptionPane.ERROR_MESSAGE
                    );
                return;
            }
            
            ArrayList<Neighbour> kFirst = this.kNN.getKNN(k);
            
            GUI_ShowCouple showCouple = new GUI_ShowCouple(kFirst, this.couple);
            showCouple.setVisible(true);
            
        }
        catch(HeadlessException | NumberFormatException e) {
            showAlert(e);
        }
    }//GEN-LAST:event_jBShowKNNActionPerformed

    private void jB_RunKnn2LevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_RunKnn2LevelActionPerformed
        try{
            String input = JOptionPane.showInputDialog(null, "0-100", "Percentage", JOptionPane.QUESTION_MESSAGE);
            
            int minSimilarity = Integer.parseInt(input);
            if(minSimilarity > 100 || minSimilarity < 0)
            {   
                showAlert("Invalid input!");
                return;
            }
            
            // execute the kNN algorithm again
            this.kNN.setMinSimilarity(minSimilarity); // the sequencial process retrives all past cases
            this.kNN.createNeighbourhood(coupleList);
            
            
        
            this.jB_ShowSimilarity.setEnabled(true);
            this.jBShowKNN.setEnabled(true);
            // if user executed the another retrivement method
            if(this.kNN.getTimeSequencial() != 0){
                this.jB_CompareRetrievement.setEnabled(true);
            }
        }
        catch (HeadlessException | NumberFormatException e) {
            showAlert(e);
        }
    }//GEN-LAST:event_jB_RunKnn2LevelActionPerformed

    private void jB_CompareRetrievementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_CompareRetrievementActionPerformed

        //divide by 1000000 to get milliseconds.
        JOptionPane.showMessageDialog(null, 
            "Sequencial: " + this.kNN.getTimeSequencial()/1000 + "\n" +
            "2 Level: " + this.kNN.getTime2Level()/1000,
            "Comparative",
            JOptionPane.INFORMATION_MESSAGE
            );   
        
    }//GEN-LAST:event_jB_CompareRetrievementActionPerformed

    private void jB_GenerateCoupleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_GenerateCoupleActionPerformed
        try{
            String input = JOptionPane.showInputDialog(null, "n > 0", "Number of Couples (n)", JOptionPane.QUESTION_MESSAGE);
            int n = Integer.parseInt(input);
            if(n < 1) {
               showAlert("Invalid Input!"); 
            }
            
            for (int i = 0; i < n; i++) {
                Random seed = new Random();
                Couple c = new Couple(seed);
                
                this.coupleList.add(c);
                //System.out.println(this.listCouple.size());
            }
            jB_ShowLoadCouple.setEnabled(true);
            jB_RunKnnSequencial.setEnabled(true);
            jB_RunKnn2Level.setEnabled(true);
            jB_RunJ48.setEnabled(true);
        }
        catch(HeadlessException | NumberFormatException e){
            showAlert(e);
        }
    }//GEN-LAST:event_jB_GenerateCoupleActionPerformed

    private void jB_RunJ48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_RunJ48ActionPerformed
        WekaConnection weka = new WekaConnection();
        weka.runJ48(coupleList);
        
    }//GEN-LAST:event_jB_RunJ48ActionPerformed
    
    private void showAlert(Exception e) {
        JOptionPane.showMessageDialog(null, 
                    e,
                    "Error!",
                    JOptionPane.ERROR_MESSAGE
                    );
    }
    
    private void showAlert(String e) {
        JOptionPane.showMessageDialog(null, 
                    e,
                    "Error!",
                    JOptionPane.ERROR_MESSAGE
                    );
    }
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
            java.util.logging.Logger.getLogger(GUI_HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_HomeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBShowKNN;
    private javax.swing.JButton jB_CompareRetrievement;
    private javax.swing.JButton jB_CreateCouple;
    private javax.swing.JButton jB_GenerateCouple;
    private javax.swing.JButton jB_LoadCouple;
    private javax.swing.JButton jB_RunJ48;
    private javax.swing.JButton jB_RunKnn2Level;
    private javax.swing.JButton jB_RunKnnSequencial;
    private javax.swing.JButton jB_ShowLoadCouple;
    private javax.swing.JButton jB_ShowSimilarity;
    private javax.swing.JLabel jLCouple;
    // End of variables declaration//GEN-END:variables
}
