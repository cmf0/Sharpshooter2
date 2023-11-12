package lootbox;

public class Player {
    private int hp;
    Guns gun1;
    Guns gun2;
    Guns gun3;
    int equippedWeapon;
    String name;
    float dollars;
    boolean defended;
    boolean hasPistol;
    boolean hasAssaultRifle;
    boolean hasSniperRifle;
    

    public Player() {
        hp = 100; // Hp inicial
        dollars = 0;
        equippedWeapon = 1;
        gun1 = new Guns(1,1);
        hasPistol = true;
        hasAssaultRifle = false;
        defended=false;
        hasSniperRifle = false; 
    }

    public int getHp() {
        return hp;
    }
    
    public float getDollars() {
    	return dollars;
    }
    
    public Guns getEquippedWeapon() {
    	if(equippedWeapon==1)return gun1;
    	if(equippedWeapon==2)return gun2;
    	if(equippedWeapon==3)return gun3;
    	return null;
    }
    
    public Guns getGun1() {
    	return gun1;
    }
    
    public Guns getGun2() {
    	return gun2;
    }
    
    public Guns getGun3() {
    	return gun3;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    
    public void setDollars(float dollars) {
    	this.dollars += dollars;
    }
    
    public void setEquippedWeapon(int n) {
    	this.equippedWeapon = n;
    }
    
    public void setGun1(Guns gun1) {
    	this.gun1=gun1;
    }
    
	public void setGun2(Guns gun2) {
		this.gun2=gun2;
	}
	
	public void setGun3(Guns gun3) {
		this.gun3=gun3;
	}
}