/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3;

/**
 *
 * @author muhda
 */
public class Phantoms {
    private double accuracy;
    private double critRate;
    Blackmage blackmage = new Blackmage();
    
    public Phantoms(){
        this(1.00, 1.00);
    }
    
    public Phantoms(double accuracy, double critRate){
        setAccuracy(accuracy);
        setCritRate(critRate);
    }
    
    public double getAccuracy(){
        return accuracy;
    }
    
    public double getCritRate(){
        return critRate;
    }
    
    public void setAccuracy(double accuracy) {
        if(accuracy >= 0.0 && accuracy <= 1.0) this.accuracy = accuracy;
        
    }
    
    public void setCritRate(double critRate) {
        if(critRate >= 0.0 && critRate <= 1.0) this.critRate = critRate;
    }
    
    public int damage(Blackmage blackmage) {
        int damage = 0;
        double accEffectiveness = getAccuracy() * (1 - blackmage.getevasion());
        double critRateEffectiveness = getCritRate() - blackmage.getcritRes();
//        System.out.println(accEffectiveness);
//        System.out.println(critRateEffectiveness);
//        System.out.println(Math.random());
        if(Math.random() < accEffectiveness) {
            if(Math.random() < critRateEffectiveness) {
                damage = 4;
            } else {
                damage = 2;
            }
        }
        
        return damage;
    }
    
    
    
}
class Blackmage {
    private int hp;
    private final double evasion;
    private final double critResistance;
    public Blackmage(){
        this.hp=100;
        this.evasion=0.05;
        this.critResistance=0.10;
    }
    
    public int getHp(){
        return hp;
    }
    
    public double getevasion(){
        return evasion;
    }
    
    public double getcritRes(){
        return critResistance;
    }
    
    public void setHp(int hp){
        hp = Math.max(0, hp);
        this.hp = hp;
    }
    
    
    public String toString(int damage){
        
        String log = "Phantom has dealt " + "%d " + "damage to the Blackmage (%d/100)";
        
        return String.format(log, damage, getHp());
    }
    
}



