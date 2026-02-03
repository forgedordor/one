package com.google.android.gms.contactkeys.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.contactkeys.E2eeSelfKeyListParcelable;
import com.google.android.gms.contactkeys.internal.ISelfKeysCallback;
import defpackage.dcjb;
import defpackage.defr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalContactKeyClient$getAllE2eeSelfKeys$1$callback$1 extends ISelfKeysCallback.Stub {
    final /* synthetic */ defr<E2eeSelfKeyListParcelable> $completionSource;

    InternalContactKeyClient$getAllE2eeSelfKeys$1$callback$1(defr<E2eeSelfKeyListParcelable> defrVar) {
        this.$completionSource = defrVar;
    }

    @Override // com.google.android.gms.contactkeys.internal.ISelfKeysCallback
    public void onResult(Status status, E2eeSelfKeyListParcelable e2eeSelfKeyListParcelable) {
        status.getClass();
        e2eeSelfKeyListParcelable.getClass();
        dcjb.b(status, e2eeSelfKeyListParcelable, this.$completionSource);
    }
}
