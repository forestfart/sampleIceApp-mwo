// **********************************************************************
//
// Copyright (c) 2003-2016 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

import Demo._CalcDisp;
import Ice.Current;

public class CalcI extends _CalcDisp
{

	private static final long serialVersionUID = -2448962912780867770L;

	@Override
	public long add(int a, int b, Current __current) {
		System.out.println("ADD: a = " + a + ", b = " + b + ", result = " + (a+b));
		return a+b;
	}
	
	@Override
	public long subtract(int a, int b, Current __current) {
		System.out.println("SUBTRACT: a = " + a + ", b = " + b + ", result = " + (a-b));
		return a-b;
	}

	@Override
	public long multiply(int a, int b, Current __current) {
		System.out.println("MULTIPLY: a = " + a + ", b = " + b + ", result = " + (a*b));
		return a*b;
	}


}
