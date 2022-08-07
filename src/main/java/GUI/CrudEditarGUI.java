/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Cliente_;

/**
 *
 * @author Joao-P
 */
public class CrudEditarGUI extends javax.swing.JFrame {

    /**
     * Creates new form CrudCadastrarGUI
     */
    public CrudEditarGUI() {
        initComponents();

//        botaoEditar.setVisible(false);
//        caixaNome.setVisible(false);
//        tituloNome.setVisible(false);
//        caixaTelefone.setVisible(false);
//        tituloTelefone.setVisible(false);
//        caixaSexo.setVisible(false);
//        tituloSexo.setVisible(false);
//        caixaEndereco.setVisible(false);
//        tituloEndereco.setVisible(false);
//        caixaCidade.setVisible(false);
//        tituloCidade.setVisible(false);
//        caixaCep.setVisible(false);
//        tituloCep.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaEditar = new javax.swing.JPanel();
        caixaCpf = new javax.swing.JFormattedTextField();
        tituloCpf = new javax.swing.JLabel();
        botaoEditar = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        caixaNome = new javax.swing.JTextField();
        caixaSexo = new javax.swing.JTextField();
        caixaEndereco = new javax.swing.JTextField();
        caixaCidade = new javax.swing.JTextField();
        tituloEndereco = new javax.swing.JLabel();
        tituloSexo = new javax.swing.JLabel();
        tituloCidade = new javax.swing.JLabel();
        tituloTelefone = new javax.swing.JLabel();
        tituloNome = new javax.swing.JLabel();
        tituloCep = new javax.swing.JLabel();
        caixaTelefone = new javax.swing.JFormattedTextField();
        caixaCep = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        botaoProcurar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        try {
            caixaCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        caixaCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tituloCpf.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        tituloCpf.setText("Digite o CPF do Cliente Para Editá-lo");

        botaoEditar.setBackground(new java.awt.Color(0, 9, 39));
        botaoEditar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        botaoEditar.setForeground(new java.awt.Color(255, 255, 255));
        botaoEditar.setText("Editar");
        botaoEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoEditarMouseClicked(evt);
            }
        });

        botaoVoltar.setBackground(new java.awt.Color(0, 9, 39));
        botaoVoltar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        botaoVoltar.setForeground(new java.awt.Color(255, 255, 255));
        botaoVoltar.setText("Voltar");
        botaoVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVoltarMouseClicked(evt);
            }
        });

        tituloEndereco.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        tituloEndereco.setText("Endereco");

        tituloSexo.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        tituloSexo.setText("Sexo");

        tituloCidade.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        tituloCidade.setText("Cidade");

        tituloTelefone.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        tituloTelefone.setText("Telefone");

        tituloNome.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        tituloNome.setText("Nome");

        tituloCep.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        tituloCep.setText("Cep");

        try {
            caixaTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            caixaCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Editar Cliente");

        botaoProcurar.setBackground(new java.awt.Color(0, 9, 39));
        botaoProcurar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        botaoProcurar.setForeground(new java.awt.Color(255, 255, 255));
        botaoProcurar.setText("Procurar");
        botaoProcurar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoProcurarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaEditarLayout = new javax.swing.GroupLayout(telaEditar);
        telaEditar.setLayout(telaEditarLayout);
        telaEditarLayout.setHorizontalGroup(
            telaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaEditarLayout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addGroup(telaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaEditarLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(199, 199, 199))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(telaEditarLayout.createSequentialGroup()
                            .addComponent(caixaCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botaoProcurar)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaEditarLayout.createSequentialGroup()
                            .addComponent(tituloCpf)
                            .addGap(140, 140, 140)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaEditarLayout.createSequentialGroup()
                        .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180))))
            .addGroup(telaEditarLayout.createSequentialGroup()
                .addComponent(botaoVoltar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(telaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(telaEditarLayout.createSequentialGroup()
                    .addContainerGap(91, Short.MAX_VALUE)
                    .addGroup(telaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tituloCep)
                        .addComponent(tituloTelefone)
                        .addComponent(tituloCidade)
                        .addComponent(tituloSexo)
                        .addComponent(tituloEndereco)
                        .addComponent(caixaNome)
                        .addComponent(caixaTelefone)
                        .addComponent(caixaCep)
                        .addComponent(caixaSexo)
                        .addComponent(caixaEndereco)
                        .addComponent(caixaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tituloNome))
                    .addGap(6, 6, 6)))
        );
        telaEditarLayout.setVerticalGroup(
            telaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaEditarLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23)
                .addComponent(tituloCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixaCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoProcurar))
                .addGap(362, 362, 362)
                .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(botaoVoltar))
            .addGroup(telaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(telaEditarLayout.createSequentialGroup()
                    .addContainerGap(139, Short.MAX_VALUE)
                    .addComponent(tituloNome)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(caixaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tituloTelefone)
                    .addGap(2, 2, 2)
                    .addComponent(caixaTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tituloSexo)
                    .addGap(5, 5, 5)
                    .addComponent(caixaSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(tituloEndereco)
                    .addGap(1, 1, 1)
                    .addComponent(caixaEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(tituloCidade)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(caixaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(13, 13, 13)
                    .addComponent(tituloCep)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(caixaCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(119, 119, 119)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 165, Short.MAX_VALUE)
                .addComponent(telaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addComponent(telaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoEditarMouseClicked

        try {
            Cliente cliente = new Cliente(caixaNome.getText(), caixaCpf.getText().replace(".", "").replace("-", ""), caixaTelefone.getText().replace("(", "").replace(")", "").replace("-", ""), caixaSexo.getText(), caixaEndereco.getText(), caixaCidade.getText(), caixaCep.getText().replace("-", ""));

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("crud");
            EntityManager em = emf.createEntityManager();

            List<Cliente> clientes = em.createQuery("select c from Cliente c where c.cpf=:cpfForm", Cliente.class).setParameter("cpfForm", cliente.getCpf()).getResultList();

            if (caixaNome.getText().equals("") || caixaTelefone.getText().equals("") || caixaSexo.getText().equals("") || caixaEndereco.getText().equals("") || caixaCidade.getText().equals("") || caixaCep.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Campos Obrigatórios!");
            }
            else if (caixaCpf.getText().equals("   .   .   -  ")) {
                JOptionPane.showMessageDialog(null, "CPF Não Digitado");
            } else if (clientes.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Cliente Não Encontrado!");
            } else {

                for (Cliente cliente1 : clientes) {

                    em.getTransaction().begin();

                    cliente1.setNome(caixaNome.getText());
                    cliente1.setTelefone(caixaTelefone.getText().replace("(", "").replace(")", "").replace("-", ""));
                    cliente1.setSexo(caixaSexo.getText());
                    cliente1.setEndereco(caixaEndereco.getText());
                    cliente1.setCidade(caixaCidade.getText());
                    cliente1.setCep(caixaCep.getText().replace("-", ""));

                    em.getTransaction().commit();

                }

                JOptionPane.showMessageDialog(null, "Dados Alterado Com Sucesso!");
                em.close();
                new CrudGUI().setVisible(true);
                this.dispose();
            }

        } catch (Exception e1) {
            JOptionPane.showMessageDialog(null, e1);
        }

    }//GEN-LAST:event_botaoEditarMouseClicked

    private void botaoVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarMouseClicked
        new CrudGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVoltarMouseClicked

    private void botaoProcurarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoProcurarMouseClicked

        Cliente cliente = new Cliente(caixaCpf.getText().replace(".", "").replace("-", ""));

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("crud");
        EntityManager em = emf.createEntityManager();

        List<Cliente> clientes = em.createQuery("select c from Cliente c where c.cpf=:cpfForm", Cliente.class).setParameter("cpfForm", cliente.getCpf()).getResultList();

        System.out.println(clientes);

        if (caixaCpf.getText().equals("   .   .   -  ")) {
            JOptionPane.showMessageDialog(null, "CPF Não Digitado");
        } else if (clientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cliente Não Encontrado!");
        } else {

            for (Cliente cliente1 : clientes) {

                JOptionPane.showMessageDialog(null, "Cliente Encontrado!");
                caixaNome.setText(cliente1.getNome());
                caixaTelefone.setText(cliente1.getTelefone());
                caixaSexo.setText(cliente1.getSexo());
                caixaEndereco.setText(cliente1.getEndereco());
                caixaCidade.setText(cliente1.getCidade());
                caixaCep.setText(cliente1.getCep());
            }

        }

    }//GEN-LAST:event_botaoProcurarMouseClicked

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
            java.util.logging.Logger.getLogger(CrudEditarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudEditarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudEditarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudEditarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudEditarGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoProcurar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JFormattedTextField caixaCep;
    private javax.swing.JTextField caixaCidade;
    private javax.swing.JFormattedTextField caixaCpf;
    private javax.swing.JTextField caixaEndereco;
    private javax.swing.JTextField caixaNome;
    private javax.swing.JTextField caixaSexo;
    private javax.swing.JFormattedTextField caixaTelefone;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel telaEditar;
    private javax.swing.JLabel tituloCep;
    private javax.swing.JLabel tituloCidade;
    private javax.swing.JLabel tituloCpf;
    private javax.swing.JLabel tituloEndereco;
    private javax.swing.JLabel tituloNome;
    private javax.swing.JLabel tituloSexo;
    private javax.swing.JLabel tituloTelefone;
    // End of variables declaration//GEN-END:variables
}