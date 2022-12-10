package vh.helper;

public class Constants {
	
	public static class Direction {
		public static final int LEFT = 0;
		public static final int UP = 1;
		public static final int RIGHT = 2;
		public static final int DOWN = 3;
	}
	
	public static class Tiles {
		public static final int BLOCKED = 0;
		public static final int TOWERSPOT = 1;
		public static final int ENEMYROAD = 2;
	}
	
	public static class Enemies {
		public static final int BALD = 0;
		public static final int YELLOW = 1;
		public static final int POLICE = 2;
		public static final int ORANGE = 3;
		public static final int PURPLE = 4;
		public static final int MOHAWK = 5;
		public static final int GREEN = 6;
		
		public static float getSpeed(int eType) {
			switch (eType) {
				case BALD :
					return 1.4f;
				case YELLOW :
					return 2f;
				case POLICE :
					return 1.6f;
				case ORANGE :
					return 2.2f;
				case PURPLE :
					return 1.2f;
				case MOHAWK :
					return 1.8f;
				case GREEN :
					return 1f;
			}
			
			return 0;
		}

		public static int getEnemyHP(int eType) {
			switch (eType) {
				case BALD :
					return 100;
				case YELLOW :
					return 80;
				case POLICE :
					return 90;
				case ORANGE :
					return 60;
				case PURPLE :
					return 120;
				case MOHAWK :
					return 140;
				case GREEN :
					return 160;
			}
			return 0;
			
		}
	}
	
	public static class Towers {
		public static final int METAL = 0;
		public static final int JADE = 1;
		public static final int ESCAMPUR = 2;
		public static final int WOOD = 3;
		
		public static String getName(int tType) {
			switch (tType) {
			case METAL :
				return "Metal";
			case JADE :
				return "Jade";
			case ESCAMPUR :
				return "Stan Es Campur";
			case WOOD :
				return "Wood";
			}
			
			return "";
		}
		
		public static int getDefaultDamage(int tType) {
			switch (tType) {
				case METAL :
					return 5;
				case JADE :
					return 8;
				case ESCAMPUR :
					return 15;
				case WOOD :
					return 12;
			}
			return 0;
		}
		
		public static float getDefaultRange(int tType) {
			switch (tType) {
				case METAL :
					return 200;
				case JADE :
					return 200;
				case ESCAMPUR :
					return 350;
				case WOOD :
					return 400;
			}
			return 0;
		}
		
		public static float getDefaultCooldown(int tType) {
			switch (tType) {
				case METAL :
					return 25;
				case JADE :
					return 20;
				case ESCAMPUR :
					return 50;
				case WOOD :
					return 40;
			}
			return 0;
		}
	}
	
	public static class TowerProjectiles {
		public static final int METALS = 0;
		public static final int JADES = 1;
		public static final int ESCAMPURS = 2;
		public static final int WOODS = 3;
		
		public static float getSpeed (int pType) {
			switch(pType) {
				case METALS :
					return 5f;
				case JADES :
					return 5f;
				case ESCAMPURS :
					return 10f;
				case WOODS :
					return 10f;
			}
			return 0f;
		}
	}
}
