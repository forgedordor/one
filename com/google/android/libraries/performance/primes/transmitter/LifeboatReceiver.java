package com.google.android.libraries.performance.primes.transmitter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.dzwk;
import defpackage.dzwl;
import defpackage.eoqg;
import defpackage.eork;
import defpackage.evrr;
import defpackage.evsn;
import defpackage.evtj;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class LifeboatReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.hasExtra("MetricSnapshot") && intent.hasExtra("Transmitters")) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("MetricSnapshot");
            byteArrayExtra.getClass();
            try {
                dzwk dzwkVar = (dzwk) evsn.parseFrom(dzwk.a, byteArrayExtra, evrr.a());
                final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                String[] stringArrayExtra = intent.getStringArrayExtra("Transmitters");
                stringArrayExtra.getClass();
                ArrayList arrayList = new ArrayList(stringArrayExtra.length);
                for (String str : stringArrayExtra) {
                    try {
                        Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        arrayList.add(((dzwl) declaredConstructor.newInstance(null)).a(context, dzwkVar));
                    } catch (Throwable th) {
                        Log.e("PrimesLifeboatReceiver", String.format("Unable to transmit the crash using %s.", str), th);
                    }
                }
                ListenableFuture listenableFutureO = eork.o(arrayList);
                pendingResultGoAsync.getClass();
                listenableFutureO.b(new Runnable() { // from class: dzwi
                    @Override // java.lang.Runnable
                    public final void run() {
                        pendingResultGoAsync.finish();
                    }
                }, eoqg.a);
            } catch (evtj e) {
                Log.e("PrimesLifeboatReceiver", "Unable to parse the payload of MetricSnapshot.", e);
            }
        }
    }
}
