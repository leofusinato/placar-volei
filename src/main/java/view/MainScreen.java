package view;

import javax.swing.JOptionPane;
import model.Equipe;
import model.Partida;
import model.SetJogo;

/**
 * @author Leonardo
 */
public class MainScreen extends javax.swing.JFrame {

    private Partida partida;
    private int set = 1;

    public MainScreen() {
        initComponents();
        initBehaviors();
        this.partida = new Partida();
    }

    private void initBehaviors() {
        txtHistorico.setEditable(false);
        txtPontosA.setEditable(false);
        txtPontosA.setText("0");
        txtSetsA.setEditable(false);
        txtSetsA.setText("0");
        txtPontosB.setEditable(false);
        txtPontosB.setText("0");
        txtSetsB.setEditable(false);
        txtSetsB.setText("0");
        txtEquipeA.setText("Equipe A");
        txtEquipeB.setText("Equipe B");
        txtHorario.setText("00:00");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtSetsA = new javax.swing.JTextField();
        txtEquipeB = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEquipeA = new javax.swing.JTextField();
        txtSetsB = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHistorico = new javax.swing.JTextArea();
        lblEquipeA = new javax.swing.JLabel();
        lblEquipeB = new javax.swing.JLabel();
        btnAddEquipeA = new javax.swing.JButton();
        btnAddEquipeB = new javax.swing.JButton();
        btnRemoveEquipeB = new javax.swing.JButton();
        btnRemoveEquipeA = new javax.swing.JButton();
        txtPontosA = new javax.swing.JTextField();
        txtPontosB = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHorario = new javax.swing.JTextField();
        btnRestart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Placar Geral");

        txtEquipeB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEquipeBKeyReleased(evt);
            }
        });

        jLabel2.setText("Horário");

        txtEquipeA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEquipeAKeyReleased(evt);
            }
        });

        jLabel4.setText("Histórico");

        txtHistorico.setColumns(20);
        txtHistorico.setRows(5);
        jScrollPane1.setViewportView(txtHistorico);

        lblEquipeA.setText("Equipe A");

        lblEquipeB.setText("Equipe B");

        btnAddEquipeA.setText("+");
        btnAddEquipeA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEquipeAActionPerformed(evt);
            }
        });

        btnAddEquipeB.setText("+");
        btnAddEquipeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEquipeBActionPerformed(evt);
            }
        });

        btnRemoveEquipeB.setText("-");
        btnRemoveEquipeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveEquipeBActionPerformed(evt);
            }
        });

        btnRemoveEquipeA.setText("-");
        btnRemoveEquipeA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveEquipeAActionPerformed(evt);
            }
        });

        jLabel3.setText("Sets");

        btnRestart.setText("Reiniciar");
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(txtEquipeA, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(txtEquipeB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtSetsA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSetsB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEquipeA)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnRemoveEquipeA)
                        .addComponent(btnAddEquipeA))
                    .addComponent(txtPontosA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEquipeB)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPontosB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnRemoveEquipeB)
                                .addComponent(btnAddEquipeB)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRestart)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSetsA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEquipeA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEquipeB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSetsB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEquipeA)
                    .addComponent(lblEquipeB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddEquipeA)
                    .addComponent(btnAddEquipeB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPontosA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPontosB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoveEquipeB)
                    .addComponent(btnRemoveEquipeA))
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRestart)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddEquipeAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEquipeAActionPerformed
        if (set < 5) {
            addPontuacaoA(24);
        } else {
            addPontuacaoA(14);
        }
    }//GEN-LAST:event_btnAddEquipeAActionPerformed

    private void btnAddEquipeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEquipeBActionPerformed
        if (set < 5) {
            addPontuacaoB(24);
        } else {
            addPontuacaoB(14);
        }
    }//GEN-LAST:event_btnAddEquipeBActionPerformed

    private void btnRemoveEquipeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveEquipeBActionPerformed
        if (Integer.parseInt(txtPontosB.getText()) != 0) {
            removePontoB();
        }
    }//GEN-LAST:event_btnRemoveEquipeBActionPerformed

    private void btnRemoveEquipeAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveEquipeAActionPerformed
        if (Integer.parseInt(txtPontosA.getText()) != 0) {
            removePontoA();
        }
    }//GEN-LAST:event_btnRemoveEquipeAActionPerformed
    private void txtEquipeAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEquipeAKeyReleased
        lblEquipeA.setText(txtEquipeA.getText());
    }//GEN-LAST:event_txtEquipeAKeyReleased

    private void txtEquipeBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEquipeBKeyReleased
        lblEquipeB.setText(txtEquipeB.getText());
    }//GEN-LAST:event_txtEquipeBKeyReleased

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
        txtHistorico.setText("");
        initBehaviors();
        this.partida.clear();
        this.set = 1;
    }//GEN-LAST:event_btnRestartActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    private void addPontuacaoA(int pontoMax) {
        if (!isFinishedGame()) {
            if (Integer.parseInt(txtPontosA.getText()) < pontoMax) {
                addPontoA();
            } else {
                if ((Integer.parseInt(txtPontosA.getText()) - Integer.parseInt(txtPontosB.getText())) >= 1) {
                    String title = txtSetsA.getText().equals("2") ? "Partida finalizada" : "Set finalizado";
                    String message = txtSetsA.getText().equals("2") ? "Confirmar vitória da partida para " + txtEquipeA.getText() + "?" : "Confirmar vitória do set para " + txtEquipeA.getText() + "?";
                    if (questionDialog(title, message)) {
                        addPontoA();
                        this.partida.addSetJogo(new SetJogo(set, txtEquipeA.getText(), txtEquipeB.getText(), Integer.parseInt(txtPontosA.getText()), Integer.parseInt(txtPontosB.getText())));
                        validaAlteracaoNomeEquipes();
                        updateHistorico();
                        String setsGanhos = String.valueOf(Integer.parseInt(txtSetsA.getText()) + 1);
                        txtSetsA.setText(setsGanhos);
                        this.set++;
                        zeraPontuacao();
                    }
                } else {
                    addPontoA();
                }
            }
        }
    }

    private void addPontuacaoB(int pontoMax) {
        if (!isFinishedGame()) {
            if (Integer.parseInt(txtPontosB.getText()) < pontoMax) {
                addPontoB();
            } else {
                if ((Integer.parseInt(txtPontosB.getText()) - Integer.parseInt(txtPontosA.getText())) >= 1) {
                    String title = txtSetsB.getText().equals("2") ? "Partida finalizada" : "Set finalizado";
                    String message = txtSetsB.getText().equals("2") ? "Confirmar vitória da partida para " + txtEquipeB.getText() + "?" : "Confirmar vitória do set para " + txtEquipeB.getText() + "?";
                    if (questionDialog(title, message)) {
                        addPontoB();
                        this.partida.addSetJogo(new SetJogo(set, txtEquipeA.getText(), txtEquipeB.getText(), Integer.parseInt(txtPontosA.getText()), Integer.parseInt(txtPontosB.getText())));
                        validaAlteracaoNomeEquipes();
                        updateHistorico();
                        String setsGanhos = String.valueOf(Integer.parseInt(txtSetsB.getText()) + 1);
                        txtSetsB.setText(setsGanhos);
                        this.set++;
                        zeraPontuacao();
                    }
                } else {
                    addPontoB();
                }
            }
        }
    }

    private boolean questionDialog(String title, String message) {
        int option = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        return option == JOptionPane.YES_OPTION;
    }

    private void validaAlteracaoNomeEquipes() {
        if (!this.partida.getSetsJogo().isEmpty()) {
            if (!this.partida.getSetsJogo().get(0).getEquipeA().equals(txtEquipeA.getText())) {
                this.partida.updateNomeEquipeA(txtEquipeA.getText());
            }
            if (!this.partida.getSetsJogo().get(0).getEquipeB().equals(txtEquipeB.getText())) {
                this.partida.updateNomeEquipeB(txtEquipeB.getText());
            }
        }
    }

    private void addPontoA() {
        String novaPontuacao = String.valueOf(Integer.parseInt(txtPontosA.getText()) + 1);
        txtPontosA.setText(novaPontuacao);
    }

    private void removePontoA() {
        String novaPontuacao = String.valueOf(Integer.parseInt(txtPontosA.getText()) - 1);
        txtPontosA.setText(novaPontuacao);
    }

    private void addPontoB() {
        String novaPontuacao = String.valueOf(Integer.parseInt(txtPontosB.getText()) + 1);
        txtPontosB.setText(novaPontuacao);
    }

    private void removePontoB() {
        String novaPontuacao = String.valueOf(Integer.parseInt(txtPontosB.getText()) - 1);
        txtPontosB.setText(novaPontuacao);
    }

    private void updateHistorico() {
        txtHistorico.setText(this.partida.getHistorico());
    }

    private void zeraPontuacao() {
        txtPontosA.setText("0");
        txtPontosB.setText("0");
    }
    
    private boolean isFinishedGame() {
        return txtSetsA.getText().equals("3") || txtSetsB.getText().equals("3");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEquipeA;
    private javax.swing.JButton btnAddEquipeB;
    private javax.swing.JButton btnRemoveEquipeA;
    private javax.swing.JButton btnRemoveEquipeB;
    private javax.swing.JButton btnRestart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEquipeA;
    private javax.swing.JLabel lblEquipeB;
    private javax.swing.JTextField txtEquipeA;
    private javax.swing.JTextField txtEquipeB;
    private javax.swing.JTextArea txtHistorico;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextField txtPontosA;
    private javax.swing.JTextField txtPontosB;
    private javax.swing.JTextField txtSetsA;
    private javax.swing.JTextField txtSetsB;
    // End of variables declaration//GEN-END:variables
}
