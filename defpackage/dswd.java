package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dswd implements dsud {
    private final dsty a;

    public dswd(dsty dstyVar) {
        this.a = dstyVar;
    }

    @Override // defpackage.dsud
    public final ListenableFuture a(dsuj dsujVar) {
        if (dsujVar instanceof dsxw) {
            dsxw dsxwVar = (dsxw) dsujVar;
            dsvq dsvqVarA = dsxwVar.a();
            evsl evslVar = dswi.a;
            evsl evslVarCheckIsLite = evsn.checkIsLite(evslVar);
            dsvqVarA.d(evslVarCheckIsLite);
            if (dsvqVarA.r.o(evslVarCheckIsLite.d)) {
                dsvq dsvqVarA2 = dsxwVar.a();
                evsl evslVarCheckIsLite2 = evsn.checkIsLite(evslVar);
                dsvqVarA2.d(evslVarCheckIsLite2);
                Object objL = dsvqVarA2.r.l(evslVarCheckIsLite2.d);
                dswh dswhVar = (dswh) (objL == null ? evslVarCheckIsLite2.b : evslVarCheckIsLite2.c(objL));
                int iA = dswg.a(dswhVar.d);
                if (iA == 0) {
                    iA = 1;
                }
                int i = iA - 1;
                if (i == 1) {
                    if ((dswhVar.b & 1) != 0) {
                        return eork.i(dsty.a(dswhVar.c));
                    }
                    throw new IllegalArgumentException("GAIA type must have a name");
                }
                if (i == 2) {
                    return eork.i(new dsty(3, null));
                }
                if (i == 3) {
                    return eork.i(new dsty(2, null));
                }
                if (i == 4) {
                    return eork.i(this.a);
                }
                throw new IllegalArgumentException("Unknown type");
            }
        }
        return eork.i(null);
    }
}
