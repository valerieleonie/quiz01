/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class FrmZodiac extends javax.swing.JFrame {

    /**
     * Creates new form FrmZodiac
     */
    public FrmZodiac() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        pnlData = new javax.swing.JPanel();
        lblTanggal = new javax.swing.JLabel();
        lblBulan = new javax.swing.JLabel();
        txtTanggal = new javax.swing.JTextField();
        txtBulan = new javax.swing.JTextField();
        btnProses = new javax.swing.JButton();
        lblData = new javax.swing.JLabel();
        pnlResult = new javax.swing.JPanel();
        lblDeskripsi = new javax.swing.JLabel();
        lblZodiac = new javax.swing.JLabel();
        txtZodiac = new javax.swing.JTextField();
        txaDeskripsi = new javax.swing.JScrollPane();
        txtDeskripsi = new javax.swing.JTextArea();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlData.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblTanggal.setText("Tanggal");

        lblBulan.setText("Bulan");

        txtTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTanggalActionPerformed(evt);
            }
        });

        txtBulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBulanActionPerformed(evt);
            }
        });

        btnProses.setText("Proses!");
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });

        lblData.setText("Data");

        javax.swing.GroupLayout pnlDataLayout = new javax.swing.GroupLayout(pnlData);
        pnlData.setLayout(pnlDataLayout);
        pnlDataLayout.setHorizontalGroup(
            pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTanggal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lblBulan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBulan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnProses)
                .addGap(42, 42, 42))
            .addGroup(pnlDataLayout.createSequentialGroup()
                .addComponent(lblData)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlDataLayout.setVerticalGroup(
            pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataLayout.createSequentialGroup()
                .addComponent(lblData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTanggal)
                    .addComponent(lblBulan)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProses))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        pnlResult.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblDeskripsi.setText("Deskripsi");

        lblZodiac.setText("Zodiac");

        txtDeskripsi.setColumns(20);
        txtDeskripsi.setRows(5);
        txaDeskripsi.setViewportView(txtDeskripsi);

        javax.swing.GroupLayout pnlResultLayout = new javax.swing.GroupLayout(pnlResult);
        pnlResult.setLayout(pnlResultLayout);
        pnlResultLayout.setHorizontalGroup(
            pnlResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txaDeskripsi)
                    .addGroup(pnlResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDeskripsi)
                        .addGroup(pnlResultLayout.createSequentialGroup()
                            .addComponent(lblZodiac)
                            .addGap(18, 18, 18)
                            .addComponent(txtZodiac, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlResultLayout.setVerticalGroup(
            pnlResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDeskripsi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZodiac)
                    .addComponent(txtZodiac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txaDeskripsi, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTanggalActionPerformed

    private void txtBulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBulanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBulanActionPerformed

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
        int tanggal = Integer.parseInt(txtTanggal.getText());
        int bulan = Integer.parseInt(txtBulan.getText());
        String zodiac, deskripsi;
        if (tanggal>=21&&bulan==3 || tanggal<=20&&bulan==4) {
            zodiac = "Aries (21 Maret - 20 April)";
            deskripsi = "- Sifat Umum : suka menonjolkan diri, senang beraktifitas, menyukai kepemimpinan.\n" +
"- Sifat Negatif : sombong, suka bertengkar, cepat marah, berbuat tolol.\n" +
"- Sifat Positif : pemberani/penentang, berani mengambil inisiatif.\n" +
"";
            txtZodiac.setText(zodiac);
            txtDeskripsi.setText(deskripsi);
        }
        else if (tanggal>=21&&bulan==4 || tanggal<=20&&bulan==5) {
            zodiac = "TAURUS (21 April – Mei 20)";
            deskripsi = "- Sifat Umum : suka hak milik dan tanah, menyukai kesenangan fisik.\n" +
"- Sifat Negatif : keras kepala susah ditundukkan, tidak bisa mengendalikan diri, sangat bernafsu pada uang.\n" +
"- Sifat Positif : kuat, ulet dan tabah, tidak mau bergantung pada orang lain.";
        
            txtZodiac.setText(zodiac);
            txtDeskripsi.setText(deskripsi);
        }
        
        else if (tanggal>=21&&bulan==5 || tanggal<=20&&bulan==6) {
            zodiac = "GEMINI (21 Mei - 20 Jun)";
            deskripsi = "- Sifat Umum : menjadi penjual jasa atau ide, senang komunikasi dan masalah kesusastraan.\n" +
"- Sifat Negatif : picik, senang menyelidiki, dalam segala sesuatu tidak ada kesinambungan.\n" +
"- Sifat Positif : cakap dalam berbagai bidang, bijaksana dan tahan mentalnya.\n" +
"";
            
        txtZodiac.setText(zodiac);
        txtDeskripsi.setText(deskripsi);
        }
        else if (tanggal>=21&&bulan==6 || tanggal<=22&&bulan==7) {
            zodiac = "CANCER (21 Jun - 22 Jul)";
            deskripsi = "- Sifat Umum : sangat peduli dalam urusan rumah dan keluarga, senang mengumpulkan benda berharga, sentimentil.\n" +
"- Sifat Negatif : mudah tersinggung, pemurung dan pemarah.\n" +
"- Sifat Positif : simpatik, keibuan/kebapakan, peka perasaannya.";
            
            txtZodiac.setText(zodiac);
        txtDeskripsi.setText(deskripsi);
        }
        else if (tanggal>=23&&bulan==7 || tanggal<=22&&bulan==8) {
            zodiac = "LEO (23 Jul - 22 Aug)";
            deskripsi = "- Sifat Umum : suka mengatur dan memerintah, menyukai media dan usaha kreatif, mengorganisir yang lain.\n" +
"- Sifat Negatif : jaminan perlindungan yang berlebihan, sombong.\n" +
"- Sifat Positif : murah hati, periang, dan bersemangat tinggi.";
            txtZodiac.setText(zodiac);
        txtDeskripsi.setText(deskripsi);
        }
        else if (tanggal>=23&&bulan==8 || tanggal<=22&&bulan==9) {
            zodiac = "VIRGO (23 Aug - 22 Sep)";
            deskripsi = "- Sifat Umum : bekerja cepat dan tepat, sehat dan higienis, suka menganalisa yang lain.\n" +
"- Sifat Negatif : senang menjauhkan diri, mengeritik dan menyukai kesempurnaan.\n" +
"- Sifat Positif : rendah hati dan suka melayani orang lain.";
                        txtZodiac.setText(zodiac);
        txtDeskripsi.setText(deskripsi);
        }
        else if (tanggal>=23&&bulan==9 || tanggal<=22&&bulan==10) {
            zodiac = "LIBRA (23 Sep - 22 Oct)";
            deskripsi = "- Sifat Umum : menyenangi ide estetika, dalam seni dan lingkungan kerja yang berorientasi kemasyarakatan, adil pada siapa saja\n" +
"- Sifat Negatif : lamban dalam bekerja, tidak berani mengambil keputusan, selalu merinduka n kedamaian.\n" +
"- Sifat Positif : senang bekerjasama dengan siapa saja, jujr dan menyukai diplomasi.";
            txtZodiac.setText(zodiac);
        txtDeskripsi.setText(deskripsi);
        }
        else if (tanggal>=23&&bulan==10 || tanggal<=22&&bulan==11) {
            zodiac = "SCORPIO (23 Oct - 22 Nov)";
            deskripsi = "- Sifat Umum : penuh misteri atau rahasia, menyukai problema dan riset.\n" +
"- Sifat Negatif : pencemburu, suka berfikir kebencian, dan pendendam.\n" +
"- Sifat Positif : menentukan, meresapi kalbu, dan berpostur gagah.";
            txtZodiac.setText(zodiac);
        txtDeskripsi.setText(deskripsi);
        }
        else if (tanggal>=23&&bulan==11 || tanggal<=21&&bulan==12) {
            zodiac = "SAGITARIUS (23 Nov - 21 Dec)";
            deskripsi = "- Sifat Umum : pengembara, mengejar filsafat, menyukai penelitian.\n" +
"- Sifat Negatif : sombong dan sering lengah (tidak waspada).\n" +
"- Sifat Positif : idealis, suka berterus terang, dan selalu gembira.";
            txtZodiac.setText(zodiac);
            txtDeskripsi.setText(deskripsi);
        }
        
	else if (tanggal>=22&&bulan==12 || tanggal<=19&&bulan==12)  {
            zodiac = "CAPRICORN (22 Dec - 19 Jan)";
            deskripsi = "- Sifat Umum : mengejar keuntungan bisnis (fiansial) dan status social.\n" +
"- Sifat Negatif : matrealistis\n" +
"- Sifat Positif : suka kerapihan respek terhadap tradisi dan hati-hati.\n" +
"";
            txtZodiac.setText(zodiac);
            txtDeskripsi.setText(deskripsi);
        }
        else if (tanggal>=20&&bulan==1 || tanggal<=19&&bulan==2) {
            zodiac = "AQUARIUS (20 Jan - 19 Feb)";
            deskripsi = "- Sifat Umum : mengejar segi kemanusiaan dan pengetahuan, menyukai aktifitas kelompok.\n" +
"- Sifat Negatif : eksentrik, berjiwa pemberontak, dan fanatic.\n" +
"- Sifat Positif : respek terhadap kebebasan diri atau orang lain, menyukai persahabatan.";
            
            txtZodiac.setText(zodiac);
            txtDeskripsi.setText(deskripsi);
        }
        else if (tanggal>=20&&bulan==2 || tanggal<=20&&bulan==3) {
            zodiac = "PISCES (20 Feb - 20 Mar)";
            deskripsi = "- Sifat Umum : menyukai hal-hal spiritual, kesenian dan lautan.\n" +
"- Sifat Negative : sentimental, menghindari resiko.\n" +
"- Sifat Positif : ramah berimajinasi dan tidak mau menilai orang lain.";
            txtZodiac.setText(zodiac);
            txtDeskripsi.setText(deskripsi);
        }
    }//GEN-LAST:event_btnProsesActionPerformed

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
            java.util.logging.Logger.getLogger(FrmZodiac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmZodiac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmZodiac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmZodiac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmZodiac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProses;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBulan;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDeskripsi;
    private javax.swing.JLabel lblTanggal;
    private javax.swing.JLabel lblZodiac;
    private javax.swing.JPanel pnlData;
    private javax.swing.JPanel pnlResult;
    private javax.swing.JScrollPane txaDeskripsi;
    private javax.swing.JTextField txtBulan;
    private javax.swing.JTextArea txtDeskripsi;
    private javax.swing.JTextField txtTanggal;
    private javax.swing.JTextField txtZodiac;
    // End of variables declaration//GEN-END:variables
}
