package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qgg extends fcyz implements fdat {
    int a;
    final /* synthetic */ pzj b;
    final /* synthetic */ qgh c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qgg(pzj pzjVar, qgh qghVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = pzjVar;
        this.c = qghVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qgg) c((fdos) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdae qgbVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdos fdosVar = (fdos) this.d;
            NetworkRequest networkRequestA = this.b.a();
            if (networkRequestA == null) {
                fdosVar.e(null);
                return fctx.a;
            }
            qgh qghVar = this.c;
            qge qgeVar = new qge(fdil.d(fdosVar, null, null, new qgf(qghVar, fdosVar, null), 3), fdosVar);
            if (Build.VERSION.SDK_INT >= 30) {
                ConnectivityManager connectivityManager = qghVar.a;
                qgm qgmVar = qgm.a;
                synchronized (qgm.b) {
                    Map map = qgm.c;
                    boolean zIsEmpty = map.isEmpty();
                    map.put(networkRequestA, qgeVar);
                    if (zIsEmpty) {
                        qas.c().a(qgu.a, "NetworkRequestConstraintController register shared callback");
                        connectivityManager.registerDefaultNetworkCallback(qgmVar);
                    }
                }
                qgbVar = new qgl(networkRequestA, connectivityManager, qgmVar);
            } else {
                qgh qghVar2 = this.c;
                qgc qgcVar = new qgc(qgeVar);
                fdce fdceVar = new fdce();
                ConnectivityManager connectivityManager2 = qghVar2.a;
                try {
                    qas.c().a(qgu.a, "NetworkRequestConstraintController register callback");
                    connectivityManager2.registerNetworkCallback(networkRequestA, qgcVar);
                    fdceVar.a = true;
                } catch (RuntimeException e) {
                    String name = e.getClass().getName();
                    name.getClass();
                    if (!fdgn.n(name, "TooManyRequestsException")) {
                        throw e;
                    }
                    qas.c().b(qgu.a, "NetworkRequestConstraintController couldn't register callback", e);
                    qgeVar.invoke(new qfz(7));
                }
                qgbVar = new qgb(fdceVar, connectivityManager2, qgcVar);
            }
            qgd qgdVar = new qgd(qgbVar);
            this.a = 1;
            if (fdor.b(fdosVar, qgdVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        qgg qggVar = new qgg(this.b, this.c, fcxyVar);
        qggVar.d = obj;
        return qggVar;
    }
}
