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

public abstract class _CalcDisp extends Ice.ObjectImpl implements Calc
{
    protected void
    ice_copyStateFrom(Ice.Object __obj)
        throws java.lang.CloneNotSupportedException
    {
        throw new java.lang.CloneNotSupportedException();
    }

    public static final String[] __ids =
    {
        "::Demo::Calc",
        "::Ice::Object"
    };

    public boolean ice_isA(String s)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public boolean ice_isA(String s, Ice.Current __current)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public String[] ice_ids()
    {
        return __ids;
    }

    public String[] ice_ids(Ice.Current __current)
    {
        return __ids;
    }

    public String ice_id()
    {
        return __ids[0];
    }

    public String ice_id(Ice.Current __current)
    {
        return __ids[0];
    }

    public static String ice_staticId()
    {
        return __ids[0];
    }

    public final long add(int a, int b)
    {
        return add(a, b, null);
    }

    public final double avg(int[] is)
        throws NoData
    {
        return avg(is, null);
    }

    public final long multiply(int a, int b)
    {
        return multiply(a, b, null);
    }

    public final long subtract(int a, int b)
    {
        return subtract(a, b, null);
    }

    public static Ice.DispatchStatus ___add(Calc __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        int a;
        int b;
        a = __is.readInt();
        b = __is.readInt();
        __inS.endReadParams();
        long __ret = __obj.add(a, b, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        __os.writeLong(__ret);
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___subtract(Calc __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        int a;
        int b;
        a = __is.readInt();
        b = __is.readInt();
        __inS.endReadParams();
        long __ret = __obj.subtract(a, b, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        __os.writeLong(__ret);
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___multiply(Calc __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        int a;
        int b;
        a = __is.readInt();
        b = __is.readInt();
        __inS.endReadParams();
        long __ret = __obj.multiply(a, b, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        __os.writeLong(__ret);
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___avg(Calc __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        int[] is;
        is = IntSeqHelper.read(__is);
        __inS.endReadParams();
        try
        {
            double __ret = __obj.avg(is, __current);
            IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeDouble(__ret);
            __inS.__endWriteParams(true);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NoData ex)
        {
            __inS.__writeUserException(ex, Ice.FormatType.DefaultFormat);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    private final static String[] __all =
    {
        "add",
        "avg",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "multiply",
        "subtract"
    };

    public Ice.DispatchStatus __dispatch(IceInternal.Incoming in, Ice.Current __current)
    {
        int pos = java.util.Arrays.binarySearch(__all, __current.operation);
        if(pos < 0)
        {
            throw new Ice.OperationNotExistException(__current.id, __current.facet, __current.operation);
        }

        switch(pos)
        {
            case 0:
            {
                return ___add(this, in, __current);
            }
            case 1:
            {
                return ___avg(this, in, __current);
            }
            case 2:
            {
                return ___ice_id(this, in, __current);
            }
            case 3:
            {
                return ___ice_ids(this, in, __current);
            }
            case 4:
            {
                return ___ice_isA(this, in, __current);
            }
            case 5:
            {
                return ___ice_ping(this, in, __current);
            }
            case 6:
            {
                return ___multiply(this, in, __current);
            }
            case 7:
            {
                return ___subtract(this, in, __current);
            }
        }

        assert(false);
        throw new Ice.OperationNotExistException(__current.id, __current.facet, __current.operation);
    }

    protected void __writeImpl(IceInternal.BasicStream __os)
    {
        __os.startWriteSlice(ice_staticId(), -1, true);
        __os.endWriteSlice();
    }

    protected void __readImpl(IceInternal.BasicStream __is)
    {
        __is.startReadSlice();
        __is.endReadSlice();
    }

    public static final long serialVersionUID = 0L;
}
