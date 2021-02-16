package com.EECS.SpringAliasForDemo;

import org.springframework.core.annotation.AliasFor;

@Award
public @interface Trophy {
	@AliasFor(annotation = Award.class, attribute = "value")
	String[] name() default{};
}