package process;

import data.Arm;
import data.ArmRepresentation;

public class ArmRepresentationBuilder {

	public static ArmRepresentation build(Arm arm) {
		ArmRepresentation ar =  new ArmRepresentation();
		Kinematic.placePoints(arm, ar);
		return ar;
	}
	
}
