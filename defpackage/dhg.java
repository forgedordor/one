package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhg implements hsf {
    public deh a;
    final /* synthetic */ dhk b;
    private final hox c;
    private final dgi d;
    private final hox e;
    private final hox f;
    private final hox g;
    private boolean h;
    private final hox i;
    private boolean j;
    private final dew k;
    private final dib l;
    private final hrg m;
    private final hrk n;

    public dhg(dhk dhkVar, Object obj, deh dehVar, dib dibVar) {
        this.b = dhkVar;
        this.l = dibVar;
        hsi hsiVar = hsi.a;
        this.c = new hpl(obj, hsiVar);
        Object objInvoke = null;
        dgi dgiVarB = dea.b(0.0f, 0.0f, null, 7);
        this.d = dgiVarB;
        this.e = new hpl(dgiVarB, hsiVar);
        this.f = new hpl(new dgw(d(), dibVar, obj, n(), dehVar), hsiVar);
        this.g = new hpl(true, hsiVar);
        this.m = new hpf(-1.0f);
        this.i = new hpl(obj, hsiVar);
        this.a = dehVar;
        this.n = new hpj(e().a());
        Float f = (Float) djm.b.get(dibVar);
        if (f != null) {
            float fFloatValue = f.floatValue();
            deh dehVar2 = (deh) dibVar.a.invoke(obj);
            int iB = dehVar2.b();
            for (int i = 0; i < iB; i++) {
                dehVar2.e(i, fFloatValue);
            }
            objInvoke = this.l.b.invoke(dehVar2);
        }
        this.k = dea.b(0.0f, 0.0f, objInvoke, 3);
    }

    private final Object n() {
        return this.c.a();
    }

    private final void o(dgw dgwVar) {
        this.f.b(dgwVar);
    }

    private final void p(dew dewVar) {
        this.e.b(dewVar);
    }

    private final void q(Object obj) {
        this.c.b(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void r(Object obj, boolean z) {
        if (fdbq.f(null, n())) {
            o(new dgw(this.k, this.l, obj, obj, this.a.c()));
            this.h = true;
            f(e().a());
            return;
        }
        ddz ddzVarD = (!z || this.j || (d() instanceof dgi)) ? d() : this.k;
        dhk dhkVar = this.b;
        long jMax = 0;
        o(new dgw(dhkVar.b() > 0 ? new dgj(ddzVarD, dhkVar.b()) : ddzVarD, this.l, obj, n(), this.a));
        f(e().a());
        this.h = false;
        dhkVar.p(true);
        if (dhkVar.t()) {
            iac iacVar = dhkVar.d;
            int iA = iacVar.a();
            for (int i = 0; i < iA; i++) {
                dhg dhgVar = (dhg) iacVar.get(i);
                jMax = Math.max(jMax, dhgVar.c());
                long j = dhkVar.f;
                dhgVar.m();
            }
            dhkVar.p(false);
        }
    }

    @Override // defpackage.hsf
    public final Object a() {
        return this.i.a();
    }

    public final float b() {
        return this.m.c();
    }

    public final long c() {
        return this.n.c();
    }

    public final dew d() {
        return (dew) this.e.a();
    }

    public final dgw e() {
        return (dgw) this.f.a();
    }

    public final void f(long j) {
        this.n.h(j);
    }

    public final void g(boolean z) {
        this.g.b(Boolean.valueOf(z));
    }

    public final void h(float f) {
        this.m.h(f);
    }

    public final void i(Object obj) {
        this.i.b(obj);
    }

    public final void j(Object obj, Object obj2, dew dewVar) {
        q(obj2);
        p(dewVar);
        if (fdbq.f(e().b, obj) && fdbq.f(e().a, obj2)) {
            return;
        }
        r(obj, false);
    }

    public final void k(Object obj, dew dewVar) {
        if (this.h && fdbq.f(obj, null)) {
            return;
        }
        if (fdbq.f(n(), obj) && b() == -1.0f) {
            return;
        }
        q(obj);
        p(dewVar);
        r(b() == -3.0f ? obj : a(), !l());
        g(b() == -3.0f);
        if (b() >= 0.0f) {
            i(e().c((long) (e().a() * b())));
        } else if (b() == -3.0f) {
            i(obj);
        }
        this.h = false;
        h(-1.0f);
    }

    public final boolean l() {
        return ((Boolean) this.g.a()).booleanValue();
    }

    public final void m() {
        if (b() == -1.0f) {
            this.j = true;
            if (fdbq.f(e().a, e().b)) {
                i(e().a);
            } else {
                i(e().c(0L));
                this.a = e().b(0L);
            }
        }
    }

    public final String toString() {
        return "current value: " + a() + ", target: " + n() + ", spec: " + d();
    }
}
