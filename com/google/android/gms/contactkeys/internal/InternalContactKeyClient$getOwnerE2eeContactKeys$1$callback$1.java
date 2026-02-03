package com.google.android.gms.contactkeys.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contactkeys.E2eeContactKeyListParcelable;
import com.google.android.gms.contactkeys.internal.IContactKeysDataHolderCallback;
import defpackage.dcjb;
import defpackage.defr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalContactKeyClient$getOwnerE2eeContactKeys$1$callback$1 extends IContactKeysDataHolderCallback.Stub {
    final /* synthetic */ defr<E2eeContactKeyListParcelable> $completionSource;

    InternalContactKeyClient$getOwnerE2eeContactKeys$1$callback$1(defr<E2eeContactKeyListParcelable> defrVar) {
        this.$completionSource = defrVar;
    }

    @Override // com.google.android.gms.contactkeys.internal.IContactKeysDataHolderCallback
    public void onResult(Status status, DataHolder dataHolder) {
        status.getClass();
        dataHolder.getClass();
        dcjb.b(status, E2eeContactKeyListParcelable.a(dataHolder), this.$completionSource);
    }
}
