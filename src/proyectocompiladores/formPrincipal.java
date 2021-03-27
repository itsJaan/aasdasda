/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocompiladores;

import ArbolAST.Arbol;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
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
    public String errors = "";
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

        jScrollPane3 = new javax.swing.JScrollPane();
        txt_lexico1 = new javax.swing.JTextArea();
        btn_importar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_lexico = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_codigo = new javax.swing.JTextArea();
        btn_analisis_lexico = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_sintactico = new javax.swing.JTextArea();
        btn_sin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        txt_lexico1.setEditable(false);
        txt_lexico1.setColumns(20);
        txt_lexico1.setForeground(new java.awt.Color(51, 51, 51));
        txt_lexico1.setRows(5);
        txt_lexico1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_lexico1.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        txt_lexico1.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(txt_lexico1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_importar.setText("Importar Codigo");
        btn_importar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_importarActionPerformed(evt);
            }
        });

        txt_lexico.setEditable(false);
        txt_lexico.setColumns(20);
        txt_lexico.setForeground(new java.awt.Color(51, 51, 51));
        txt_lexico.setRows(5);
        txt_lexico.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_lexico.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        txt_lexico.setSelectionColor(new java.awt.Color(255, 255, 255));
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

        txt_sintactico.setEditable(false);
        txt_sintactico.setColumns(20);
        txt_sintactico.setRows(5);
        txt_sintactico.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(txt_sintactico);

        btn_sin.setText("Analisis Sintactico");
        btn_sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sinActionPerformed(evt);
            }
        });

        jLabel3.setText("Analisis Sintactico");

        jButton1.setText("Arbol AST");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel1)
                .addGap(354, 354, 354)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(161, 161, 161))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(btn_importar)
                .addGap(302, 302, 302)
                .addComponent(btn_analisis_lexico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_sin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(142, 142, 142))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_importar)
                    .addComponent(btn_analisis_lexico)
                    .addComponent(btn_sin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(14, 14, 14))
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
            txt_lexico.setText("");
            JOptionPane.showMessageDialog(null, "No hay ningun codigo a analizar.");
        }else{
            try {
                Reader lectura = new BufferedReader(new FileReader("archivo.txt"));
                Analizador_Lexico lexico = new Analizador_Lexico(lectura);
                String resultado = "";
                while(true){
                    Tokens token = lexico.yylex();
                   
                   if(token == null){
                       txt_lexico.setText(resultado);
                       return;
                   }
                   switch (token) {
                       case error_:
                           
                           resultado += "<<Se encontro error: "+ lexico.yytext() + " en la linea: "+ lexico.getLine()+ " columna: " + lexico.getColumn() +">>\n";
                           break;
                       
                       case imports:case public_:case module: case if_:case sub:case for_:case dim:case end_:case integer_:
                       case boolean_:case string_:case system_:case console_:case writeline:case as:case do_:case while_:
                       case struct:case then:case else_:case function_:case return_:case next:case private_:case loop:
                       case exit:case until:case to:case and:case or:case true_:case false_:case like:case mod:case int_:
                       case main_:case step_:case byval:case elseif_:case readline:case null_:
                           resultado += lexico.yytext() +"\t\t   << Es una palabra Reservada. >>\n";
                           break;
                       case identificador:
                           resultado += lexico.yytext() +"\t\t   << Es identificador. >>\n";
                           break;
                       case mayorigual:case menorigual:case igual: case mayor:case menor:
                           resultado += lexico.yytext() +"\t\t   << Es un operador relacional. >>\n";
                           break;
                       case suma:case resta_:case mult: case div:case potencia:case mod_:
                           resultado += lexico.yytext() +"\t\t   << Es un operador aritmetico. >>\n";
                           break;
                       case texto_:
                           resultado += lexico.yytext() +"\t   << Es un string. >>\n";
                           break;
                       case numero:
                           resultado += lexico.yytext() +"\t\t   << Es un numero. >>\n";
                           break;
                       case modulo:
                           resultado += lexico.yytext() +"\t\t   << Es un operador aritmetico. >>\n";
                           break;
                       case punto:case comillaD:case comillaS: case parentesisA:
                       case parentesisC:case llaveA:case llaveC:case coma:
                           resultado += lexico.yytext() +"\t\t   <<  Es caracter reservado. >>\n";
                           break;
                       case findelinea:
                           resultado += "<< ENTER >>\n";
                           break;
                       case continuaciondelinea:
                           resultado += "";
                           break;
                       case comentario:
                           resultado += lexico.yytext() + "\t\t    << COMENTARIO >>\n";
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

    private void btn_sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sinActionPerformed
        // TODO add your handling code here:
        String st = txt_codigo.getText();
        Sintax s = new Sintax(new proyectocompiladores.Analizador_Sintactico(new StringReader(st)));
       
        
        if (st.equals("")){
            txt_sintactico.setText("");
            JOptionPane.showMessageDialog(null, "No hay ningun codigo a analizar.");
            
        }else{
            
            
            try {
                s.parse();
                txt_sintactico.setText("Successful");
                txt_sintactico.setForeground(Color.GREEN);
               
                
                ArrayList<String> sym = s.getError();
                System.out.println(sym);
                Iterator<String> iterador = sym.iterator();

                
                
                if(sym.size() > 0){
                    while(iterador.hasNext()){
                        String elemento = iterador.next();
                        errors += elemento + "\n";
                        txt_sintactico.setText(errors);
                        txt_sintactico.setForeground(Color.RED);
                    }
                    
                }
                
                String t = s.getUnrecovery();
                if(!t.equals("")){   
                System.out.println("Entre al unrecovery");
                System.out.println("El valor del unrecovery es: " + t);
                txt_sintactico.setText(t);
                txt_sintactico.setForeground(Color.RED);
                }
            } catch (Exception ex) {
//                String t = s.getUnrecovery();
//                System.out.println("Entre al exception");
//                txt_sintactico.setText(t);
//                txt_sintactico.setForeground(Color.RED);
                
            }                  
            errors = ""; 
            
        }
        
    }//GEN-LAST:event_btn_sinActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
        String st = txt_codigo.getText();
        Sintax s = new Sintax(new proyectocompiladores.Analizador_Sintactico(new StringReader(st)));
        try{
            s.getArbol().imprimir();
        }catch(Exception e){
            System.out.println("error: " + e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton btn_sin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea txt_codigo;
    private javax.swing.JTextArea txt_lexico;
    private javax.swing.JTextArea txt_lexico1;
    private javax.swing.JTextArea txt_sintactico;
    // End of variables declaration//GEN-END:variables
}
