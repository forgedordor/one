package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rdb extends inz implements hqt {
    public final rbr a;
    public final rdx b;
    public final hox c;
    public final hox d;
    public final hox e;
    private final hox f;
    private final hox g;
    private final fdjx h;
    private fdlr i;

    public rdb(rbr rbrVar, rdx rdxVar, fdjx fdjxVar) {
        rbrVar.getClass();
        fdjxVar.getClass();
        this.a = rbrVar;
        this.b = rdxVar;
        rea reaVar = rea.a;
        hsi hsiVar = hsi.a;
        this.c = new hpl(reaVar, hsiVar);
        this.d = new hpl(null, hsiVar);
        this.f = new hpl(Float.valueOf(1.0f), hsiVar);
        this.g = new hpl(null, hsiVar);
        this.e = new hpl(null, hsiVar);
        fdjx fdjxVarD = fdjy.d(fdjxVar, new fdmt(fdlw.c(fdjxVar.hE())));
        fdjq fdjqVar = fdkq.a;
        this.h = fdjy.d(fdjxVarD, fdzb.a.j());
    }

    @Override // defpackage.inz
    public final long a() {
        inz inzVarJ = j();
        if (inzVarJ != null) {
            return inzVarJ.a();
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.inz
    protected final void b(imz imzVar) {
        inz inzVarJ = j();
        if (inzVarJ != null) {
            inzVarJ.e(imzVar, imzVar.b(), ((Number) this.f.a()).floatValue(), (ijf) this.g.a());
        }
    }

    @Override // defpackage.inz
    protected final void c(float f) {
        this.f.b(Float.valueOf(f));
    }

    @Override // defpackage.inz
    protected final void d(ijf ijfVar) {
        this.g.b(ijfVar);
    }

    @Override // defpackage.hqt
    public final void g() {
        Object objJ = j();
        hqt hqtVar = objJ instanceof hqt ? (hqt) objJ : null;
        if (hqtVar != null) {
            hqtVar.g();
        }
    }

    @Override // defpackage.hqt
    public final void h() {
        Object objJ = j();
        hqt hqtVar = objJ instanceof hqt ? (hqt) objJ : null;
        if (hqtVar != null) {
            hqtVar.h();
        }
        fdlr fdlrVar = this.i;
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        this.i = null;
    }

    @Override // defpackage.hqt
    public final void i() {
        Object objJ = j();
        hqt hqtVar = objJ instanceof hqt ? (hqt) objJ : null;
        if (hqtVar != null) {
            hqtVar.i();
        }
        if (this.i == null) {
            this.i = fdil.d(this.h, null, null, new rda(this, null), 3);
        }
    }

    public final inz j() {
        return (inz) this.e.a();
    }

    public final rea k() {
        return (rea) this.c.a();
    }
}
