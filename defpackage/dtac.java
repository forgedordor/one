package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtac implements dsyb {
    private final dsyb a = new dsyb() { // from class: dtab
        @Override // defpackage.dsyb
        public final /* synthetic */ ejwi a(dsuj dsujVar) {
            return ejud.a;
        }

        @Override // defpackage.dsyb
        public final /* synthetic */ ejwi b(dsuj dsujVar) {
            return ejud.a;
        }

        @Override // defpackage.dsyb
        public final /* synthetic */ ejwi c(dsuj dsujVar) {
            return ejud.a;
        }

        @Override // defpackage.dsyb
        public final /* synthetic */ ListenableFuture d(dsuj dsujVar, ListenableFuture listenableFuture) {
            return dsya.a();
        }

        @Override // defpackage.dsyb
        public final /* synthetic */ ListenableFuture e(dsuj dsujVar, ListenableFuture listenableFuture) {
            return dsya.b();
        }

        @Override // defpackage.dsyb
        public final /* synthetic */ eyek f(dsuj dsujVar) {
            return eyek.DEFAULT;
        }

        @Override // defpackage.dsyb
        public final String g(dsuj dsujVar) {
            return "";
        }

        @Override // defpackage.dsyb
        public final /* synthetic */ ListenableFuture h() {
            throw null;
        }
    };
    private final dsyb b;
    private final Map c;

    public dtac(dsyb dsybVar, Map map) {
        this.b = dsybVar;
        this.c = map;
    }

    private final dsyb i(dsuj dsujVar) {
        if (!(dsujVar instanceof dsxw)) {
            return this.a;
        }
        dsxw dsxwVar = (dsxw) dsujVar;
        dsvq dsvqVarA = dsxwVar.a();
        evsl evslVar = dtaf.a;
        evsl evslVarCheckIsLite = evsn.checkIsLite(evslVar);
        dsvqVarA.d(evslVarCheckIsLite);
        if (!dsvqVarA.r.o(evslVarCheckIsLite.d)) {
            return this.b;
        }
        dsvq dsvqVarA2 = dsxwVar.a();
        evsl evslVarCheckIsLite2 = evsn.checkIsLite(evslVar);
        dsvqVarA2.d(evslVarCheckIsLite2);
        Object objL = dsvqVarA2.r.l(evslVarCheckIsLite2.d);
        dsyb dsybVar = (dsyb) this.c.get(((dtae) (objL == null ? evslVarCheckIsLite2.b : evslVarCheckIsLite2.c(objL))).c);
        dsybVar.getClass();
        return dsybVar;
    }

    @Override // defpackage.dsyb
    public final ejwi a(dsuj dsujVar) {
        return i(dsujVar).a(dsujVar);
    }

    @Override // defpackage.dsyb
    public final ejwi b(dsuj dsujVar) {
        return i(dsujVar).b(dsujVar);
    }

    @Override // defpackage.dsyb
    public final ejwi c(dsuj dsujVar) {
        return i(dsujVar).c(dsujVar);
    }

    @Override // defpackage.dsyb
    public final ListenableFuture d(dsuj dsujVar, ListenableFuture listenableFuture) {
        return i(dsujVar).d(dsujVar, listenableFuture);
    }

    @Override // defpackage.dsyb
    public final ListenableFuture e(dsuj dsujVar, ListenableFuture listenableFuture) {
        return i(dsujVar).e(dsujVar, listenableFuture);
    }

    @Override // defpackage.dsyb
    public final eyek f(dsuj dsujVar) {
        return i(dsujVar).f(dsujVar);
    }

    @Override // defpackage.dsyb
    public final String g(dsuj dsujVar) {
        return i(dsujVar).g(dsujVar);
    }

    @Override // defpackage.dsyb
    public final ListenableFuture h() {
        return eork.i(null);
    }
}
