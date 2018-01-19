/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_class_prg_00_03_packages;

/**
 *
 * @author kbsmith01
 */
public class JAVA_CLASS_PRG_00_03_Packages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String name = new String("Fred");
        //System.out.println(name.charAt(2));
        
        for(int i = 0 ; i < name.length() ; i++) {
            System.out.println(name.charAt(i));
        }
    }
    
}
