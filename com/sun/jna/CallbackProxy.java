package com.sun.jna;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface CallbackProxy extends Callback {
    Object callback(Object[] objArr);

    Class<?>[] getParameterTypes();

    Class<?> getReturnType();
}
