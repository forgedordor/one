package com.google.android.gms.contactkeys.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.contactkeys.internal.IContactKeyStatusCallback;
import defpackage.dcjb;
import defpackage.defr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalContactKeyClient$updateOrInsertE2eeContactKey$1$callback$1 extends IContactKeyStatusCallback.Stub {
    final /* synthetic */ defr<Void> $completionSource;

    InternalContactKeyClient$updateOrInsertE2eeContactKey$1$callback$1(defr<Void> defrVar) {
        this.$completionSource = defrVar;
    }

    @Override // com.google.android.gms.contactkeys.internal.IContactKeyStatusCallback
    public void onResult(Status status) {
        status.getClass();
        dcjb.a(status, this.$completionSource);
    }
}
