package com.sun.jna;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface TypeMapper {
    FromNativeConverter getFromNativeConverter(Class<?> cls);

    ToNativeConverter getToNativeConverter(Class<?> cls);
}
