package com.google.android.gms.spatula.settings.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.dcjb;
import defpackage.defr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalSpatulaSettingsClient$createStatusCallback$1 extends IStatusCallback.Stub {
    final /* synthetic */ defr<Boolean> $completionSource;

    InternalSpatulaSettingsClient$createStatusCallback$1(defr<Boolean> defrVar) {
        this.$completionSource = defrVar;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public void onResult(Status status) {
        if (status == null) {
            dcjb.b(Status.c, false, this.$completionSource);
        } else {
            dcjb.b(Status.a, Boolean.valueOf(status.d()), this.$completionSource);
        }
    }
}
