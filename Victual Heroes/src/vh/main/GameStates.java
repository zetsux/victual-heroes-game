package vh.main;

public enum GameStates {
	
	PLAYING, MENU, ABOUT, OVER, SETTINGS;
	
	public static GameStates gameState = MENU;

	public static void setGameState(GameStates state) {
		gameState = state;
	}
}
