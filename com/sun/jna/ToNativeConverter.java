package com.sun.jna;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ToNativeConverter {
    Class<?> nativeType();

    Object toNative(Object obj, ToNativeContext toNativeContext);
}
