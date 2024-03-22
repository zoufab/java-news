package com.zou.switch_patterns_matching;

/**
 * sealed : restrict interface with  implementation Tiger and Cat
 * permits: let Tiger and Cat the only implementation for Feline
 */
public sealed interface Feline permits Tiger, Cat {
	public FelineSize size();
}
