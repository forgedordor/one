package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rsm {
    private static volatile rsm b;
    final Set a = new HashSet();
    private boolean c;
    private final rsl d;

    private rsm(Context context) {
        this.d = new rsl(new rvb(new rsh(context)), new rsi(this));
    }

    static rsm a(Context context) {
        if (b == null) {
            synchronized (rsm.class) {
                if (b == null) {
                    b = new rsm(context.getApplicationContext());
                }
            }
        }
        return b;
    }

    final synchronized void b(rrm rrmVar) {
        Set set = this.a;
        set.add(rrmVar);
        if (!this.c && !set.isEmpty()) {
            rsl rslVar = this.d;
            rvc rvcVar = rslVar.c;
            boolean z = true;
            rslVar.a = ((ConnectivityManager) rvcVar.a()).getActiveNetwork() != null;
            try {
                ((ConnectivityManager) rvcVar.a()).registerDefaultNetworkCallback(rslVar.d);
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e);
                }
                z = false;
            }
            this.c = z;
        }
    }

    final synchronized void c(rrm rrmVar) {
        Set set = this.a;
        set.remove(rrmVar);
        if (this.c && set.isEmpty()) {
            rsl rslVar = this.d;
            ((ConnectivityManager) rslVar.c.a()).unregisterNetworkCallback(rslVar.d);
            this.c = false;
        }
    }
}
