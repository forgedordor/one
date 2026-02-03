package defpackage;

import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abgv implements abgm {
    public final eosc a;
    public final cmfo b;
    public final eygg c;
    private final egyt d;
    private final fcsu e;

    public abgv(eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2, egyt egytVar, eygg eyggVar) {
        this.a = eoscVar;
        cmgk cmgkVar = (cmgk) fcsuVar.b();
        cmgg cmggVarC = cmgh.c();
        cmggVarC.d(cmfn.SATELLITE_DATA_KEY);
        cmggVarC.f(abgy.a);
        cmggVarC.c(new Supplier() { // from class: abgu
            @Override // java.util.function.Supplier
            public final Object get() {
                return new abgn();
            }
        });
        this.b = cmgkVar.a(cmggVarC.a());
        this.e = fcsuVar2;
        this.d = egytVar;
        this.c = eyggVar;
    }

    @Override // defpackage.abgm
    public final egyi a() {
        return new egys(this.d, new eopk() { // from class: abgt
            @Override // defpackage.eopk
            public final eopy a(eopt eoptVar) {
                abgv abgvVar = this.a;
                eiju eijuVarH = (Collection.EL.stream((Set) abgvVar.c.b()).allMatch(new Predicate() { // from class: abgo
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo538negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((bvmk) obj).c();
                    }
                }) && abgvVar.d()) ? abgvVar.b.h().h(new ejvr() { // from class: abgr
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return Integer.valueOf(((abgy) obj).b);
                    }
                }, abgvVar.a) : eijx.e(Integer.valueOf(abgx.STANDALONE.a()));
                return new eopy(eijuVarH);
            }
        }, "SWITCH_DITTO_SCREEN_KEY");
    }

    @Override // defpackage.abgm
    public final eiju b() {
        return !d() ? eijx.e(abgx.STANDALONE) : this.b.h().h(new ejvr() { // from class: abgs
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                abgx abgxVarB = abgx.b(((abgy) obj).b);
                return abgxVarB == null ? abgx.UNRECOGNIZED : abgxVarB;
            }
        }, this.a);
    }

    @Override // defpackage.abgm
    public final eiju c(final abgx abgxVar) {
        return !d() ? eijx.e(null) : this.b.j(new ejvr() { // from class: abgp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                abgw abgwVar = (abgw) ((abgy) obj).toBuilder();
                abgwVar.copyOnWrite();
                ((abgy) abgwVar.instance).b = abgxVar.a();
                return (abgy) abgwVar.build();
            }
        }).h(new ejvr() { // from class: abgq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }

    public final boolean d() {
        return ((abjz) this.e.b()).a();
    }
}
