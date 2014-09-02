package be.vdab;

import java.util.Properties;

public class HelpdeskMedewerkers {
	private final Properties medewerkers;

	public HelpdeskMedewerkers(Properties medewerkers) {
		this.medewerkers = medewerkers;
	}

	@Override
	public String toString() {
		return medewerkers.toString();
	}
}