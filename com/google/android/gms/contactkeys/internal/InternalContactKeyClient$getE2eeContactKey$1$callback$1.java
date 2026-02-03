package com.google.android.gms.contactkeys.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.contactkeys.E2eeContactKeyParcelable;
import com.google.android.gms.contactkeys.internal.IContactKeyCallback;
import defpackage.dcjb;
import defpackage.defr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalContactKeyClient$getE2eeContactKey$1$callback$1 extends IContactKeyCallback.Stub {
    final /* synthetic */ defr<E2eeContactKeyParcelable> $completionSource;

    InternalContactKeyClient$getE2eeContactKey$1$callback$1(defr<E2eeContactKeyParcelable> defrVar) {
        this.$completionSource = defrVar;
    }

    @Override // com.google.android.gms.contactkeys.internal.IContactKeyCallback
    public void onResult(Status status, E2eeContactKeyParcelable e2eeContactKeyParcelable) {
        status.getClass();
        dcjb.b(status, e2eeContactKeyParcelable, this.$completionSource);
    }
}
