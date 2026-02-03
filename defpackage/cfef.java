package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfef {

    @Deprecated
    public final ezol a;
    public final epby b;
    public String c = null;
    public String d = null;
    public evqs e;
    public boolean f;
    public boolean g;
    public evqs h;
    public ezjh i;
    public long j;
    public int k;
    public boolean l;
    public String m;
    public ezol n;
    public evqs o;
    public Optional p;
    private final cfei q;

    public cfef(cfei cfeiVar, cdio cdioVar, bvks bvksVar, epby epbyVar) {
        evqs evqsVar = evqs.b;
        this.e = evqsVar;
        this.f = false;
        this.g = false;
        this.h = evqsVar;
        this.i = null;
        this.j = 0L;
        this.k = 1;
        this.l = false;
        this.o = evqsVar;
        this.p = Optional.empty();
        this.q = cfeiVar;
        ezol ezolVar = bvksVar.a;
        this.a = ezolVar;
        if (cdioVar.a()) {
            if (bvksVar.c.isPresent()) {
                this.o = (evqs) bvksVar.c.get();
            } else {
                felm felmVarB = felm.b(ezolVar.b);
                if ((felmVarB == null ? felm.UNRECOGNIZED : felmVarB) == felm.EMAIL) {
                    cqca.f("BugleNetwork", "GDitto push is missing registration id. Type=".concat(String.valueOf(epbyVar.name())));
                }
            }
            this.p = Optional.of(bvksVar);
        }
        this.b = epbyVar;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [eygg, java.lang.Object] */
    public final cfeg a() {
        cfei cfeiVar = this.q;
        cehg cehgVar = (cehg) cfeiVar.a.b();
        cehgVar.getClass();
        cogw cogwVar = (cogw) cfeiVar.b.b();
        cogwVar.getClass();
        crqv crqvVar = (crqv) cfeiVar.c.b();
        crqvVar.getClass();
        bvkr bvkrVar = (bvkr) cfeiVar.d.b();
        bvkrVar.getClass();
        cema cemaVar = (cema) cfeiVar.e.b();
        cemaVar.getClass();
        eosc eoscVar = (eosc) cfeiVar.f.b();
        eoscVar.getClass();
        ?? B = cfeiVar.h.b();
        B.getClass();
        ains ainsVar = (ains) cfeiVar.i.b();
        ainsVar.getClass();
        cfgj cfgjVar = (cfgj) cfeiVar.j.b();
        cfgjVar.getClass();
        cfgc cfgcVar = (cfgc) cfeiVar.l.b();
        cfgcVar.getClass();
        cepf cepfVar = (cepf) cfeiVar.m.b();
        cepfVar.getClass();
        cepf cepfVar2 = (cepf) cfeiVar.n.b();
        cepfVar2.getClass();
        bviy bviyVar = (bviy) cfeiVar.p.b();
        bviyVar.getClass();
        fcsu fcsuVar = cfeiVar.o;
        return new cfeg(cehgVar, cogwVar, crqvVar, bvkrVar, cemaVar, eoscVar, cfeiVar.g, B, ainsVar, cfgjVar, cfeiVar.k, cfgcVar, cepfVar, cepfVar2, fcsuVar, bviyVar, this);
    }

    public final void b(evuh evuhVar) {
        this.e = evuhVar.toByteString();
    }

    public final void c() {
        this.g = true;
    }

    @Deprecated
    public cfef(cfei cfeiVar, cdio cdioVar, ezol ezolVar, Optional optional, epby epbyVar) {
        evqs evqsVar = evqs.b;
        this.e = evqsVar;
        this.f = false;
        this.g = false;
        this.h = evqsVar;
        this.i = null;
        this.j = 0L;
        this.k = 1;
        this.l = false;
        this.o = evqsVar;
        this.p = Optional.empty();
        this.q = cfeiVar;
        this.a = ezolVar;
        if (cdioVar.a()) {
            if (optional.isPresent()) {
                this.o = (evqs) optional.get();
            } else {
                felm felmVarB = felm.b(ezolVar.b);
                if ((felmVarB == null ? felm.UNRECOGNIZED : felmVarB) == felm.EMAIL) {
                    cqca.f("BugleNetwork", "GDitto push is missing registration id. Type=".concat(String.valueOf(epbyVar.name())));
                }
            }
        }
        this.b = epbyVar;
    }
}
