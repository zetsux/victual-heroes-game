package vh.hungries;

import static vh.helper.Constants.HungriesClass.MOHAWK;

import vh.objectManagers.HungriesManager;

public class Mohawkman extends Hungries {

	public Mohawkman(float x, float y, int id, int type, HungriesManager hungriesManager) {
		super(x, y, id, MOHAWK, hungriesManager);
	}

}