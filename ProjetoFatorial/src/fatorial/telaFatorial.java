package fatorial;

/**
 * @author diarley
 */
public class telaFatorial extends javax.swing.JFrame {

    public telaFatorial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JSpinner();
        lblFatorial = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblFrase = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel1.setText("! =");

        txtNumero.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        txtNumero.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));
        txtNumero.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtNumeroStateChanged(evt);
            }
        });

        lblFatorial.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        lblFatorial.setForeground(new java.awt.Color(255, 0, 0));
        lblFatorial.setText("1");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel3.setText("Calculo de fatorial");

        lblFrase.setText("frase");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFrase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFatorial, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFatorial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(lblFrase, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtNumeroStateChanged
        /*
        int numero = Integer.parseInt(txtNumero.getValue().toString());
        int fatorial = 1;
        int contador = numero;
        
        // 5! = 5 x 4 x 3 x 2 x 1
        
        while (contador >= 1){
            fatorial *= contador;
            contador--;
        }
        lblFatorial.setText(Integer.toString(fatorial));
        */
        


        int num = Integer.parseInt(txtNumero.getValue().toString());
        int i = 0; // Inicializa o índice com zero
        int r = 1; 
        String frase = num + "!= "; // Todos os indíces ex: 3 2 1
        String mult = " X "; // Inclui o x entre os Índices
    
        if(num == 0)  { // Número sendo zero teremos != 1
            frase += 1;
        }
        while(i < num) {           
            r += (i*r);   // Encontra o fatorial
            frase += (num - i)+mult; // Todos os números que levam ao fatorial
            i++;
        }
        
        lblFrase.setText(frase);
        lblFatorial.setText(Integer.toString(r));
    }//GEN-LAST:event_txtNumeroStateChanged

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
            java.util.logging.Logger.getLogger(telaFatorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaFatorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaFatorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaFatorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaFatorial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblFatorial;
    private javax.swing.JLabel lblFrase;
    private javax.swing.JSpinner txtNumero;
    // End of variables declaration//GEN-END:variables
}
