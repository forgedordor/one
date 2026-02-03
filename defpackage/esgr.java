package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esgr extends BroadcastReceiver {
    public esgs a;

    public esgr(esgs esgsVar) {
        this.a = esgsVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        esgs esgsVar = this.a;
        if (esgsVar != null && esgsVar.b()) {
            if (FirebaseInstanceId.p()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            esgs esgsVar2 = this.a;
            FirebaseInstanceId firebaseInstanceId = esgsVar2.a;
            FirebaseInstanceId.r(esgsVar2, 0L);
            this.a.a().unregisterReceiver(this);
            this.a = null;
        }
    }
}
