package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efwy implements dsud {
    public final ejwi a;
    private final egbf b;
    private final Executor c;

    public efwy(egbf egbfVar, Executor executor, ejwi ejwiVar) {
        this.b = egbfVar;
        this.c = executor;
        this.a = ejwiVar;
    }

    @Override // defpackage.dsud
    public final ListenableFuture a(dsuj dsujVar) {
        if (dsujVar instanceof dstx) {
            return ((dstx) dsujVar).a();
        }
        if (dsujVar instanceof dsxw) {
            dsvq dsvqVarA = ((dsxw) dsujVar).a();
            evsl evslVarCheckIsLite = evsn.checkIsLite(efwt.a);
            dsvqVarA.d(evslVarCheckIsLite);
            Object objL = dsvqVarA.r.l(evslVarCheckIsLite.d);
            efws efwsVar = (efws) (objL == null ? evslVarCheckIsLite.b : evslVarCheckIsLite.c(objL));
            if (efwsVar.d) {
                return eork.i(new dsty(3, null));
            }
            if ((efwsVar.b & 1) != 0) {
                eoqt eoqtVarT = eoqt.t(this.b.c(efwo.b(efwsVar.c)));
                ejvr ejvrVar = new ejvr() { // from class: efww
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return null;
                    }
                };
                Executor executor = this.c;
                return eooq.f(eooh.f(eoqtVarT, Exception.class, ejvrVar, executor), eiid.a(new ejvr() { // from class: efwx
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        egbe egbeVar = (egbe) obj;
                        if (egbeVar == null) {
                            return new dsty(4, null);
                        }
                        efwy efwyVar = this.a;
                        String str = egbeVar.b().k;
                        if (((String) ((ejwt) efwyVar.a).a).equals(str)) {
                            return dsty.a(egbeVar.b().g);
                        }
                        if ("pseudonymous".equals(str)) {
                            return new dsty(2, null);
                        }
                        if ("incognito".equals(str)) {
                            return new dsty(3, null);
                        }
                        return null;
                    }
                }), executor);
            }
        }
        return eork.i(null);
    }
}
