package com.sun.jna;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface NativeMapped {
    Object fromNative(Object obj, FromNativeContext fromNativeContext);

    Class<?> nativeType();

    Object toNative();
}
