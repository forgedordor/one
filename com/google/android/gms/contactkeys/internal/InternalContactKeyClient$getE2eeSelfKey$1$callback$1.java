package com.google.android.gms.contactkeys.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.contactkeys.E2eeSelfKeyParcelable;
import com.google.android.gms.contactkeys.internal.ISelfKeyCallback;
import defpackage.dcjb;
import defpackage.defr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalContactKeyClient$getE2eeSelfKey$1$callback$1 extends ISelfKeyCallback.Stub {
    final /* synthetic */ defr<E2eeSelfKeyParcelable> $completionSource;

    InternalContactKeyClient$getE2eeSelfKey$1$callback$1(defr<E2eeSelfKeyParcelable> defrVar) {
        this.$completionSource = defrVar;
    }

    @Override // com.google.android.gms.contactkeys.internal.ISelfKeyCallback
    public void onResult(Status status, E2eeSelfKeyParcelable e2eeSelfKeyParcelable) {
        status.getClass();
        dcjb.b(status, e2eeSelfKeyParcelable, this.$completionSource);
    }
}
