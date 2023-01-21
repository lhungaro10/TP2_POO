/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Controller.ControladorUsuario;
import Models.Cli_Ouro;
import Models.Cliente;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.sql.Date;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Martines
 */
public class IUCadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form IUCadastroCliente
     */
    public IUCadastroCliente() {
        initComponents();
        lblMensagem.setVisible(false);
        lblDigCodigo.setVisible(false);
        buttonGroup1.clearSelection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblCadastroCliente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnCadastroCliente = new javax.swing.JButton();
        txtDataCad = new javax.swing.JFormattedTextField();
        lblMensagem = new javax.swing.JLabel();
        lblDigCodigo = new javax.swing.JLabel();
        txtCEP = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JFormattedTextField();
        txtEndereco = new javax.swing.JFormattedTextField();
        txtRG = new javax.swing.JFormattedTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        txtCodigo = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDadaNasc = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        btnClienteComum = new javax.swing.JRadioButton();
        btnClienteOuro = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lblCadastroCliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblCadastroCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblCadastroCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadastroCliente.setText("Cadastro de Clientes ");
        lblCadastroCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel1.setText("Código");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setText("Nome ");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel3.setText("CPF");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel4.setText("RG");

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel5.setText("CEP");

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel7.setText("Endereço");

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel8.setText("Email");

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel10.setText("Data Cadastro");

        btnCadastroCliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnCadastroCliente.setText("Cadastrar");
        btnCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroClienteActionPerformed(evt);
            }
        });

        try {
            txtDataCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataCadActionPerformed(evt);
            }
        });

        lblMensagem.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblMensagem.setForeground(new java.awt.Color(255, 0, 51));
        lblMensagem.setText("ESTE CÓDIGO JA POSSUI UM CADASTRO");

        lblDigCodigo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        lblDigCodigo.setForeground(new java.awt.Color(255, 0, 0));
        lblDigCodigo.setText("Digite o código!!");

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCEPActionPerformed(evt);
            }
        });

        try {
            txtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoFocusLost(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel9.setText("Data Nascimento");

        try {
            txtDadaNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDadaNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDadaNascActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Tipo de Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        buttonGroup1.add(btnClienteComum);
        btnClienteComum.setSelected(true);
        btnClienteComum.setText("Cliente Comum");

        buttonGroup1.add(btnClienteOuro);
        btnClienteOuro.setText("Cliente de Ouro");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClienteComum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                .addComponent(btnClienteOuro)
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClienteComum)
                    .addComponent(btnClienteOuro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastroCliente)
                .addGap(255, 255, 255))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRG)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDataCad, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(65, 65, 65))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(47, 47, 47)
                                    .addComponent(jLabel5))
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDadaNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDigCodigo)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDigCodigo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDadaNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastroCliente)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroClienteActionPerformed
        
        if((!(btnClienteComum.isSelected()))&&(!(btnClienteOuro.isSelected()))){
            JOptionPane.showMessageDialog(null,"Preencha todos os campos!" , "Erro no Cadastro!", NORMAL);
        }else{
            if((txtCodigo.getText().length() == 0 )||(txtNome.getText().length() == 0)||
                (txtCPF.getText().length() == 0)||(txtRG.getText().length() == 0)||
                (txtEndereco.getText().length() == 0)||(txtEmail.getText().length() == 0)||
                (txtDataCad.getText().length() == 0 )||(txtDadaNasc.getText().length() == 0)||
                (txtCEP.getText().length() == 0 )){

                JOptionPane.showMessageDialog(null,"Preencha todos os campos!" , "Erro no Cadastro!", NORMAL);

            }else{
                int codigo = Integer.parseInt(txtCodigo.getText());
                String nome = txtNome.getText();
                String cpf = txtCPF.getText();
                String rg = txtRG.getText();
                String endereco = txtEndereco.getText();
                String email = txtEmail.getText();
                String dataCadastro = txtDataCad.getText();
                String dataNasc = txtDadaNasc.getText();
                String cep = txtCEP.getText();
                LocalDate dateNasc =  LocalDate.parse(dataNasc,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                LocalDate dateCad = LocalDate.parse(dataCadastro,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                ControladorUsuario control = new ControladorUsuario(); 

                    if(btnClienteComum.isSelected()){
                        String tipo = "ClienteComum"; 
                        control.addCliente(dateCad, codigo, nome, cpf, rg, dateNasc, endereco, cep, email, tipo);
                        setVisible(false); 
                        //control.getTodosClientes();
                    }else{
                        String tipo = "Cliente Ouro"; 
                        control.addCliente(dateCad, codigo, nome, cpf, rg, dateNasc, endereco, cep, email, tipo);
                        setVisible(false); 
                        //control.getTodosClientes();
                    }        
            }
        }
    }//GEN-LAST:event_btnCadastroClienteActionPerformed

    private void txtDataCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataCadActionPerformed

    private void txtCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCEPActionPerformed

    private void txtCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusGained
        //lblDigCodigo.setVisible(false);
        txtCEP.setEnabled(true);
        txtCPF.setEnabled(true);
        txtDadaNasc.setEnabled(true);
        txtDataCad.setEnabled(true);
        txtEmail.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtNome.setEnabled(true);
        txtRG.setEnabled(true);
        lblMensagem.setVisible(false);
        btnClienteComum.setEnabled(true);
        btnClienteOuro.setEnabled(true); 
        txtCEP.setText("");
        txtCPF.setText("");
        txtDadaNasc.setText("");
        txtDataCad.setText("");
        txtEmail.setText("");
        txtEndereco.setText("");
        txtNome.setText("");
        txtRG.setText("");
       
    }//GEN-LAST:event_txtCodigoFocusGained

    private void txtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusLost
        
        
        if(txtCodigo.getText().length()!= 0){
            lblDigCodigo.setVisible(false);
            int codigoCliente = Integer.parseInt(txtCodigo.getText());
            ControladorUsuario control = new ControladorUsuario();

            Cliente cli = control.buscaClientePorCodigo(codigoCliente);

            if(cli != null){
                LocalDate dataNasc = cli.getDataNascimento();
                Date date = Date.valueOf(dataNasc);
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                String dataNascimento = format.format(date);

                LocalDate dataCad = cli.getDataCadastro();
                Date date2 = Date.valueOf(dataCad);
                SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy");
                String dataCadastro = format2.format(date2);
                
                
                txtCEP.setText(cli.getCep());
                txtCPF.setText(cli.getCpf());
                txtDadaNasc.setText(dataNascimento);
                txtDataCad.setText(dataCadastro);
                txtEmail.setText(cli.getEmail());
                txtEndereco.setText(cli.getEndereco());
                txtNome.setText(cli.getNome());
                txtRG.setText(cli.getRg());
                
                btnCadastroCliente.setEnabled(false);
                btnCadastroCliente.requestFocus();
                buttonGroup1.clearSelection();
                btnClienteComum.setEnabled(false);
                btnClienteOuro.setEnabled(false);
                lblMensagem.setVisible(true);
                
                txtCEP.setEnabled(false);
                txtCPF.setEnabled(false);
                txtDadaNasc.setEnabled(false);
                txtDataCad.setEnabled(false);
                txtEmail.setEnabled(false);
                txtEndereco.setEnabled(false);
                txtNome.setEnabled(false);
                txtRG.setEnabled(false);
            }else{
                
                btnCadastroCliente.setEnabled(true);
                lblMensagem.setVisible(false); 
                
            }
        }else if(txtCodigo.getText().length() == 0){
            txtCodigo.requestFocus();
            lblDigCodigo.setVisible(true);

        }
        
    }//GEN-LAST:event_txtCodigoFocusLost

    private void txtDadaNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDadaNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDadaNascActionPerformed

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
            java.util.logging.Logger.getLogger(IUCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUCadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastroCliente;
    private javax.swing.JRadioButton btnClienteComum;
    private javax.swing.JRadioButton btnClienteOuro;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCadastroCliente;
    private javax.swing.JLabel lblDigCodigo;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCodigo;
    private javax.swing.JFormattedTextField txtDadaNasc;
    private javax.swing.JFormattedTextField txtDataCad;
    private javax.swing.JFormattedTextField txtEmail;
    private javax.swing.JFormattedTextField txtEndereco;
    private javax.swing.JFormattedTextField txtNome;
    private javax.swing.JFormattedTextField txtRG;
    // End of variables declaration//GEN-END:variables
}
