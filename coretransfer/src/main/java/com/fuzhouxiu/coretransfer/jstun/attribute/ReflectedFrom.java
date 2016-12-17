/*
 * This file is part of JSTUN. 
 * 
 * Copyright (c) 2005 Thomas King <king@t-king.de> - All rights
 * reserved.
 * 
 * This software is licensed under either the GNU Public License (GPL),
 * or the Apache 2.0 license. Copies of both license agreements are
 * included in this distribution.
 */

package com.fuzhouxiu.coretransfer.jstun.attribute;

import android.util.Log;

import java.util.logging.Logger;

public class ReflectedFrom extends MappedResponseChangedSourceAddressReflectedFrom {
	private static String Tag = ReflectedFrom.class.getSimpleName();
	
	public ReflectedFrom() {
		super(MessageAttribute.MessageAttributeType.ReflectedFrom);
	}
	
	public static ReflectedFrom parse(byte[] data) throws MessageAttributeParsingException {
		ReflectedFrom result = new ReflectedFrom();
		MappedResponseChangedSourceAddressReflectedFrom.parse(result, data);
		Log.i(Tag,"Message Attribute: ReflectedFrom parsed: " + result.toString() + ".");
		return result;
	}

	
}
