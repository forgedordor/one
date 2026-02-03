package com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.IBooleanCallback;
import defpackage.dcjb;
import defpackage.defr;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class InternalSafetyCoreClient$isClassifierAvailable$1$callback$1 extends IBooleanCallback.Stub {
    final /* synthetic */ defr<Boolean> $completionSource;

    InternalSafetyCoreClient$isClassifierAvailable$1$callback$1(defr<Boolean> defrVar) {
        this.$completionSource = defrVar;
    }

    @Override // com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.IBooleanCallback
    public void onResult(Status status, boolean z) {
        status.getClass();
        dcjb.b(status, Boolean.valueOf(z), this.$completionSource);
    }
}
