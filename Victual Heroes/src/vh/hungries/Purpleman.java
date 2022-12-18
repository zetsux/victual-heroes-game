package vh.hungries;

import static vh.helper.Constants.HungriesClass.PURPLE;

import vh.objectManagers.HungriesManager;

public class Purpleman extends Hungries {

	public Purpleman(float x, float y, int id, int type, HungriesManager hungriesManager) {
		super(x, y, id, PURPLE, hungriesManager);
	}

}