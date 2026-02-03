package com.sun.jna;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FunctionResultContext extends FromNativeContext {
    private Object[] args;
    private Function function;

    public FunctionResultContext(Class<?> cls, Function function, Object[] objArr) {
        super(cls);
        this.function = function;
        this.args = objArr;
    }

    public Object[] getArguments() {
        return this.args;
    }

    public Function getFunction() {
        return this.function;
    }
}
