package com.google.android.gms.contactkeys.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.contactkeys.internal.IContactKeyIntentCallback;
import defpackage.dcjb;
import defpackage.defr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalContactKeyClient$getOnboardingIntent$1$callback$1 extends IContactKeyIntentCallback.Stub {
    final /* synthetic */ defr<PendingIntent> $completionSource;

    InternalContactKeyClient$getOnboardingIntent$1$callback$1(defr<PendingIntent> defrVar) {
        this.$completionSource = defrVar;
    }

    @Override // com.google.android.gms.contactkeys.internal.IContactKeyIntentCallback
    public void onResult(Status status, PendingIntent pendingIntent) {
        status.getClass();
        pendingIntent.getClass();
        dcjb.b(status, pendingIntent, this.$completionSource);
    }
}
