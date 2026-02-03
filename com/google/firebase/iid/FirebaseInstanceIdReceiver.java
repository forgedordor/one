package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import defpackage.dccf;
import defpackage.degc;
import defpackage.esis;
import defpackage.esix;
import defpackage.esjo;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class FirebaseInstanceIdReceiver extends dccf {
    @Override // defpackage.dccf
    protected final int a(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) degc.f(esix.b(cloudMessage.a, context, new esis()))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    @Override // defpackage.dccf
    protected final void b(Bundle bundle) {
        Intent intentPutExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (esjo.f(intentPutExtras)) {
            esjo.d("_nd", intentPutExtras.getExtras());
        }
    }
}
