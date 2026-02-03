package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhk {
    public final dhk a;
    public final String b;
    public final hox c;
    public final iac d;
    public final iac e;
    public long f;
    private final dhz g;
    private final hox h;
    private final hox i;
    private final hox j;
    private final hrk k;
    private final hrk l;

    public dhk(dhz dhzVar, dhk dhkVar, String str) {
        this.g = dhzVar;
        this.a = dhkVar;
        this.b = str;
        Object objE = e();
        hsi hsiVar = hsi.a;
        this.h = new hpl(objE, hsiVar);
        this.i = new hpl(new dhf(e(), e()), hsiVar);
        this.k = new hpj(0L);
        this.l = new hpj(Long.MIN_VALUE);
        this.c = new hpl(false, hsiVar);
        this.d = new iac();
        this.e = new iac();
        this.j = new hpl(false, hsiVar);
        fdae fdaeVar = new fdae() { // from class: dha
            @Override // defpackage.fdae
            public final Object invoke() {
                return Long.valueOf(this.a.a());
            }
        };
        hxn hxnVar = hrp.a;
        new hnt(fdaeVar, null);
    }

    private final void w(dhe dheVar) {
        this.i.b(dheVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a() {
        iac iacVar = this.d;
        int iA = iacVar.a();
        long jMax = 0;
        for (int i = 0; i < iA; i++) {
            jMax = Math.max(jMax, ((dhg) iacVar.get(i)).c());
        }
        iac iacVar2 = this.e;
        int iA2 = iacVar2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            jMax = Math.max(jMax, ((dhk) iacVar2.get(i2)).a());
        }
        return jMax;
    }

    public final long b() {
        dhk dhkVar = this.a;
        return dhkVar != null ? dhkVar.b() : this.k.c();
    }

    public final long c() {
        return this.l.c();
    }

    public final dhe d() {
        return (dhe) this.i.a();
    }

    public final Object e() {
        return this.g.a();
    }

    public final Object f() {
        return this.h.a();
    }

    public final void g(final Object obj, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1493585151);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? hmlVarC.D(obj) : hmlVarC.F(obj)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(this) ? 16 : 32;
        }
        if (!hmlVarC.J((i2 & 19) != 18, i2 & 1)) {
            hmlVarC.s();
        } else if (t()) {
            hmlVarC.v(467781377);
            ((hmw) hmlVarC).ab();
        } else {
            hmlVarC.v(466120769);
            q(obj);
            int i4 = i2 & 112;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i4 == 32 || objS == hmk.a) {
                fdae fdaeVar = new fdae() { // from class: dgx
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        dhk dhkVar = this.a;
                        boolean z = true;
                        if (fdbq.f(dhkVar.f(), dhkVar.e()) && !dhkVar.s() && !((Boolean) dhkVar.c.a()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                };
                hxn hxnVar = hrp.a;
                hnt hntVar = new hnt(fdaeVar, null);
                hmwVar.af(hntVar);
                objS = hntVar;
            }
            if (((Boolean) ((hsf) objS).a()).booleanValue()) {
                hmlVarC.v(466528884);
                Object objS2 = hmwVar.S();
                Object obj2 = hmk.a;
                if (objS2 == obj2) {
                    objS2 = hob.a(fcyi.a, hmlVarC);
                    hmwVar.af(objS2);
                }
                final fdjx fdjxVar = (fdjx) objS2;
                boolean zF = hmlVarC.F(fdjxVar) | (i4 == 32);
                Object objS3 = hmwVar.S();
                if (zF || objS3 == obj2) {
                    objS3 = new fdap() { // from class: dgy
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj3) {
                            fdil.d(fdjxVar, null, fdjz.d, new dhi(this, null), 1);
                            return new dhj();
                        }
                    };
                    hmwVar.af(objS3);
                }
                hob.b(fdjxVar, this, (fdap) objS3, hmlVarC);
                hmwVar.ab();
            } else {
                hmlVarC.v(467771457);
                hmwVar.ab();
            }
            hmwVar.ab();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dgz
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    dhk dhkVar = this.a;
                    int i5 = i;
                    dhkVar.g(obj, (hml) obj3, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(long j, boolean z) {
        if (c() == Long.MIN_VALUE) {
            j(j);
        } else {
            dhz dhzVar = this.g;
            if (!((Boolean) dhzVar.a.a()).booleanValue()) {
                dhzVar.e(true);
            }
        }
        p(false);
        iac iacVar = this.d;
        int iA = iacVar.a();
        boolean zF = true;
        for (int i = 0; i < iA; i++) {
            dhg dhgVar = (dhg) iacVar.get(i);
            if (!dhgVar.l()) {
                long jA = z ? dhgVar.e().a() : j;
                dhgVar.i(dhgVar.e().c(jA));
                dhgVar.a = dhgVar.e().b(jA);
                if (ddv.a(dhgVar.e(), jA)) {
                    dhgVar.g(true);
                }
            }
            zF &= dhgVar.l();
        }
        iac iacVar2 = this.e;
        int iA2 = iacVar2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            dhk dhkVar = (dhk) iacVar2.get(i2);
            if (!fdbq.f(dhkVar.f(), dhkVar.e())) {
                dhkVar.h(j, z);
            }
            zF &= fdbq.f(dhkVar.f(), dhkVar.e());
        }
        if (zF) {
            i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        n(Long.MIN_VALUE);
        dhz dhzVar = this.g;
        if (dhzVar instanceof dfw) {
            ((dfw) dhzVar).c(f());
        }
        l(0L);
        dhzVar.e(false);
        iac iacVar = this.e;
        int iA = iacVar.a();
        for (int i = 0; i < iA; i++) {
            ((dhk) iacVar.get(i)).i();
        }
    }

    public final void j(long j) {
        n(j);
        this.g.e(true);
    }

    public final void k(dhg dhgVar) {
        this.d.remove(dhgVar);
    }

    public final void l(long j) {
        if (this.a == null) {
            this.k.h(j);
        }
    }

    public final void m(boolean z) {
        this.j.b(Boolean.valueOf(z));
    }

    public final void n(long j) {
        this.l.h(j);
    }

    public final void o(Object obj) {
        this.h.b(obj);
    }

    public final void p(boolean z) {
        this.c.b(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q(Object obj) {
        if (fdbq.f(f(), obj)) {
            return;
        }
        w(new dhf(f(), obj));
        if (!fdbq.f(e(), f())) {
            this.g.c(f());
        }
        o(obj);
        if (!s()) {
            p(true);
        }
        iac iacVar = this.d;
        int iA = iacVar.a();
        for (int i = 0; i < iA; i++) {
            ((dhg) iacVar.get(i)).h(-2.0f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean r() {
        iac iacVar = this.d;
        int iA = iacVar.a();
        for (int i = 0; i < iA; i++) {
        }
        iac iacVar2 = this.e;
        int iA2 = iacVar2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            if (((dhk) iacVar2.get(i2)).r()) {
                return true;
            }
        }
        return false;
    }

    public final boolean s() {
        return c() != Long.MIN_VALUE;
    }

    public final boolean t() {
        return ((Boolean) this.j.a()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        iac iacVar = this.d;
        int iA = iacVar.a();
        String str = "Transition animation values: ";
        for (int i = 0; i < iA; i++) {
            str = str + ((dhg) iacVar.get(i)) + ", ";
        }
        return str;
    }

    public final void u(dhg dhgVar) {
        this.d.add(dhgVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(Object obj, Object obj2) {
        n(Long.MIN_VALUE);
        dhz dhzVar = this.g;
        dhzVar.e(false);
        if (!t() || !fdbq.f(e(), obj) || !fdbq.f(f(), obj2)) {
            if (!fdbq.f(e(), obj) && (dhzVar instanceof dfw)) {
                ((dfw) dhzVar).c(obj);
            }
            o(obj2);
            m(true);
            w(new dhf(obj, obj2));
        }
        iac iacVar = this.e;
        int iA = iacVar.a();
        for (int i = 0; i < iA; i++) {
            dhk dhkVar = (dhk) iacVar.get(i);
            dhkVar.getClass();
            if (dhkVar.t()) {
                dhkVar.v(dhkVar.e(), dhkVar.f());
            }
        }
        iac iacVar2 = this.d;
        int iA2 = iacVar2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            ((dhg) iacVar2.get(i2)).m();
        }
        this.f = 0L;
    }
}
