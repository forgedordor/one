package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbcq extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ cbcr a;
    final /* synthetic */ ConnectivityManager b;

    public cbcq(cbcr cbcrVar, ConnectivityManager connectivityManager) {
        this.a = cbcrVar;
        this.b = connectivityManager;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Object objC;
        fcxe fcxeVar;
        Object objC2;
        fcxe fcxeVar2;
        network.getClass();
        cbcr cbcrVar = this.a;
        if (((eoth) ((askh) cbcrVar.b).a.b()).a("bugle.handle_network_with_null_capabilities")) {
            NetworkCapabilities networkCapabilities = this.b.getNetworkCapabilities(network);
            if (networkCapabilities == null) {
                return;
            }
            cbcrVar.d.h(fctx.a);
            fduf fdufVar = cbcrVar.c;
            do {
                objC2 = fdufVar.c();
                fcxeVar2 = new fcxe();
                fcxeVar2.putAll((Map) objC2);
                fcxeVar2.put(Long.valueOf(network.getNetworkHandle()), networkCapabilities);
            } while (!fdufVar.g(objC2, fcwa.b(fcxeVar2)));
            return;
        }
        cbcrVar.d.h(fctx.a);
        fduf fdufVar2 = cbcrVar.c;
        ConnectivityManager connectivityManager = this.b;
        do {
            objC = fdufVar2.c();
            fcxeVar = new fcxe();
            fcxeVar.putAll((Map) objC);
            Long lValueOf = Long.valueOf(network.getNetworkHandle());
            NetworkCapabilities networkCapabilities2 = connectivityManager.getNetworkCapabilities(network);
            networkCapabilities2.getClass();
            fcxeVar.put(lValueOf, networkCapabilities2);
        } while (!fdufVar2.g(objC, fcwa.b(fcxeVar)));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        fduf fdufVar;
        Object objC;
        fcxe fcxeVar;
        network.getClass();
        networkCapabilities.getClass();
        cbcr cbcrVar = this.a;
        cbcrVar.d.h(fctx.a);
        do {
            fdufVar = cbcrVar.c;
            objC = fdufVar.c();
            fcxeVar = new fcxe();
            fcxeVar.putAll((Map) objC);
            fcxeVar.put(Long.valueOf(network.getNetworkHandle()), networkCapabilities);
        } while (!fdufVar.g(objC, fcwa.b(fcxeVar)));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        fduf fdufVar;
        Object objC;
        fcxe fcxeVar;
        network.getClass();
        do {
            fdufVar = this.a.c;
            objC = fdufVar.c();
            fcxeVar = new fcxe();
            fcxeVar.putAll((Map) objC);
            fcxeVar.remove(Long.valueOf(network.getNetworkHandle()));
        } while (!fdufVar.g(objC, fcwa.b(fcxeVar)));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        this.a.d.h(fctx.a);
    }
}
