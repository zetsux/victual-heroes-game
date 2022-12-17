package vh.hungries;

import static vh.helper.Constants.Enemies.BALD;

import vh.objectManagers.HungriesManager;

public class Baldman extends Hungries {

	public Baldman(float x, float y, int id, int type, HungriesManager hungriesManager) {
		super(x, y, id, BALD, hungriesManager);
	}

}
