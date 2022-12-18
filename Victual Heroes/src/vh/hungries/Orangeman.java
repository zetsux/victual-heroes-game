package vh.hungries;

import static vh.helper.Constants.HungriesClass.ORANGE;

import vh.objectManagers.HungriesManager;

public class Orangeman extends Hungries {

	public Orangeman(float x, float y, int id, int type, HungriesManager hungriesManager) {
		super(x, y, id, ORANGE, hungriesManager);
	}

}