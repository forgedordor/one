package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eske extends BroadcastReceiver {
    public eskf a;

    public eske(eskf eskfVar) {
        this.a = eskfVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        eskf eskfVar = this.a;
        if (eskfVar != null && eskfVar.c()) {
            if (eskf.b()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            eskf eskfVar2 = this.a;
            FirebaseMessaging firebaseMessaging = eskfVar2.a;
            FirebaseMessaging.k(eskfVar2, 0L);
            this.a.a().unregisterReceiver(this);
            this.a = null;
        }
    }
}
