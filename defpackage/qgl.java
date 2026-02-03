package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qgl extends fdbr implements fdae {
    final /* synthetic */ NetworkRequest a;
    final /* synthetic */ ConnectivityManager b;
    final /* synthetic */ qgm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qgl(NetworkRequest networkRequest, ConnectivityManager connectivityManager, qgm qgmVar) {
        super(0);
        this.a = networkRequest;
        this.b = connectivityManager;
        this.c = qgmVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        ConnectivityManager connectivityManager = this.b;
        Object obj = qgm.b;
        NetworkRequest networkRequest = this.a;
        qgm qgmVar = this.c;
        synchronized (obj) {
            Map map = qgm.c;
            map.remove(networkRequest);
            if (map.isEmpty()) {
                qas.c().a(qgu.a, "NetworkRequestConstraintController unregister shared callback");
                connectivityManager.unregisterNetworkCallback(qgmVar);
            }
        }
        return fctx.a;
    }
}
