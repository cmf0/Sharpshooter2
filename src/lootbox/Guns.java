package lootbox;

public class Guns {
	
	int type;
	int rarity;
	int damage;

	public Guns(int type, int rarity){
		
		this.type = type;
		this.rarity = rarity;
	}
	
	public void rollGun(int typeRng, int rarityRng){
		
		if(typeRng<=10) {
			this.type = 3;
		}else if(typeRng<=40) {
			this.type = 2;
		}else if(typeRng>40) {
			this.type = 1;
		}
		
		if(rarityRng<=5) {
			this.rarity = 3;
		}else if(rarityRng<=30) {
			this.rarity = 2;
		}else if(rarityRng>30) {
			this.rarity = 1;
		}	
	}
	
	public String getType() {
		switch(this.type) {
		case 1: return "pistol";
		case 2: return "assault rifle";
		case 3: return "sniper rifle";
		default: return null;
		}
	}
	
	public String getRarity() {
		switch(this.rarity) {
		case 1: return "common";
		case 2: return "elite";
		case 3: return "legendary";
		default: return null;
		}
	}
	
	public int getDamage(Player defender, boolean usedSpecial) {
		switch(type) {
			case 1:
				damage = 20;
				if(rarity==2)damage*=1.50;
				if(rarity==3)damage*=2;
			break;
			case 2:
				damage = 35;
				if(rarity==2)damage*=1.50;
				if(rarity==3)damage*=2;
			break;
			case 3:
				damage = 50;
				if(rarity==2)damage*=1.50;
				if(rarity==3)damage*=2;
			break;
		}
		if(usedSpecial)damage*=2;
		if(defender.defended==true) {
			return damage/4;
		}
		else {
			return damage;
		}
	}
	
	//public String getGunImage() return;
	
	public void setType(int type) {
		this.type = type;
	}
	
	public void setRarity(int rarity) {
		this.rarity = rarity;
	}

}
