package vh.main;

public enum GameStates {
	
	PLAYING, MENU, ABOUT, OVER;
	
	public static GameStates gameState = MENU;

	public static void setGameState(GameStates state) {
		gameState = state;
	}
}
