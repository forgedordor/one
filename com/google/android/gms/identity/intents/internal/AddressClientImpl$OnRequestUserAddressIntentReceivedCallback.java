package com.google.android.gms.identity.intents.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.identity.intents.internal.IAddressCallbacks;
import defpackage.dclh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AddressClientImpl$OnRequestUserAddressIntentReceivedCallback extends IAddressCallbacks.Stub {
    private final int a;
    private Activity b;

    public AddressClientImpl$OnRequestUserAddressIntentReceivedCallback(int i, Activity activity) {
        this.a = i;
        this.b = activity;
    }

    @Override // com.google.android.gms.identity.intents.internal.IAddressCallbacks
    public void onRequestUserAddressIntentReceived(int i, Bundle bundle) throws IntentSender.SendIntentException, PendingIntent.CanceledException {
        PendingIntent pendingIntentCreatePendingResult;
        if (i == 1) {
            Intent intent = new Intent();
            intent.putExtras(bundle);
            Activity activity = this.b;
            if (activity == null || (pendingIntentCreatePendingResult = activity.createPendingResult(this.a, intent, 1073741824)) == null) {
                return;
            }
            try {
                pendingIntentCreatePendingResult.send(1);
                return;
            } catch (PendingIntent.CanceledException e) {
                Log.w("AddressClientImpl", "Exception settng pending result", e);
                return;
            }
        }
        ConnectionResult connectionResult = new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.identity.intents.EXTRA_PENDING_INTENT") : null);
        if (!connectionResult.b()) {
            try {
                Activity activity2 = this.b;
                dclh.m(activity2);
                PendingIntent pendingIntentCreatePendingResult2 = activity2.createPendingResult(this.a, new Intent(), 1073741824);
                if (pendingIntentCreatePendingResult2 != null) {
                    pendingIntentCreatePendingResult2.send(1);
                    return;
                }
                return;
            } catch (PendingIntent.CanceledException e2) {
                Log.w("AddressClientImpl", "Exception setting pending result", e2);
                return;
            }
        }
        try {
            Activity activity3 = this.b;
            dclh.m(activity3);
            int i2 = this.a;
            if (connectionResult.b()) {
                PendingIntent pendingIntent = connectionResult.d;
                dclh.m(pendingIntent);
                activity3.startIntentSenderForResult(pendingIntent.getIntentSender(), i2, null, 0, 0, 0);
            }
        } catch (IntentSender.SendIntentException e3) {
            Log.w("AddressClientImpl", "Exception starting pending intent", e3);
        }
    }
}
