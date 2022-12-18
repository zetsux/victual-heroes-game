package vh.main;

public enum GameStates {
	
	PLAYING, MENU, SETTINGS, OVER;
	
	public static GameStates gameState = MENU;

	public static void setGameState(GameStates state) {
		gameState = state;
	}
	
}
