/**
 * 
 */
package com.imti.util;

/**
 * @author imteyaz
 *
 */
public interface MenuUtils {

	public static int getNumberOfItems(String line) {
		String[] strings = line.split("\\s+");
		return Integer.parseInt(strings[0]);
	}

}
