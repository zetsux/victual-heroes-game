package vh.hungries;

import static vh.helper.Constants.HungriesClass.YELLOW;

import vh.objectManagers.HungriesManager;

public class Yellowman extends Hungries {

	public Yellowman(float x, float y, int id, int type, HungriesManager hungriesManager) {
		super(x, y, id, YELLOW, hungriesManager);
	}

}