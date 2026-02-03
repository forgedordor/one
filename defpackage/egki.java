package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egki implements egyi {
    public final ejwi a;
    public final Executor b;
    private final egde c;

    public egki(egde egdeVar, ejwi ejwiVar, Executor executor) {
        this.c = egdeVar;
        this.a = ejwiVar;
        this.b = executor;
    }

    @Override // defpackage.egyi
    public final eopy a() {
        final egdi egdiVar = (egdi) this.c;
        egcq egcqVar = egdiVar.a;
        ListenableFuture listenableFutureE = egcqVar.e();
        eooz eoozVar = new eooz() { // from class: egdh
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return (((egcx) obj).b & 1) != 0 ? eika.j(egdiVar.b.e(), new ejvr() { // from class: egdf
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return ejwi.j((List) obj2);
                    }
                }, eoqg.a) : eork.i(ejud.a);
            }
        };
        eoqg eoqgVar = eoqg.a;
        final ListenableFuture listenableFutureK = eika.k(listenableFutureE, eoozVar, eoqgVar);
        final ListenableFuture listenableFutureJ = eika.j(egcqVar.e(), new ejvr() { // from class: egdg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                egcx egcxVar = (egcx) obj;
                return (egcxVar.b & 1) != 0 ? ejwi.j(Long.valueOf(egcxVar.c)) : ejud.a;
            }
        }, eoqgVar);
        return new eopy(eork.d(listenableFutureK, listenableFutureJ).b(eiid.c(new eooy() { // from class: egkg
            /* JADX WARN: Type inference failed for: r3v1, types: [egkl, java.lang.Object] */
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                ejwi ejwiVar = (ejwi) eork.q(listenableFutureK);
                final ejwi ejwiVar2 = (ejwi) eork.q(listenableFutureJ);
                if (!ejwiVar.g() || !ejwiVar2.g()) {
                    return eork.i(egyh.a);
                }
                egki egkiVar = this.a;
                final ekgb ekgbVarN = ekgb.n((Collection) ejwiVar.c());
                ejwi ejwiVar3 = egkiVar.a;
                if (ejwiVar3.g()) {
                    return eooq.f(ejwiVar3.c().a(ekgbVarN), eiid.a(new ejvr() { // from class: egkh
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            ekgp ekgpVar = (ekgp) obj;
                            ejwl.m(ekhx.o(ekgbVarN).equals(ekgpVar.keySet()), "EligibilityMapper returned different accounts from the original list");
                            return egyh.a(ekgpVar, Instant.ofEpochMilli(((Long) ejwiVar2.c()).longValue()));
                        }
                    }), egkiVar.b);
                }
                ekgi ekgiVar = new ekgi();
                int size = ekgbVarN.size();
                for (int i = 0; i < size; i++) {
                    ekgiVar.i((egbe) ekgbVarN.get(i), egkk.ELIGIBLE);
                }
                return eork.i(egyh.a(ekgiVar.c(), Instant.ofEpochMilli(((Long) ejwiVar2.c()).longValue())));
            }
        }), this.b));
    }

    @Override // defpackage.egyi
    public final ListenableFuture b() {
        return ((egdi) this.c).a.a();
    }

    @Override // defpackage.egyi
    public final Object c() {
        return "com.google.apps.tiktok.account.data.AllAccounts";
    }
}
