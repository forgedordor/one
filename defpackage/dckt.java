package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dckt extends dckq {
    public final HashMap d = new HashMap();
    public final Context e;
    public volatile Handler f;
    public final dcmt g;
    public final long h;
    private final dcks i;
    private final long j;
    private volatile Executor k;

    public dckt(Context context, Looper looper) {
        dcks dcksVar = new dcks(this);
        this.i = dcksVar;
        this.e = context.getApplicationContext();
        this.f = new ddmy(looper, dcksVar);
        this.g = dcmt.a();
        this.j = 5000L;
        this.h = 300000L;
        this.k = null;
    }

    @Override // defpackage.dckq
    protected final void c(dckp dckpVar, ServiceConnection serviceConnection) {
        HashMap map = this.d;
        synchronized (map) {
            dckr dckrVar = (dckr) map.get(dckpVar);
            if (dckrVar == null) {
                throw new IllegalStateException(a.J(dckpVar, "Nonexistent connection status for service config: "));
            }
            if (!dckrVar.a(serviceConnection)) {
                throw new IllegalStateException(a.J(dckpVar, "Trying to unbind a GmsServiceConnection  that was not bound before.  config="));
            }
            dckrVar.a.remove(serviceConnection);
            if (dckrVar.b()) {
                this.f.sendMessageDelayed(this.f.obtainMessage(0, dckpVar), this.j);
            }
        }
    }

    @Override // defpackage.dckq
    public final ConnectionResult d(dckp dckpVar, ServiceConnection serviceConnection, String str) {
        ConnectionResult connectionResultD;
        HashMap map = this.d;
        synchronized (map) {
            dckr dckrVar = (dckr) map.get(dckpVar);
            if (dckrVar == null) {
                dckrVar = new dckr(this, dckpVar);
                dckrVar.c(serviceConnection, serviceConnection);
                connectionResultD = dckrVar.d(str);
                map.put(dckpVar, dckrVar);
            } else {
                this.f.removeMessages(0, dckpVar);
                if (dckrVar.a(serviceConnection)) {
                    throw new IllegalStateException(a.J(dckpVar, "Trying to bind a GmsServiceConnection that was already connected before.  config="));
                }
                dckrVar.c(serviceConnection, serviceConnection);
                int i = dckrVar.b;
                if (i == 1) {
                    serviceConnection.onServiceConnected(dckrVar.f, dckrVar.d);
                } else if (i == 2) {
                    connectionResultD = dckrVar.d(str);
                }
                connectionResultD = null;
            }
            if (dckrVar.c) {
                return ConnectionResult.a;
            }
            if (connectionResultD == null) {
                connectionResultD = new ConnectionResult(-1);
            }
            return connectionResultD;
        }
    }
}
