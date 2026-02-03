package defpackage;

import android.net.ConnectivityManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qgh implements qhb {
    public final ConnectivityManager a;

    public qgh(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // defpackage.qhb
    public final fdpl a(pzj pzjVar) {
        pzjVar.getClass();
        return new fdpb(new qgg(pzjVar, this, null));
    }

    @Override // defpackage.qhb
    public final boolean b(qjn qjnVar) {
        return qjnVar.l.a() != null;
    }

    @Override // defpackage.qhb
    public final boolean c(qjn qjnVar) {
        if (b(qjnVar)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }
}
