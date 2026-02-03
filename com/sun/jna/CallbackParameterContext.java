package com.sun.jna;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CallbackParameterContext extends FromNativeContext {
    private Object[] args;
    private int index;
    private Method method;

    public CallbackParameterContext(Class<?> cls, Method method, Object[] objArr, int i) {
        super(cls);
        this.method = method;
        this.args = objArr;
        this.index = i;
    }

    public Object[] getArguments() {
        return this.args;
    }

    public int getIndex() {
        return this.index;
    }

    public Method getMethod() {
        return this.method;
    }
}
