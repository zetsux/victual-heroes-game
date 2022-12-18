package vh.hungries;

import static vh.helper.Constants.HungriesClass.POLICE;

import vh.objectManagers.HungriesManager;

public class Policeman extends Hungries {

	public Policeman(float x, float y, int id, int type, HungriesManager hungriesManager) {
		super(x, y, id, POLICE, hungriesManager);
	}

}