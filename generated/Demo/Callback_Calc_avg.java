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

public abstract class Callback_Calc_avg extends Ice.TwowayCallback
{
    public abstract void response(double __ret);
    public abstract void exception(Ice.UserException __ex);

    public final void __completed(Ice.AsyncResult __result)
    {
        CalcPrx __proxy = (CalcPrx)__result.getProxy();
        double __ret = 0.0;
        try
        {
            __ret = __proxy.end_avg(__result);
        }
        catch(Ice.UserException __ex)
        {
            exception(__ex);
            return;
        }
        catch(Ice.LocalException __ex)
        {
            exception(__ex);
            return;
        }
        response(__ret);
    }
}
