package com.google.android.gms.contactkeys.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.contactkeys.internal.IContactKeyIntCallback;
import defpackage.dcjb;
import defpackage.defr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalContactKeyClient$getMaxKeySizeBytes$1$callback$1 extends IContactKeyIntCallback.Stub {
    final /* synthetic */ defr<Integer> $completionSource;

    InternalContactKeyClient$getMaxKeySizeBytes$1$callback$1(defr<Integer> defrVar) {
        this.$completionSource = defrVar;
    }

    @Override // com.google.android.gms.contactkeys.internal.IContactKeyIntCallback
    public void onResult(Status status, int i) {
        status.getClass();
        dcjb.b(status, 5000, this.$completionSource);
    }
}
