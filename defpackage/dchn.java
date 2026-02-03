package defpackage;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dchn implements Runnable {
    final /* synthetic */ ConnectionResult a;
    final /* synthetic */ dcho b;

    public dchn(dcho dchoVar, ConnectionResult connectionResult) {
        this.a = connectionResult;
        this.b = dchoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dcho dchoVar = this.b;
        dchl dchlVar = (dchl) dchoVar.d.l.get(dchoVar.b);
        if (dchlVar == null) {
            return;
        }
        if (!this.a.c()) {
            dchlVar.onConnectionFailed(this.a);
            return;
        }
        dchoVar.c = true;
        dcfc dcfcVar = dchoVar.a;
        if (dcfcVar.h()) {
            dchoVar.e();
            return;
        }
        try {
            dcfcVar.o(null, dcfcVar.k());
        } catch (SecurityException e) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
            this.b.a.n("Failed to get service from broker.");
            dchlVar.onConnectionFailed(new ConnectionResult(10));
        }
    }
}
