package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzxe implements eora {
    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Log.v("ClearcutMetricXmitter", "Transmission is done.");
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        if (Log.isLoggable("ClearcutMetricXmitter", 4)) {
            Log.i("ClearcutMetricXmitter", "Transmission has failed: ".concat(String.valueOf(String.valueOf(th))));
        }
    }
}
