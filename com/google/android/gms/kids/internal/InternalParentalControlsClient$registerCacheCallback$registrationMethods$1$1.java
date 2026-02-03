package com.google.android.gms.kids.internal;

import com.google.android.gms.common.api.Status;
import defpackage.dcjb;
import defpackage.defr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalParentalControlsClient$registerCacheCallback$registrationMethods$1$1 extends AbstractKidsCallbacks {
    final /* synthetic */ defr<Void> $taskCompletionSource;

    InternalParentalControlsClient$registerCacheCallback$registrationMethods$1$1(defr<Void> defrVar) {
        this.$taskCompletionSource = defrVar;
    }

    @Override // com.google.android.gms.kids.internal.AbstractKidsCallbacks, com.google.android.gms.kids.internal.IKidsCallbacks
    public void onStatus(Status status) {
        status.getClass();
        dcjb.a(status, this.$taskCompletionSource);
    }
}
