package defpackage;

import android.net.ConnectivityManager;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qgb extends fdbr implements fdae {
    final /* synthetic */ fdce a;
    final /* synthetic */ ConnectivityManager b;
    final /* synthetic */ qgc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qgb(fdce fdceVar, ConnectivityManager connectivityManager, qgc qgcVar) {
        super(0);
        this.a = fdceVar;
        this.b = connectivityManager;
        this.c = qgcVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.a.a) {
            qas.c().a(qgu.a, "NetworkRequestConstraintController unregister callback");
            this.b.unregisterNetworkCallback(this.c);
        }
        return fctx.a;
    }
}
