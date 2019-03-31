package com.gracefulcode.opengine;

import com.github.opengine.resource.Resource;
import java.util.HashMap;

public class Marketplace {
	protected HashMap<Class<? extends Resource>, Integer> supply;
	protected HashMap<Class<? extends Resource>, Integer> demand;

	public void <T extends Class<? extends Resource>> addSupply(T cls, int amount) {
		if (this.supply == null) {
			this.supply = new HashMap<T, Integer>();
		}
		this.supply.put(cls, this.supply.get(cls) + amount);
	}

	public void <T extends Class<? extends Resource>> addDemand(T cls, int amount) {
		if (this.demand == null) {
			this.demand = new HashMap<T, Integer>();
		}
		this.supply.put(cls, this.demand.get(cls) + amount);
	}

	public String toString() {
		return "Market: supply: " + this.supply.toString() + ", demand: " + this.demand.toString();
	}
}