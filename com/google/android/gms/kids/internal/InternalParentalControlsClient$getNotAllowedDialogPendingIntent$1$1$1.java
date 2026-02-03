package com.google.android.gms.kids.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import defpackage.dcjb;
import defpackage.defr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalParentalControlsClient$getNotAllowedDialogPendingIntent$1$1$1 extends AbstractKidsCallbacks {
    final /* synthetic */ defr<PendingIntent> $completionSource;

    InternalParentalControlsClient$getNotAllowedDialogPendingIntent$1$1$1(defr<PendingIntent> defrVar) {
        this.$completionSource = defrVar;
    }

    @Override // com.google.android.gms.kids.internal.AbstractKidsCallbacks, com.google.android.gms.kids.internal.IKidsCallbacks
    public void onPendingIntent(Status status, PendingIntent pendingIntent) {
        status.getClass();
        dcjb.b(status, pendingIntent, this.$completionSource);
    }
}
