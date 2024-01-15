
class Player {
    
    // definisi atribut
    String name;
    String nameMusuh;
    int speed,speedMusuh;
    int healthPoin,healthPoinMusuh;
    int damage,damageMusuh;
    int armor,armorMusuh;
    int Power,PowerMusuh;

    // definisi method run
    void run(){
        System.out.println(name +" is running...");
        System.out.println("Speed: "+ speed);
    }
    void attack(String nameMusuh){
        System.out.println(name +" is attacking " + nameMusuh);
        System.out.println("Damage: "+ damage);
    }
    void defense(String nameMusuh){
        System.out.println(name + " is defending from " + nameMusuh);
        System.out.println("Armor: "+ armor);
    }

    // definisi method isDead untuk mengecek nilai kesehatan (healthPoin)
    boolean isDead(){
        if(healthPoin <= 0) return true;
        return false;
    }
    
}
        
class OOP {
    public static void main(String[] args){

        // membuat objek player
        Player Hero = new Player();
        Player Enemy = new Player();

        // mengisi atribut player
        Hero.name = "Sulthano";
        Hero.speed = 99;
        Hero.damage = 999;
        Hero.armor = 350;
        Hero.healthPoin = 500;
        Hero.Power = 80;

        Enemy.nameMusuh = "Dzul";
        Enemy.speedMusuh = 99;
        Enemy.damageMusuh = 90;
        Enemy.armorMusuh = 300;
        Enemy.healthPoinMusuh = 200;
        Enemy.PowerMusuh = 75;
        


        // menjalankan method
        Hero.run();
        Hero.attack(Enemy.nameMusuh);
        Hero.defense(Enemy.nameMusuh);

        if(Hero.isDead()){
            System.out.println("Game Over!");
        }

    }
}

