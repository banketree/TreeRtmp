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


public class ResponseAddress extends MappedResponseChangedSourceAddressReflectedFrom {
	private static String Tag = ResponseAddress.class.getSimpleName();
	public ResponseAddress() {
		super(MessageAttribute.MessageAttributeType.ResponseAddress);
	}
	
	public static MessageAttribute parse(byte[] data) throws MessageAttributeParsingException {
		ResponseAddress ra = new ResponseAddress();
		MappedResponseChangedSourceAddressReflectedFrom.parse(ra, data);
		Log.i(Tag,"Message Attribute: Response Address parsed: " + ra.toString() + ".");
		return ra;
	}
}
