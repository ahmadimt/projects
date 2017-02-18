package com.imti.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author imteyaz
 *
 */
@Getter
@Setter
@ToString
public class Menu {

	List<Item> items = new ArrayList<>();

}
