/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tamagotchi;


import javax.swing.ImageIcon;

/**
 *
 * @author Moni
 */
public class Juego extends javax.swing.JFrame {
    
    private final Tamagotchi pet;
    /**
     * Creates new form Juego
     */
    public Juego() {
        //inicializo el objeto tamagotchi
        pet = new Tamagotchi(50, 50, 50, "rodolfo");
        
        initComponents();
        setSize(600, 500);
        this.setLocationRelativeTo(this);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icon.png")).getImage());
        
        //muestro stats en pantalla al iniciar
        lblSalud.setText(pet.getSalud()+"");
        lblEnergia.setText(pet.getEnergia()+"");
        lblAnimo.setText(pet.getAnimo()+"");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnComer = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        btnBañar = new javax.swing.JButton();
        btnMimir = new javax.swing.JButton();
        btnApapachar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblEnergia = new javax.swing.JLabel();
        lblSalud = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblAnimo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnComer.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnComer.setText("Comer");
        btnComer.setActionCommand("");
        btnComer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComerActionPerformed(evt);
            }
        });

        btnJugar.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnJugar.setText("Jugar");
        btnJugar.setActionCommand("");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        btnBañar.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnBañar.setText("Bañar");
        btnBañar.setActionCommand("");
        btnBañar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBañarActionPerformed(evt);
            }
        });

        btnMimir.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnMimir.setText("Mimir");
        btnMimir.setActionCommand("");
        btnMimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMimirActionPerformed(evt);
            }
        });

        btnApapachar.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnApapachar.setText("Apapachar");
        btnApapachar.setActionCommand("");
        btnApapachar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApapacharActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("jLabel1");

        lblEnergia.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        lblEnergia.setText("0");

        lblSalud.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        lblSalud.setText("0");

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jLabel2.setText(">Salud");

        jLabel3.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jLabel3.setText(">Energia");

        lblAnimo.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        lblAnimo.setText("0");

        jLabel4.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jLabel4.setText(">Animo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAnimo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnApapachar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnComer, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBañar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMimir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalud)
                    .addComponent(jLabel3)
                    .addComponent(lblEnergia)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(lblAnimo))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnJugar)
                    .addComponent(btnApapachar)
                    .addComponent(btnComer)
                    .addComponent(btnBañar)
                    .addComponent(btnMimir))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    //metodo para mostrar estadisticas en pantalla
    private void mostrarStats(){
        lblSalud.setText(pet.getSalud()+"");
        lblAnimo.setText(pet.getAnimo()+"");
        lblEnergia.setText(pet.getEnergia()+"");
    }
    
    //prueba para imagen
    
    //metodos para funcionalidad de los botones
    private void btnBañarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBañarActionPerformed
        pet.bañar();
        mostrarStats();
    }//GEN-LAST:event_btnBañarActionPerformed

    private void btnComerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComerActionPerformed
        pet.comer();
        mostrarStats();
    }//GEN-LAST:event_btnComerActionPerformed

    private void btnApapacharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApapacharActionPerformed
        pet.apapacho();
        mostrarStats();
    }//GEN-LAST:event_btnApapacharActionPerformed

    private void btnMimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMimirActionPerformed
        pet.mimir();
        mostrarStats();
    }//GEN-LAST:event_btnMimirActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        pet.jugar();
        mostrarStats();
    }//GEN-LAST:event_btnJugarActionPerformed

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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApapachar;
    private javax.swing.JButton btnBañar;
    private javax.swing.JButton btnComer;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnMimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAnimo;
    private javax.swing.JLabel lblEnergia;
    private javax.swing.JLabel lblSalud;
    // End of variables declaration//GEN-END:variables
}
