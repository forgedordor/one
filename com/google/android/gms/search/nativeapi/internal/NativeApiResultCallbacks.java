package com.google.android.gms.search.nativeapi.internal;

import com.google.android.gms.search.nativeapi.GetNativeApiInfoCall$Response;
import com.google.android.gms.search.nativeapi.internal.INativeApiCallbacks;
import defpackage.dcgq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class NativeApiResultCallbacks<R> extends INativeApiCallbacks.Stub {
    private final dcgq a;
    private final Class b;

    public NativeApiResultCallbacks(dcgq<R> dcgqVar, Class<R> cls) {
        this.a = dcgqVar;
        this.b = cls;
    }

    @Override // com.google.android.gms.search.nativeapi.internal.INativeApiCallbacks
    public void onGetNativeApiInfoResponse(GetNativeApiInfoCall$Response getNativeApiInfoCall$Response) {
        this.a.c(this.b.cast(getNativeApiInfoCall$Response));
    }
}
