package com.google.android.gms.inappreach.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.dcjb;
import defpackage.defr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AccountDataResponseApis$createVoidStatusCallback$1 extends IStatusCallback.Stub {
    final /* synthetic */ defr<Void> $completionSource;

    AccountDataResponseApis$createVoidStatusCallback$1(defr<Void> defrVar) {
        this.$completionSource = defrVar;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public void onResult(Status status) {
        status.getClass();
        dcjb.a(status, this.$completionSource);
    }
}
