/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Controller.ControladorProduto;
import Models.Eletrodomestico;
import Models.Fabricante;
import Models.Produto;
import static java.awt.Frame.NORMAL;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Martines
 */
public class IUCadastroProduto extends javax.swing.JFrame {

    /**
     * Creates new form IUCadastroProduto
     */
    public IUCadastroProduto() {
        initComponents();
        lblDigCodigo.setVisible(false); 
        lblMensagem.setVisible(false); 
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblCadastroCliente = new javax.swing.JLabel();
        lblMensagem = new javax.swing.JLabel();
        lblDigCodigo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        txtCodProd = new javax.swing.JTextField();
        txtNomeProd = new javax.swing.JTextField();
        txtFabricante = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtDataFabri = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        btnMovel = new javax.swing.JRadioButton();
        btnVestuario = new javax.swing.JRadioButton();
        btnEletrodomesticos = new javax.swing.JRadioButton();
        btnEletronico = new javax.swing.JRadioButton();
        btnCadastraProduto = new javax.swing.JButton();
        btnConsultaFabricante = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel1.setText("Código");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel3.setText("Data Fabricação");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel4.setText("Descrição");

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel5.setText("Fabricante");

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel7.setText("Valor");

        lblCadastroCliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblCadastroCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblCadastroCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadastroCliente.setText("Cadastro de Produtos");
        lblCadastroCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblMensagem.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblMensagem.setForeground(new java.awt.Color(255, 0, 51));
        lblMensagem.setText("ESTE CÓDIGO JA POSSUI UM CADASTRO");

        lblDigCodigo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        lblDigCodigo.setForeground(new java.awt.Color(255, 0, 0));
        lblDigCodigo.setText("Digite o código!!");

        txtDesc.setColumns(20);
        txtDesc.setRows(5);
        jScrollPane1.setViewportView(txtDesc);

        txtCodProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodProdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodProdFocusLost(evt);
            }
        });

        txtFabricante.setEnabled(false);

        try {
            txtDataFabri.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataFabri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataFabriActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Tipo de Produto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Rounded MT Bold", 0, 12))); // NOI18N

        buttonGroup1.add(btnMovel);
        btnMovel.setText("Movel");
        btnMovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMovelActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnVestuario);
        btnVestuario.setText("Vestuário");

        buttonGroup1.add(btnEletrodomesticos);
        btnEletrodomesticos.setText("Elétrodomestico");
        btnEletrodomesticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEletrodomesticosActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnEletronico);
        btnEletronico.setText("Eletrônico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnMovel)
                .addGap(87, 87, 87)
                .addComponent(btnEletrodomesticos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(btnEletronico)
                .addGap(110, 110, 110)
                .addComponent(btnVestuario)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVestuario)
                    .addComponent(btnMovel)
                    .addComponent(btnEletrodomesticos)
                    .addComponent(btnEletronico))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        btnCadastraProduto.setText("Cadastrar");
        btnCadastraProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastraProdutoActionPerformed(evt);
            }
        });

        btnConsultaFabricante.setText("Consulta Fabricante");
        btnConsultaFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaFabricanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(lblDigCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jLabel7)
                                .addGap(12, 12, 12)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnConsultaFabricante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(6, 6, 6)
                                .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6)
                                .addComponent(txtNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCadastraProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)))
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(txtDataFabri, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblMensagem)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3))
                    .addComponent(txtDataFabri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(lblDigCodigo)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(btnConsultaFabricante))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel7))
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btnCadastraProduto)
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataFabriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataFabriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataFabriActionPerformed

    private void btnEletrodomesticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEletrodomesticosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEletrodomesticosActionPerformed

    private void btnCadastraProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraProdutoActionPerformed
        if(!(btnEletrodomesticos.isSelected()||(btnEletronico.isSelected())||(btnMovel.isSelected())||(btnVestuario.isSelected()))&&
           ((txtCodProd.getText().length() == 0 )||(txtNomeProd.getText().length() == 0)||
           (txtDataFabri.getText().length() == 0)||(txtDesc.getText().length() == 0)||
           (txtFabricante.getText().length() == 0)||(txtValor.getText().length() == 0))){
              
           JOptionPane.showMessageDialog(null,"Preencha todos os campos!" , "Erro no Cadastro!", NORMAL);
        
        }else{
        
        int codigo = Integer.parseInt(txtCodProd.getText());
        String nome = txtNomeProd.getText(); 
        String desc = txtDesc.getText(); 
        int codFabricante = Integer.parseInt(txtFabricante.getText()); 
        float valor = Float.parseFloat(txtValor.getText());  
        String dataFabricacao = txtDataFabri.getText(); 
        LocalDate dateFabri =  LocalDate.parse(dataFabricacao,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
            if(btnEletrodomesticos.isSelected()){
                ControladorProduto control = new ControladorProduto();
                Eletrodomestico eletro1 = new Eletrodomestico(codigo, nome, desc, dateFabri, valor, control.buscaFabrincantePorCodigo(codFabricante), true);
                control.addProduto(eletro1);
            }else if(btnEletronico.isSelected()){
                //Eletronico eletronico = new Eletronico(codigo, nome, desc, dateFabri, valor, control.BuscaFabricantePorCodigo(codFabricante), true);
            }else if(btnVestuario.isSelected()){
                //Vestuario vestuario = new Vestuario(codigo, nome, desc, dateFabri, valor, control.BuscaFabricantePorCodigo(codFabricante), true);
            }else{
                //Movel movel = new Movel(codigo, nome, desc, dateFabri, valor, control.BuscaFabricantePorCodigo(codFabricante), true);
            }
     
        
        }
    }//GEN-LAST:event_btnCadastraProdutoActionPerformed

    private void txtCodProdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodProdFocusLost
        if(txtCodProd.getText().length()!= 0){
        lblDigCodigo.setVisible(false); 
        int codigoProd = Integer.parseInt(txtCodProd.getText()); 
        ControladorProduto control = new ControladorProduto(); 
        Produto prod = control.buscaProdutoPorCodigo(codigoProd);
            
            if (prod != null){
                LocalDate dataFabri = prod.getDataFabricacao();
                Date date = Date.valueOf(dataFabri);
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy"); 
                String dataFabricacao = format.format(date); 
                
                
                txtCodProd.setText(Integer.toString(prod.getCodigo()));
                txtDataFabri.setText(dataFabricacao);
                txtDesc.setText(prod.getDescricao());
                txtNomeProd.setText(prod.getNome()); 
                txtValor.setText(Float.toString(prod.getValor())); 
                txtFabricante.setText(Integer.toString(prod.getFabricante().getCodigo())); 
                
                 
                txtDataFabri.setEnabled(false); 
                txtDesc.setEnabled(false); 
                txtFabricante.setEnabled(false); 
                txtNomeProd.setEnabled(false); 
                txtValor.setEnabled(false); 
                
                lblMensagem.setVisible(true);
                btnCadastraProduto.setEnabled(false);
                btnConsultaFabricante.setEnabled(false); 
                btnCadastraProduto.requestFocus(); 
                
                buttonGroup1.clearSelection();
                btnMovel.setEnabled(false);
                btnEletrodomesticos.setEnabled(false);
                btnEletronico.setEnabled(false);
                btnVestuario.setEnabled(false);
            }else{
                lblMensagem.setVisible(false); 
                btnCadastraProduto.setEnabled(true);
                btnConsultaFabricante.setEnabled(true); 
            }
        }else if(txtCodProd.getText().length() == 0){
            txtCodProd.requestFocus();
            lblDigCodigo.setVisible(true);
        }  
    }//GEN-LAST:event_txtCodProdFocusLost

    private void txtCodProdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodProdFocusGained
            
            lblMensagem.setVisible(false);
            
            txtCodProd.setText("");
            txtDataFabri.setText("");
            txtDesc.setText("");
            txtFabricante.setText("");
            txtNomeProd.setText("");
            txtValor.setText("");
            txtDataFabri.setEnabled(true); 
            txtDesc.setEnabled(true); 
            txtFabricante.setEnabled(true); 
            txtNomeProd.setEnabled(true); 
            txtValor.setEnabled(true); 
            
            
            btnMovel.setEnabled(true);
            btnEletrodomesticos.setEnabled(true);
            btnEletronico.setEnabled(true);
            btnVestuario.setEnabled(true);
    }//GEN-LAST:event_txtCodProdFocusGained

    private void btnConsultaFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaFabricanteActionPerformed
        IUConsultaFabricante consuFabri = new IUConsultaFabricante(null, true);
        consuFabri.setVisible(true); 
        
        String codFabricante = consuFabri.getCodFab();
        txtFabricante.setText(codFabricante);
    }//GEN-LAST:event_btnConsultaFabricanteActionPerformed

    private void btnMovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMovelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMovelActionPerformed

    /***
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
            java.util.logging.Logger.getLogger(IUCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUCadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastraProduto;
    private javax.swing.JButton btnConsultaFabricante;
    private javax.swing.JRadioButton btnEletrodomesticos;
    private javax.swing.JRadioButton btnEletronico;
    private javax.swing.JRadioButton btnMovel;
    private javax.swing.JRadioButton btnVestuario;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCadastroCliente;
    private javax.swing.JLabel lblDigCodigo;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JTextField txtCodProd;
    private javax.swing.JFormattedTextField txtDataFabri;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtFabricante;
    private javax.swing.JTextField txtNomeProd;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
