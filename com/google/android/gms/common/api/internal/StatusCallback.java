package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.dcgq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class StatusCallback extends IStatusCallback.Stub {
    private final dcgq a;

    public StatusCallback(dcgq<Status> dcgqVar) {
        this.a = dcgqVar;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public void onResult(Status status) {
        this.a.c(status);
    }
}
