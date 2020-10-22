package practica3;


public class MatrixFilterFrame extends javax.swing.JFrame {


    public MatrixFilterFrame(int min, int max) {
        initComponents();
        m = new Matrix(min, max);
        minField.setText(String.valueOf(min));
        maxField.setText(String.valueOf(max));
        tresholdSlider.setMinimum(min);
        tresholdSlider.setMaximum(max);
        tresholdSlider.setMajorTickSpacing((max - min)/2 < 1? 1: (max - min)/2);
        tresholdSlider.setValue(min);
        tresholdSlider.setPaintTicks(true);
        tresholdSlider.setPaintLabels(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        minField = new javax.swing.JTextField();
        minLabel = new javax.swing.JLabel();
        maxLabel = new javax.swing.JLabel();
        maxField = new javax.swing.JTextField();
        redefineButton = new javax.swing.JButton();
        tresholdSlider = new javax.swing.JSlider();
        tresholdLabel = new javax.swing.JLabel();
        rigthPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        matrixArea = new javax.swing.JTextArea();
        name1Label = new javax.swing.JLabel();
        name2Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Filtrado de matriz cuadrada");
        setResizable(false);

        minField.setEditable(false);

        minLabel.setText("Mín:");

        maxLabel.setText("Máx:");

        maxField.setEditable(false);

        redefineButton.setText("Redefinir");
        redefineButton.setToolTipText("Modifica los valores de la matriz.");
        redefineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redefineButtonActionPerformed(evt);
            }
        });

        tresholdSlider.setToolTipText("Modifica el filtro aplicado a la matriz.");
        tresholdSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tresholdSliderStateChanged(evt);
            }
        });

        tresholdLabel.setText("Umbral");

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tresholdLabel)
                    .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tresholdSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(leftPanelLayout.createSequentialGroup()
                            .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(minLabel)
                                .addComponent(maxLabel))
                            .addGap(14, 14, 14)
                            .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(maxField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(leftPanelLayout.createSequentialGroup()
                                    .addComponent(minField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(redefineButton))))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(minField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minLabel)))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(redefineButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maxField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxLabel))
                .addGap(56, 56, 56)
                .addComponent(tresholdLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tresholdSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        matrixArea.setEditable(false);
        matrixArea.setColumns(20);
        matrixArea.setRows(5);
        jScrollPane1.setViewportView(matrixArea);

        name1Label.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        name1Label.setText("Francisco Jose Santana Sosa");

        name2Label.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        name2Label.setText("Felipe Santana Hernández");

        javax.swing.GroupLayout rigthPanelLayout = new javax.swing.GroupLayout(rigthPanel);
        rigthPanel.setLayout(rigthPanelLayout);
        rigthPanelLayout.setHorizontalGroup(
            rigthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rigthPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rigthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rigthPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rigthPanelLayout.createSequentialGroup()
                        .addGroup(rigthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name1Label)
                            .addComponent(name2Label))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        rigthPanelLayout.setVerticalGroup(
            rigthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rigthPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(name1Label)
                .addGap(18, 18, 18)
                .addComponent(name2Label)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(rigthPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rigthPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void redefineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redefineButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        MatrixDefinitionFrame md = new MatrixDefinitionFrame();
        md.setVisible(true);
    }//GEN-LAST:event_redefineButtonActionPerformed

    private void tresholdSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tresholdSliderStateChanged
        // TODO add your handling code here:
        matrixArea.setText(m.filter(tresholdSlider.getValue()));
    }//GEN-LAST:event_tresholdSliderStateChanged

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JTextArea matrixArea;
    private javax.swing.JTextField maxField;
    private javax.swing.JLabel maxLabel;
    private javax.swing.JTextField minField;
    private javax.swing.JLabel minLabel;
    private javax.swing.JLabel name1Label;
    private javax.swing.JLabel name2Label;
    private javax.swing.JButton redefineButton;
    private javax.swing.JPanel rigthPanel;
    private javax.swing.JLabel tresholdLabel;
    private javax.swing.JSlider tresholdSlider;
    // End of variables declaration//GEN-END:variables
    private final Matrix m;
}
