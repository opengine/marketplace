package com.gracefulcode.opengine;

import com.github.opengine.resource.Resource;
import java.util.HashMap;

public class Marketplace<T extends Class<? extends Resource>> {
	protected HashMap<T, Integer> supply;
	protected HashMap<T, Integer> demand;

	public void addSupply(T cls, int amount) {
		if (this.supply == null) {
			this.supply = new HashMap<T, Integer>();
		}
		this.supply.put(cls, this.supply.get(cls, 0) + amount);
	}

	public void addDemand(T cls, int amount) {
		if (this.demand == null) {
			this.demand = new HashMap<T, Integer>();
		}
		this.supply.put(cls, this.demand.get(cls, 0) + amount);
	}

	public String toString() {
		return "Market: supply: " + (this.supply == null ? "null" : this.supply.toString()) + ", demand: " + (this.demand == null ? "null" : this.demand.toString());
	}
}