package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipu extends inz {
    public final hox a;
    public final hox b;
    public final ipo c;
    public int d;
    public final hri e;
    private float f;
    private ijf g;

    public ipu() {
        this(new ioe());
    }

    @Override // defpackage.inz
    public final long a() {
        return ((ihz) this.a.a()).a;
    }

    @Override // defpackage.inz
    protected final void b(imz imzVar) {
        ipo ipoVar = this.c;
        ijf ijfVarD = this.g;
        if (ijfVarD == null) {
            ijfVarD = ipoVar.d();
        }
        if (((Boolean) this.b.a()).booleanValue() && imzVar.q() == kji.b) {
            long jA = imzVar.a();
            imt imtVarT = imzVar.t();
            long jA2 = imtVarT.a();
            imtVarT.b().l();
            try {
                imtVarT.c.d(-1.0f, 1.0f, jA);
                ipoVar.g(imzVar, this.f, ijfVarD);
            } finally {
                imtVarT.b().j();
                imtVarT.h(jA2);
            }
        } else {
            ipoVar.g(imzVar, this.f, ijfVarD);
        }
        this.d = g();
    }

    @Override // defpackage.inz
    protected final void c(float f) {
        this.f = f;
    }

    @Override // defpackage.inz
    protected final void d(ijf ijfVar) {
        this.g = ijfVar;
    }

    public final int g() {
        return this.e.c();
    }

    public ipu(ioe ioeVar) {
        ihz ihzVar = new ihz(0L);
        hsi hsiVar = hsi.a;
        this.a = new hpl(ihzVar, hsiVar);
        this.b = new hpl(false, hsiVar);
        ipo ipoVar = new ipo(ioeVar);
        ipoVar.d = new ipt(this);
        this.c = ipoVar;
        this.e = new hph(0);
        this.f = 1.0f;
        this.d = -1;
    }
}
