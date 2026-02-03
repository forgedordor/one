package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pcc implements pcl {
    final /* synthetic */ pce a;

    public pcc(pce pceVar) {
        this.a = pceVar;
    }

    @Override // defpackage.pcl
    public final void g() {
        pce pceVar = this.a;
        synchronized (pceVar.c) {
            if (pceVar.b > 0) {
                Log.w("OperationMonitor", "Resetting OperationMonitor with " + pceVar.b + " active operations.");
            }
            pceVar.b = 0;
            pceVar.a();
        }
    }

    @Override // defpackage.pcl
    public final boolean k() {
        boolean z;
        pce pceVar = this.a;
        Object obj = pceVar.c;
        synchronized (obj) {
            synchronized (obj) {
                z = pceVar.b > 0;
            }
            return z;
        }
        return z;
    }
}
