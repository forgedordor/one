package com.google.android.apps.messaging.shared;

import android.content.Intent;
import defpackage.aiix;
import defpackage.aypn;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class NoConfirmationSmsSendService extends aiix {
    public aypn a;

    public NoConfirmationSmsSendService() {
        setIntentRedelivery(true);
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        this.a.b(null, intent);
    }
}
