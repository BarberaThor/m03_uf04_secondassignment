/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment;

/**
 *
 * @author pep
 */
public class M03_UF04_SecondAssignment {
    
    public static void main(String[] args) {
        
         Sobremesa terminal = new TerminalDeVenta("Terminal", "Especificacions estandard", 1200);
         
         terminal.conecta();
         
         terminal.desconecta();
         
         Mobiles tablet = new Tablet("Samsung","Model Z Blanc", 500);
         
    }
 
}
