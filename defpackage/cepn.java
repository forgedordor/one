package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cepn implements cepf {
    private final eywd a;
    private final eywc b;
    private final cepb c;
    private final Optional d;

    public cepn(eywd eywdVar, eywc eywcVar, Optional optional, cepb cepbVar) {
        this.a = eywdVar;
        this.b = eywcVar;
        this.d = optional;
        this.c = cepbVar;
    }

    private final String h() {
        Optional map = this.d.map(new Function() { // from class: cepl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ceog) obj).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final cepb cepbVar = this.c;
        String str = (String) map.orElseGet(new Supplier() { // from class: cepm
            @Override // java.util.function.Supplier
            public final Object get() {
                return cepbVar.f();
            }
        });
        return !ejwk.c(str) ? str : (String) ceog.a.e();
    }

    @Override // defpackage.cepf
    public final eiju a(ezho ezhoVar) {
        return eiju.g(g().b(ezhoVar));
    }

    @Override // defpackage.cepf
    public final eiju b(ezim ezimVar) {
        return eiju.g(g().c(ezimVar));
    }

    @Override // defpackage.cepf
    public final eiju c(ezkf ezkfVar) {
        return eiju.g(g().d(ezkfVar));
    }

    @Override // defpackage.cepf
    public final eiju d(ezlz ezlzVar) {
        return eiju.g(g().e(ezlzVar));
    }

    @Override // defpackage.cepf
    public final eiju e(ezjl ezjlVar) {
        return eiju.g(g().f(ezjlVar));
    }

    @Override // defpackage.cepf
    public final void f(ezkl ezklVar, fcsf fcsfVar) {
        ecem.b();
        ((eywd) ((eywd) ((eywd) ceqb.b(this.a, true)).n(esoc.a, h())).m(new fcrz(this.c.e()))).b(ezklVar, fcsfVar);
    }

    final eywc g() {
        return (eywc) ((eywc) ((eywc) ceqb.b(this.b, false)).n(esoc.a, h())).m(new fcrz(this.c.e()));
    }
}
