package de.dhbw.ka.se2.application.vecto;

import de.dhbw.ka.se2.vecto4j.Simulator;

public class Co2SimulationProcess {
	private final VehicleWeightsClient weightsAccess;
	private final Simulator simulator;
	
	public Co2SimulationProcess(final VehicleWeightsClient weightsAcces, final Simulator simulator) {
		this.weightsAccess = weightsAcces;
		this.simulator = simulator;
	}
}
