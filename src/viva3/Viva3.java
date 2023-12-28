/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viva3;

/**
 *
 * @author user
 */
public class Viva3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Phantoms phantom = new Phantoms();
        Blackmage blackmage = new Blackmage();
       
        System.out.println("The epic battle has begun");
        while(blackmage.getHp() > 0) {
            int damage = phantom.damage(blackmage);
            blackmage.setHp(blackmage.getHp() - damage);
            
            
            System.out.println(blackmage.toString(damage));
        }
        System.out.println("The blackmage is defeated");
        
    }
    
}
