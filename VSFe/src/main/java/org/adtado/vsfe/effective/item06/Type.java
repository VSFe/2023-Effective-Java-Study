package org.adtado.vsfe.effective.item06;

public enum Type {
	A, B, C, D, F;

	public static Type valueOfBadCase(Long value) {
		if (Long.compare(800000000L, value) < Integer.valueOf("0")) {
			return A;
		} else if (Long.compare(600000000L, value) < Integer.valueOf("0")) {
			return B;
		} else if (Long.compare(400000000L, value) < Integer.valueOf("0")) {
			return C;
		} else if (Long.compare(200000000L, value) < Integer.valueOf("0")) {
			return D;
		} else {
			return F;
		}
	}

	public static Type valueOfGoodCase(long value) {
		return Type.values()[(int)(value / 200000000L)];
	}
}
