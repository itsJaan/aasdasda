/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocompiladores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author willi
 */
public class formPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form formPrincipal
     */
    public formPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_importar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_lexico = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_codigo = new javax.swing.JTextArea();
        btn_analisis_lexico = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_importar.setText("Importar Codigo");
        btn_importar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_importarActionPerformed(evt);
            }
        });

        txt_lexico.setColumns(20);
        txt_lexico.setRows(5);
        jScrollPane1.setViewportView(txt_lexico);

        txt_codigo.setColumns(20);
        txt_codigo.setRows(5);
        jScrollPane2.setViewportView(txt_codigo);

        btn_analisis_lexico.setText("Analisis Lexico");
        btn_analisis_lexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_analisis_lexicoActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo");

        jLabel2.setText("Analisis Lexico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(137, 137, 137))
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(btn_importar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_analisis_lexico)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_importar)
                    .addComponent(btn_analisis_lexico))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_analisis_lexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_analisis_lexicoActionPerformed
        // TODO add your handling code here:
        
        File archivo = new File("archivo.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            escribir.print(txt_codigo.getText());
            escribir.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(formPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        String codigo_analisis = txt_codigo.getText();
        if (codigo_analisis.equals("")){
            JOptionPane.showMessageDialog(null, "No hay ningun codigo a analizar.");
        }else{
            try {
                Reader lectura = new BufferedReader(new FileReader("archivo.txt"));
                Analizador_Lexico lexico = new Analizador_Lexico(lectura);
                String resultado = "";
                while(true){
                    Tokens token = lexico.yylex();
                   
                   if(token == null){
                       resultado += "FIN";
                       txt_lexico.setText(resultado);
                       return;
                   }
                   switch (token) {
                       case ERROR:
                           resultado += lexico.yytext() +  " Simbolo no definido.\n";
                           break;
                       
                       case reservadas:
                           resultado += lexico.yytext() +" Es una palabra Reservada.\n";
                           break;
                       case identificador:
                           resultado += lexico.yytext() +" Es identificador.\n";
                           break;
                       case operadorRelacional:
                           resultado += lexico.yytext() +" Es un operador relacional.\n";
                           break;
                       case operadorAritmetico:
                           resultado += lexico.yytext() +" Es un operador aritmetico.\n";
                           break;
                       case texto:
                           resultado += lexico.yytext() +" Es un string.\n";
                           break;
                       case numero:
                           resultado += lexico.yytext() +" Es un numero.\n";
                           break;
                       case espacio:
                           resultado += "";
                           break;
                       case modulo:
                           resultado += lexico.yytext() +" Es un operador aritmetico.\n";
                           break;
                       case caracterReservado:
                           resultado += lexico.yytext() +" Es caracter reservado.\n";
                           break;
                       case findelinea:
                           resultado += "";
                           break;
                       case continuacionlinea:
                           resultado += "";
                           break;
                       default:
                           resultado += "El token: " + token + "\n";
                           break;
                   }
                }
                
            }catch (FileNotFoundException ex) {
                Logger.getLogger(formPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(formPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
     }       
    }//GEN-LAST:event_btn_analisis_lexicoActionPerformed

    private void btn_importarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_importarActionPerformed
        // TODO add your handling code here:
       try{
                    String Ruta="";
                    JFileChooser chooser = new JFileChooser();
                    FileNameExtensionFilter filter = new FileNameExtensionFilter("Notepads", "txt");
                    chooser.setFileFilter(filter);
                    int returnVal = chooser.showOpenDialog(chooser);
                    if(returnVal == JFileChooser.APPROVE_OPTION) {
                        Ruta= chooser.getSelectedFile().getAbsolutePath();
                    }
                    String cadena;
                    FileReader entrada = new FileReader(Ruta);
                    BufferedReader b = new BufferedReader(entrada);
                    String codigo_texto = "";
                    while((cadena = b.readLine())!=null) {
                        codigo_texto += cadena + '\n';
                    }
                    txt_codigo.setText(codigo_texto);
                    b.close();
                }catch(Exception e){
                    System.out.println("No se encontro el archivo");
                }

    }//GEN-LAST:event_btn_importarActionPerformed

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
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_analisis_lexico;
    private javax.swing.JButton btn_importar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txt_codigo;
    private javax.swing.JTextArea txt_lexico;
    // End of variables declaration//GEN-END:variables
}
