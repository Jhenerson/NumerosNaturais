

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Aplicacao extends javax.swing.JFrame {

    
    public Aplicacao() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaBanco = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabelMatricula = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jTextTelefone = new javax.swing.JTextField();
        jTextEndereco = new javax.swing.JTextField();
        jTextCPF = new javax.swing.JTextField();
        jTextNome = new javax.swing.JTextField();
        jTextMatricula = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButtonProcurar = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonListar = new javax.swing.JButton();
        jButtonInserir = new javax.swing.JButton();
        jButtonLimparCampos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicacao de Banco de Dados");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Listagem do Banco"));
        jPanel1.setToolTipText("Listagem do Banco");

        jTableListaBanco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Matricula", "CPF", "Nome", "Endereco", "Telefone"
            }
        ));
        jTableListaBanco.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTableListaBancoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTableListaBanco);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        jLabelMatricula.setText("Matricula");

        jLabelCPF.setText("CPF");

        jLabelNome.setText("Nome");

        jLabelTelefone.setText("Telefone");

        jLabelEndereco.setText("Endereco");

        jTextMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMatriculaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMatricula)
                    .addComponent(jLabelCPF)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelTelefone)
                    .addComponent(jLabelEndereco))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                    .addComponent(jTextEndereco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                    .addComponent(jTextCPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                    .addComponent(jTextNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                    .addComponent(jTextMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMatricula)
                    .addComponent(jTextMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCPF)
                    .addComponent(jTextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEndereco)
                    .addComponent(jTextEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTelefone)
                    .addComponent(jTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));

        jButtonProcurar.setText("Procurar");
        jButtonProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProcurarActionPerformed(evt);
            }
        });

        jButtonAtualizar.setText("Atualizar Dados");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonListar.setText("Listar Banco");
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });

        jButtonInserir.setText("Inserir");
        jButtonInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserirActionPerformed(evt);
            }
        });

        jButtonLimparCampos.setText("Limpar Campos");
        jButtonLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonProcurar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonInserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLimparCampos))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonInserir)
                .addGap(18, 18, 18)
                .addComponent(jButtonProcurar)
                .addGap(18, 18, 18)
                .addComponent(jButtonAtualizar)
                .addGap(18, 18, 18)
                .addComponent(jButtonExcluir)
                .addGap(18, 18, 18)
                .addComponent(jButtonListar)
                .addGap(18, 18, 18)
                .addComponent(jButtonLimparCampos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirActionPerformed
        // Botao Inserir
         try{
            ConexaoBanco c1 = new ConexaoBanco();
            Aluno a1 = new Aluno();
            String Matricula = jTextMatricula.getText();
            int matricula = Integer.parseInt(Matricula);
            String CPF = jTextCPF.getText();
            long cpf = Long.parseLong(CPF);
            a1.setMatricula(matricula);
            a1.setCPF(cpf);
            a1.setNome(jTextNome.getText());
            a1.setEndereco(jTextEndereco.getText());
            a1.setTelefone(jTextTelefone.getText());
            c1.inserirNoBanco(a1);
            JOptionPane.showMessageDialog(null,"Inserção de dados executada.");
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null,"Nao foi possivel incluir esse aluno no banco.");
        }
}//GEN-LAST:event_jButtonInserirActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        // Botao Ataluzar
        try{
            ConexaoBanco c1 = new ConexaoBanco();
            Aluno a1 = new Aluno();
            String Matricula = jTextMatricula.getText();
            int matricula = Integer.parseInt(Matricula);
            String CPF = jTextCPF.getText();
            long cpf = Long.parseLong(CPF);    
            a1.setCPF(cpf);
            a1.setNome(jTextNome.getText());
            a1.setEndereco(jTextEndereco.getText());
            a1.setTelefone(jTextTelefone.getText());
            a1.setMatricula(matricula);
            c1.atualizarNoBanco(a1);
            JOptionPane.showMessageDialog(null,"Atualização de dados executada.");
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null,"Nao foi possivel Atualizar esse aluno no banco.");
        }
}//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // Botao Excluir
        try{
            ConexaoBanco c1 = new ConexaoBanco();
            Aluno a1 = new Aluno();
            String Matricula = jTextMatricula.getText();
            int matricula = Integer.parseInt(Matricula);
            a1.setMatricula(matricula);
            c1.excluirDoBanco(a1);
            JOptionPane.showMessageDialog(null,"Exclusão de dados executada.");
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null,"Nao foi possivel excluir esse aluno do banco.");
        }
}//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTextMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMatriculaActionPerformed
        // TODO add your handling code here:

}//GEN-LAST:event_jTextMatriculaActionPerformed

    private void jButtonProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProcurarActionPerformed
        // Botao procurar
        try{
            ConexaoBanco c1 = new ConexaoBanco();
            Aluno a1 = new Aluno();
            String Matricula = jTextMatricula.getText();
            int matricula = Integer.parseInt(Matricula);        
            a1.setMatricula(matricula);
            a1 = c1.procurarNoBanco(matricula);
            JOptionPane.showMessageDialog(null, a1);
            jTextCPF.setText(String.valueOf(a1.getCPF()));
            jTextNome.setText(a1.getNome());
            jTextEndereco.setText(a1.getEndereco());
            jTextTelefone.setText(a1.getTelefone());
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null,"Nao foi possivel encontrar esse aluno no banco.");
        }
}//GEN-LAST:event_jButtonProcurarActionPerformed

    private void jButtonLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparCamposActionPerformed
        // Botao Limpar Campos
        jTextMatricula.setText("");
        jTextCPF.setText("");
        jTextNome.setText("");
        jTextEndereco.setText("");
        jTextTelefone.setText("");
    }//GEN-LAST:event_jButtonLimparCamposActionPerformed

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
      //Botao ListaBanco
        
  /*    ConexaoBanco c1 = new ConexaoBanco();
        List<Aluno> alunosLista = new ArrayList<Aluno>();
        try {
        alunosLista = c1.todoBanco();
        for(int i = 0; i < alunosLista.size();i++) {
            jTableListaBanco.setValueAt(alunosLista.get(i).getMatricula(),i,0);
            jTableListaBanco.setValueAt(alunosLista.get(i).getCPF(),i,1);
            jTableListaBanco.setValueAt(alunosLista.get(i).getNome(),i,2);
            jTableListaBanco.setValueAt(alunosLista.get(i).getEndereco(),i,3);
            jTableListaBanco.setValueAt(alunosLista.get(i).getTelefone(),i,4);
            
        }
        JOptionPane.showMessageDialog(null,"Listagem do banco executada.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Nao foi possivel listar o banco.");
        } */
        try {

            ConexaoBanco c1 = new ConexaoBanco();
            List<Aluno> alunos = new ArrayList<Aluno>();
            alunos = c1.todoBanco();
            //Redefine quatidade de linhas da tabela
            Object t1[][] = new Object[alunos.size()][5];
            for(int i=0;i<alunos.size();i++)
              for(int j=0;j<4;j++)
                t1[i][j] = null;

            jTableListaBanco.setModel(new javax.swing.table.DefaultTableModel(
            t1,
            new String [] {
              "Matricula", "CPF", "Nome", "Telefone", "Email"
            }
        ));
           for (int i = 0; i < alunos.size(); i++) {
                jTableListaBanco.setValueAt(alunos.get(i).getMatricula(),i,0);
                jTableListaBanco.setValueAt(alunos.get(i).getCPF(),i,1);
                jTableListaBanco.setValueAt(alunos.get(i).getNome(),i,2);
                jTableListaBanco.setValueAt(alunos.get(i).getEndereco(),i,3);
                jTableListaBanco.setValueAt(alunos.get(i).getTelefone(),i,4);

                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }

    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jTableListaBancoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTableListaBancoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableListaBancoAncestorAdded

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonInserir;
    private javax.swing.JButton jButtonLimparCampos;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonProcurar;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelMatricula;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListaBanco;
    private javax.swing.JTextField jTextCPF;
    private javax.swing.JTextField jTextEndereco;
    private javax.swing.JTextField jTextMatricula;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextTelefone;
    // End of variables declaration//GEN-END:variables

}
