package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qgm extends ConnectivityManager.NetworkCallback {
    public static final qgm a = new qgm();
    public static final Object b = new Object();
    public static final Map c = new LinkedHashMap();

    private qgm() {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        List<Map.Entry> listAo;
        network.getClass();
        networkCapabilities.getClass();
        qas.c().a(qgu.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (b) {
            listAo = fcva.ao(c.entrySet());
        }
        for (Map.Entry entry : listAo) {
            ((fdap) entry.getValue()).invoke(((NetworkRequest) entry.getKey()).canBeSatisfiedBy(networkCapabilities) ? qfy.a : new qfz(7));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        List listAo;
        network.getClass();
        qas.c().a(qgu.a, "NetworkRequestConstraintController onLost callback");
        synchronized (b) {
            listAo = fcva.ao(c.values());
        }
        Iterator it = listAo.iterator();
        while (it.hasNext()) {
            ((fdap) it.next()).invoke(new qfz(7));
        }
    }
}
