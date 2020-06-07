package com.issues.adaptor.util;

import org.threeten.extra.YearWeek;

public class YearWeekUtil {
	private YearWeekUtil() {
	}

	public static String stringOf(YearWeek yearWeek) {
		return "" + yearWeek.getYear() + yearWeek.getWeek();
	}

	public static Integer intOf(YearWeek yearWeek) {
		return Integer.parseInt("" + yearWeek.getYear() + yearWeek.getWeek());
	}
}
