package com.sun.jna;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FromNativeContext {
    private Class<?> type;

    public FromNativeContext(Class<?> cls) {
        this.type = cls;
    }

    public Class<?> getTargetType() {
        return this.type;
    }
}
