package de.dhbw.ka.se2.application.vecto;

import de.dhbw.ka.se2.domain.print.FullVehicle;
import de.dhbw.ka.se2.vecto4j.Simulator;
import de.dhbw.ka.se2.vecto4j.input.VehicleInput;

public class Co2SimulationProcess {
	private final VehicleWeightsClient weightsAccess;
	private final Simulator simulator;
	
	public Co2SimulationProcess(final VehicleWeightsClient weightsAcces, final Simulator simulator) {
		this.weightsAccess = weightsAcces;
		this.simulator = simulator;
	}
	
	public ElectricVehiclesSimulationResult simulateVehicle(final FullVehicle vehicle) {
		VehicleInput input = getInputForVehicle(vehicle);
		enrichInputWithComponents(vehicle.getConfig(), input);
		enrichInputWithWeights(vehicle.getConfig(), input);
		return simulator.calculateVehicle(input);
	}
	
	public VehicleInput getInputForVehicle(final FullVehicle vehicle) {
		VehicleInput input = new VehicleInput();
		switch(vehicle.getMetadata().getType()) {
		
		}
	}
}
