package vh.helper;

public class Constants {
	
	public static class DirectionClass {
		public static final int LEFT = 0;
		public static final int UP = 1;
		public static final int RIGHT = 2;
		public static final int DOWN = 3;
	}
	
	public static class TilesClass {
		public static final int BLOCKED = 0;
		public static final int TOWERSPOT = 1;
		public static final int ENEMYROAD = 2;
	}
	
	public static class HungriesClass {
		public static final int BALD = 0;
		public static final int YELLOW = 1;
		public static final int PURPLE = 2;
		public static final int POLICE = 3;
		public static final int ORANGE = 4;
		public static final int MOHAWK = 5;
		public static final int GREEN = 6;
		
		public static int getMoney(int hType) {
			switch (hType) {	
				case BALD :
					return 1;
				case YELLOW :
					return 1;
				case PURPLE :
					return 2;
				case POLICE :
					return 3;
				case ORANGE :
					return 3;
				case MOHAWK :
					return 4;
				case GREEN :
					return 5;
			}
			
			return 0;
		}
		
		public static float getSpeed(int eType) {
			switch (eType) {
				case BALD :
					return 1f;
				case YELLOW :
					return 1.6f;
				case POLICE :
					return 1.2f;
				case ORANGE :
					return 2f;
				case PURPLE :
					return 0.8f;
				case MOHAWK :
					return 2.4f;
				case GREEN :
					return 0.8f;
			}
			
			return 0;
		}

		public static int getHunger(int eType) {
			switch (eType) {
				case BALD :
					return 100;
				case YELLOW :
					return 70;
				case PURPLE :
					return 200;
				case POLICE :
					return 300;
				case ORANGE :
					return 250;
				case MOHAWK :
					return 100;
				case GREEN :
					return 500;
			}
			return 0;
			
		}
		
		public static int getCapacityCount(int eType) {
			switch (eType) {
				case BALD :
					return 1;
				case YELLOW :
					return 1;
				case PURPLE :
					return 1;
				case POLICE :
					return 2;
				case ORANGE :
					return 2;
				case MOHAWK :
					return 2;
				case GREEN :
					return 3;
			}
			return 0;
			
		}
	}
	
	public static class StallsClass {
		public static final int PUKIS = 0;
		public static final int BAKSO = 1;
		public static final int ESCAMPUR = 2;
		public static final int GEPREK = 3;
		
		public static int getStallPrice(int sType) {
			switch (sType) {
			case PUKIS :
				return 40;
			case BAKSO :
				return 70;
			case ESCAMPUR :
				return 50;
			case GEPREK :
				return 50;
			}
			return 0;
		}
		
		public static String getName(int tType) {
			switch (tType) {
			case PUKIS :
				return "Stall Pukis";
			case BAKSO :
				return "Stall Bakso";
			case ESCAMPUR :
				return "Stall Es Campur";
			case GEPREK :
				return "Stall Ayam Geprek";
			}
			
			return "";
		}
		
		public static int getDefaultDamage(int tType) {
			switch (tType) {
				case PUKIS :
					return 5;
				case BAKSO :
					return 50;
				case ESCAMPUR :
					return 10;
				case GEPREK :
					return 7;
			}
			return 0;
		}
		
		public static float getDefaultRange(int tType) {
			switch (tType) {
				case PUKIS :
					return 300;
				case BAKSO :
					return 180;
				case ESCAMPUR :
					return 250;
				case GEPREK :
					return 250;
			}
			return 0;
		}
		
		public static float getDefaultCooldown(int tType) {
			switch (tType) {
				case PUKIS :
					return 25;
				case BAKSO :
					return 70;
				case ESCAMPUR :
					return 50;
				case GEPREK :
					return 50;
			}
			return 0;
		}
	}
	
	public static class FoodsClass {
		public static final int PUKISFOOD = 0;
		public static final int BAKSOFOOD = 1;
		public static final int ESCAMPURFOOD = 2;
		public static final int GEPREKFOOD = 3;
		
		public static float getSpeed (int fType) {
			switch(fType) {
				case PUKISFOOD :
					return 7.5f;
				case BAKSOFOOD :
					return 4.5f;
				case ESCAMPURFOOD :
					return 6f;
				case GEPREKFOOD :
					return 5f;
			}
			return 0f;
		}
	}
}
