package com.google.android.gms.auth.api.phone.internal;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.auth.api.phone.internal.IMissedCallRetrieverCallbacks;
import com.google.android.gms.common.api.Status;
import defpackage.dbqu;
import defpackage.dcjb;
import defpackage.dcmc;
import defpackage.defr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalMissedCallRetrieverClient$startIncomingCallRetriever$1$callback$1 extends IMissedCallRetrieverCallbacks.Stub {
    final /* synthetic */ defr<PendingIntent> $completionSource;

    InternalMissedCallRetrieverClient$startIncomingCallRetriever$1$callback$1(defr<PendingIntent> defrVar) {
        this.$completionSource = defrVar;
    }

    @Override // com.google.android.gms.auth.api.phone.internal.IMissedCallRetrieverCallbacks
    public void onMissedCallRetrieverResult(PendingIntent pendingIntent, Status status) {
        dcmc dcmcVar = dbqu.a;
        Log.i(dcmcVar.a, dcmcVar.a("InternalMissedCallRetrieverClient#onMissedCallRetrieverResult invoked with status: %s", status != null ? Integer.valueOf(status.g) : null));
        dcjb.b(status, pendingIntent, this.$completionSource);
    }
}
