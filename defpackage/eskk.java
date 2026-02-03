package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eskk extends BroadcastReceiver {
    final /* synthetic */ eskl a;
    private eskl b;

    public eskk(eskl esklVar, eskl esklVar2) {
        this.a = esklVar;
        this.b = esklVar2;
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        eskl esklVar = this.b;
        if (esklVar != null && esklVar.a()) {
            if (eskl.b()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            eskl esklVar2 = this.b;
            esklVar2.b.b(esklVar2, 0L);
            context.unregisterReceiver(this);
            this.b = null;
        }
    }
}
