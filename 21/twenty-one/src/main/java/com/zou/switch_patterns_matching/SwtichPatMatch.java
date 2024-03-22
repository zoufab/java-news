package com.zou.switch_patterns_matching;

public class SwtichPatMatch {

	/**
	 * // Prior to Java 21
	 * <pre>
	 * static String formatter(Object obj) {
	 *     String formatted = "unknown";
	 *     if (obj instanceof Integer i) {
	 *         formatted = String.format("int %d", i);
	 *     } else if (obj instanceof Long l) {
	 *         formatted = String.format("long %d", l);
	 *     } else if (obj instanceof Double d) {
	 *         formatted = String.format("double %f", d);
	 *     } else if (obj instanceof String s) {
	 *         formatted = String.format("String %s", s);
	 *     }
	 *     return formatted;
	 * }
	 * </pre>
	 * @param input
	 */
	public String switchPatterMatching(Object input) {
		return switch (input) {
			case null -> "Here is an NULL value";
			case Integer i -> STR."Here is an INTEGER \{i}";
			case Long l -> STR."Here is a LONG \{l}";
			case Double d -> STR."Here is an DOUBLE \{d}";
			case String s -> STR."Here is an INTEGER \{s}";

			default -> input.toString();
		};
	}

	/**
	 * Switch with WHEN
	 * @param input
	 * @return
	 */
	public String switchWithGuards(Object input) {
		return switch (input) {
			case null -> "NO INPUT";
			case String s when s.equalsIgnoreCase("YES") -> "You got it";
			case String s when s.equalsIgnoreCase("NO") -> "You decline it";
			case String s -> "Sorry?";
			default -> "NO INPUT";
		};
	}

	public String switchWithStringEnchanced(String input) {
		return switch (input) {
			case null -> "NO INPUT";
			case "YES", "Y", "y" -> "You got it";
			case "NO", "N", "n" -> "You decline it";
			default -> "Sorry ?";
		};
	}

	/**
	 * Choose a feline
	 * @param feline
	 * @return
	 */
	public String swithWithEnumSupport(Feline feline) {
		return switch (feline) {
			case Tiger t when t.size() == FelineSize.HUGE -> STR."This feline is a Tiger with HUGE size";
			case Cat c when c.size() == FelineSize.HUGE -> STR."This feline is a Tiger with SMALL size";
			default -> "May be an another animal ?";
		};
	}



}
