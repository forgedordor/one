package defpackage;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceus {
    private final cmfo a;
    private final ceto b;

    public ceus(cmgk cmgkVar, ceto cetoVar, ains ainsVar, eosc eoscVar) {
        this.b = cetoVar;
        cmgg cmggVarC = cmgh.c();
        cmggVarC.d(cmfn.FIREBASE);
        cmggVarC.f(cesv.a);
        cmggVarC.e(new ceuq(cetoVar, eoscVar, ainsVar));
        cmggVarC.c(new Supplier() { // from class: ceum
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ceur();
            }
        });
        this.a = cmgkVar.a(cmggVarC.a());
    }

    public final eiju a() {
        return this.a.h().h(new ejvr() { // from class: ceul
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Long.valueOf(((cesv) obj).b);
            }
        }, eoqg.a);
    }

    public final eiju b(final Long l) {
        ejvr ejvrVarA = eiid.a(new ejvr() { // from class: cetk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cetd cetdVar = (cetd) ((cete) obj).toBuilder();
                long jLongValue = l.longValue();
                cetdVar.copyOnWrite();
                ((cete) cetdVar.instance).f = jLongValue;
                return (cete) cetdVar.build();
            }
        });
        ecjh ecjhVar = this.b.a;
        eoqg eoqgVar = eoqg.a;
        return eijx.m(eiju.g(ecjhVar.b(ejvrVarA, eoqgVar)), this.a.j(new ejvr() { // from class: ceun
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cesu cesuVar = (cesu) ((cesv) obj).toBuilder();
                long jLongValue = l.longValue();
                cesuVar.copyOnWrite();
                ((cesv) cesuVar.instance).b = jLongValue;
                return (cesv) cesuVar.build();
            }
        })).a(new Callable() { // from class: ceuo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, eoqgVar);
    }
}
