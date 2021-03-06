// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.5.1
//
// <auto-generated>
//
// Generated from file `Calc.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package Demo;

public interface _CalcOperations
{
    long add(int a, int b, Ice.Current __current);

    long subtract(int a, int b, Ice.Current __current);

    long multiply(int a, int b, Ice.Current __current);

    double avg(int[] is, Ice.Current __current)
        throws NoData;
}
