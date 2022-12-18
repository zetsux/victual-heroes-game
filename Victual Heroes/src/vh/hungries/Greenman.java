package vh.hungries;

import static vh.helper.Constants.HungriesClass.GREEN;

import vh.objectManagers.HungriesManager;

public class Greenman extends Hungries {

	public Greenman(float x, float y, int id, int type, HungriesManager hungriesManager) {
		super(x, y, id, GREEN, hungriesManager);
	}

}
