package jantardosfilosofos;

import java.awt.Color;
import java.util.ArrayList;

public class InterfaceGrafica extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceGrafica
     */
    private MesaDeJantar mesa;
    private ArrayList<Filosofo> listaFilosofo = new ArrayList<Filosofo>(); 
    public InterfaceGrafica() {
        initComponents();
        initializeComponentsStatus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        btnStart = new javax.swing.JButton();
        btnEnd = new javax.swing.JButton();
        txtUm = new javax.swing.JTextField();
        txtCinco = new javax.swing.JTextField();
        txtTres = new javax.swing.JTextField();
        txtQuatro = new javax.swing.JTextField();
        txtDois = new javax.swing.JTextField();
        txtGarfoUm = new javax.swing.JTextField();
        txtGarfoDois = new javax.swing.JTextField();
        txtGarfoTres = new javax.swing.JTextField();
        txtGarfoCinco = new javax.swing.JTextField();
        txtGarfoQuatro = new javax.swing.JTextField();
        txtLabelComendo = new javax.swing.JTextField();
        txtLabelPensando = new javax.swing.JTextField();
        txtLabelComFome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLabelOcupado = new javax.swing.JTextField();
        txtLabelLivre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnStart.setText("Início");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnEnd.setText("Fim");
        btnEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndActionPerformed(evt);
            }
        });

        txtUm.setText("Filosofo 01");
        txtUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUmActionPerformed(evt);
            }
        });

        txtCinco.setText("Filosofo 05");
        txtCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCincoActionPerformed(evt);
            }
        });

        txtTres.setText("Filosofo 03");

        txtQuatro.setText("Filosofo 04");

        txtDois.setText("Filosofo 02");

        txtGarfoDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGarfoDoisActionPerformed(evt);
            }
        });

        txtGarfoTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGarfoTresActionPerformed(evt);
            }
        });

        txtGarfoCinco.setEditable(false);
        txtGarfoCinco.setMinimumSize(new java.awt.Dimension(15, 30));
        txtGarfoCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGarfoCincoActionPerformed(evt);
            }
        });

        txtGarfoQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGarfoQuatroActionPerformed(evt);
            }
        });

        txtLabelComendo.setText("COMENDO");

        txtLabelPensando.setText("PENSANDO");

        txtLabelComFome.setText("COM FOME");

        jLabel1.setText("Status - Filosofos");

        jLabel2.setText("Status - Garfos");

        txtLabelOcupado.setText("OCUPADO");

        txtLabelLivre.setText("LIVRE");

        jLabel4.setIcon(new javax.swing.ImageIcon("/home/rodrigo/NetBeansProjects/JantarDosFilosofos-master/src/img/mesaImg (3).png")); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon("/home/rodrigo/NetBeansProjects/JantarDosFilosofos-master/src/img/mesaImg (1) (1) (1).png")); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon("/home/rodrigo/NetBeansProjects/JantarDosFilosofos-master/src/img/mesaImg (1) (1) (1) (1).png")); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon("/home/rodrigo/NetBeansProjects/JantarDosFilosofos-master/src/img/mesaImg (1) (1) (1) (1) (1).png")); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon("/home/rodrigo/NetBeansProjects/JantarDosFilosofos-master/src/img/mesaImg (1) (1).png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtDois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(txtCinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                        .addComponent(txtGarfoUm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtGarfoDois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel5)
                                .addGap(70, 70, 70))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(txtQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(txtGarfoCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtGarfoQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel6)
                                        .addGap(62, 62, 62)
                                        .addComponent(txtTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(txtGarfoTres, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(72, 72, 72)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtLabelOcupado, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLabelLivre, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStart)
                    .addComponent(btnEnd)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtLabelPensando, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLabelComFome, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLabelComendo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(441, 441, 441))
            .addGroup(layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(txtUm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtUm, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(txtGarfoQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(303, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtDois, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtLabelComendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtLabelPensando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(5, 5, 5)
                                            .addComponent(txtLabelComFome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(24, 24, 24))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtGarfoUm, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtGarfoDois, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(9, 9, 9)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtLabelOcupado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(txtLabelLivre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(52, 52, 52)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btnStart)
                                                .addComponent(txtTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnEnd))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtGarfoTres, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtGarfoCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(29, 29, 29)
                                    .addComponent(jLabel8)))
                            .addContainerGap(201, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
		this.mesa = new MesaDeJantar (this);
		Filosofo f = null;
		for (int filosofo = 0; filosofo < 5; filosofo++) {
                    f = new Filosofo("Filosofo_" + filosofo, this.mesa, filosofo);
                    this.listaFilosofo.add(f);
                    f.start();
		}
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndActionPerformed
        for(int i=0; i<this.listaFilosofo.size(); i++){
            this.listaFilosofo.get(i).setStop(true);
        }
    }//GEN-LAST:event_btnEndActionPerformed

    private void txtUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUmActionPerformed

    private void txtCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCincoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCincoActionPerformed

    private void txtGarfoDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGarfoDoisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGarfoDoisActionPerformed

    private void txtGarfoQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGarfoQuatroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGarfoQuatroActionPerformed

    private void txtGarfoTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGarfoTresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGarfoTresActionPerformed

    private void txtGarfoCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGarfoCincoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGarfoCincoActionPerformed

    private void initializeComponentsStatus(){
        this.txtLabelComFome.setBackground(Color.RED);
        this.txtLabelComendo.setBackground(Color.GREEN);
        this.txtLabelPensando.setBackground(Color.GRAY);
        this.txtLabelLivre.setBackground(Color.GRAY);
        this.txtLabelOcupado.setBackground(Color.GREEN);
        this.txtUm.setBackground(Color.GRAY);
        this.txtDois.setBackground(Color.GRAY);
        this.txtTres.setBackground(Color.GRAY);
        this.txtQuatro.setBackground(Color.GRAY);
        this.txtCinco.setBackground(Color.GRAY);
        this.txtGarfoUm.setBackground(Color.GRAY);
        this.txtGarfoDois.setBackground(Color.GRAY);
        this.txtGarfoTres.setBackground(Color.GRAY);
        this.txtGarfoQuatro.setBackground(Color.GRAY);
        this.txtGarfoCinco.setBackground(Color.GRAY);
        
        this.txtUm.setEditable(false);
        this.txtDois.setEditable(false);
        this.txtTres.setEditable(false);
        this.txtQuatro.setEditable(false);
        this.txtCinco.setEditable(false);
        this.txtGarfoUm.setEditable(false);
        this.txtGarfoDois.setEditable(false);
        this.txtGarfoTres.setEditable(false);
        this.txtGarfoQuatro.setEditable(false);
        this.txtGarfoCinco.setEditable(false);
        this.txtLabelComFome.setEditable(false);
        this.txtLabelComendo.setEditable(false);
        this.txtLabelPensando.setEditable(false);
        this.txtLabelLivre.setEditable(false);
        this.txtLabelOcupado.setEditable(false);
    }
    
    private void limparCampoTexto(){
        this.txtCinco.setBackground(Color.GRAY);
        this.txtDois.setBackground(Color.GRAY);
        this.txtQuatro.setBackground(Color.GRAY);
        this.txtTres.setBackground(Color.GRAY);
        this.txtUm.setBackground(Color.GRAY);
    }
    
    private void limparCampoGarfo(){
        this.txtGarfoCinco.setBackground(Color.GRAY);
        this.txtGarfoDois.setBackground(Color.GRAY);
        this.txtGarfoQuatro.setBackground(Color.GRAY);
        this.txtGarfoTres.setBackground(Color.GRAY);
        this.txtGarfoUm.setBackground(Color.GRAY);
    }
       
    private void setComendo(int filosofo){
        if(filosofo==1){
            this.txtUm.setBackground(Color.GREEN);
        }
        else if(filosofo==2){
            this.txtDois.setBackground(Color.GREEN);
        }
        else if(filosofo==3){
            this.txtTres.setBackground(Color.GREEN);
        }
        else if(filosofo==4){
            this.txtQuatro.setBackground(Color.GREEN);
        }
        else if(filosofo==5){
                this.txtCinco.setBackground(Color.GREEN);
        }   
            
    }
    private void setPensando(int filosofo){
        if(filosofo==1) 
            this.txtUm.setBackground(Color.GRAY);
        else if(filosofo==2)
            this.txtDois.setBackground(Color.GRAY);
        else if(filosofo==3)
            this.txtTres.setBackground(Color.GRAY);
        else if(filosofo==4)
            this.txtQuatro.setBackground(Color.GRAY);
        else if(filosofo==5)   
            this.txtCinco.setBackground(Color.GRAY);
    }
    private void setComFome(int filosofo){
        if(filosofo==1) 
            this.txtUm.setBackground(Color.RED);
        else if(filosofo==2)
            this.txtDois.setBackground(Color.RED);
        else if(filosofo==3)
            this.txtTres.setBackground(Color.RED);
        else if(filosofo==4)
            this.txtQuatro.setBackground(Color.RED);
        else if(filosofo==5)   
            this.txtCinco.setBackground(Color.RED);
    }
    private void setOcupado(int garfo){
        if(garfo==1) 
            this.txtGarfoUm.setBackground(Color.GREEN);
        else if(garfo==2)
            this.txtGarfoDois.setBackground(Color.GREEN);
        else if(garfo==3)
            this.txtGarfoTres.setBackground(Color.GREEN);
        else if(garfo==4)
            this.txtGarfoQuatro.setBackground(Color.GREEN);
        else if(garfo==5)   
            this.txtGarfoCinco.setBackground(Color.GREEN);
    }
    private void setLivre(int garfo){
        if(garfo==1) 
            this.txtGarfoUm.setBackground(Color.GRAY);
        else if(garfo==2)
            this.txtGarfoDois.setBackground(Color.GRAY);
        else if(garfo==3)
            this.txtGarfoTres.setBackground(Color.GRAY);
        else if(garfo==4)
            this.txtGarfoQuatro.setBackground(Color.GRAY);
        else if(garfo==5)   
            this.txtGarfoCinco.setBackground(Color.GRAY);
    }
    
    public void SetInterfaceToGarfo(int garfo, String estado){
        if(estado == "LIVRE")
            setLivre(garfo);
        else if(estado == "OCUPADO")
            setOcupado(garfo);
        else
            limparCampoGarfo();
          
        
    }
    
    public void SetInterfaceToFilosofo(int filosofo, String estado){
        if(estado == "COMENDO")
            setComendo(filosofo);
        else if(estado == "COM_FOME")
            setComFome(filosofo);
        else if(estado == "PENSANDO")
            setPensando(filosofo);
        else limparCampoTexto();
        
       //System.out.println(filosofo + "/" + estado);
            
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
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceGrafica().setVisible(true);
                System.out.println("Teste");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnd;
    private javax.swing.JButton btnStart;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField txtCinco;
    private javax.swing.JTextField txtDois;
    private javax.swing.JTextField txtGarfoCinco;
    private javax.swing.JTextField txtGarfoDois;
    private javax.swing.JTextField txtGarfoQuatro;
    private javax.swing.JTextField txtGarfoTres;
    private javax.swing.JTextField txtGarfoUm;
    private javax.swing.JTextField txtLabelComFome;
    private javax.swing.JTextField txtLabelComendo;
    private javax.swing.JTextField txtLabelLivre;
    private javax.swing.JTextField txtLabelOcupado;
    private javax.swing.JTextField txtLabelPensando;
    private javax.swing.JTextField txtQuatro;
    private javax.swing.JTextField txtTres;
    private javax.swing.JTextField txtUm;
    // End of variables declaration//GEN-END:variables
}
