package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjai implements asre {
    public final cjbf a;
    private final cizt b;
    private final cjaq c;
    private final cjna d;
    private final cjay e;
    private final cjnd f;
    private final cixu g;
    private final cjmh h;
    private final cjam i;
    private final cjmx j;
    private final cixx k;
    private final cjml l;
    private final cjbe m;
    private final cjnj n;
    private final cjbb o;
    private final cjng p;
    private final eosc q;

    public cjai(cizt ciztVar, cjaq cjaqVar, cjna cjnaVar, cjay cjayVar, cjnd cjndVar, cixu cixuVar, cjmh cjmhVar, cixx cixxVar, cjml cjmlVar, cjam cjamVar, cjmx cjmxVar, cjbe cjbeVar, cjnj cjnjVar, cjbb cjbbVar, cjng cjngVar, cjbf cjbfVar, eosc eoscVar) {
        this.b = ciztVar;
        this.c = cjaqVar;
        this.d = cjnaVar;
        this.e = cjayVar;
        this.f = cjndVar;
        this.g = cixuVar;
        this.h = cjmhVar;
        this.i = cjamVar;
        this.j = cjmxVar;
        this.k = cixxVar;
        this.l = cjmlVar;
        this.m = cjbeVar;
        this.n = cjnjVar;
        this.o = cjbbVar;
        this.p = cjngVar;
        this.a = cjbfVar;
        this.q = eoscVar;
    }

    @Override // defpackage.asre
    public final eiju a(aubd aubdVar) {
        return this.b.a() ? this.h.a.a(aubdVar) : this.g.a.a(aubdVar);
    }

    @Override // defpackage.asre
    public final eiju b(auce auceVar) {
        return this.b.a() ? this.l.a.a(auceVar) : this.k.a.a(auceVar);
    }

    @Override // defpackage.asre
    public final eiju c(augi augiVar) {
        return this.b.a() ? this.j.a.a(augiVar) : this.i.a.a(augiVar);
    }

    @Override // defpackage.asre
    public final eiju d(augo augoVar) {
        return this.b.a() ? this.d.a.a(augoVar) : this.c.a.a(augoVar);
    }

    @Override // defpackage.asre
    public final eiju e(final augw augwVar) {
        final basd basdVarA = basd.a(augwVar.h);
        if (((Boolean) ((cczi) cjbf.b.get()).e()).booleanValue()) {
            cjbf cjbfVar = this.a;
            auib auibVar = augwVar.n;
            if (auibVar == null) {
                auibVar = auib.a;
            }
            cjbfVar.c(auibVar, basdVarA, 5, 15);
        }
        return (this.b.a() ? this.f.a.a(augwVar) : this.e.a.a(augwVar)).h(new ejvr() { // from class: cjah
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                augz augzVar = (augz) obj;
                if (((Boolean) ((cczi) cjbf.b.get()).e()).booleanValue()) {
                    augw augwVar2 = augwVar;
                    cjai cjaiVar = this.a;
                    auib auibVar2 = augwVar2.n;
                    if (auibVar2 == null) {
                        auibVar2 = auib.a;
                    }
                    cjaiVar.a.c(auibVar2, basdVarA, 6, 15);
                }
                return augzVar;
            }
        }, this.q);
    }

    @Override // defpackage.asre
    public final eiju f(auii auiiVar) {
        return this.b.a() ? this.p.a.a(auiiVar) : this.o.a.a(auiiVar);
    }

    @Override // defpackage.asre
    public final eiju g(auip auipVar) {
        return this.b.a() ? this.n.a.a(auipVar) : this.m.a.a(auipVar);
    }
}
