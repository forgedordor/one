package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctph implements ctpa {
    public final fdjx a;
    public final ctxf b;
    public final cudy c;
    public final cuec d;
    private final fduf e;

    public ctph(fdjx fdjxVar, ctxf ctxfVar, cudy cudyVar, cuec cuecVar) {
        fdjxVar.getClass();
        ctxfVar.getClass();
        cudyVar.getClass();
        cuecVar.getClass();
        this.a = fdjxVar;
        this.b = ctxfVar;
        this.c = cudyVar;
        this.d = cuecVar;
        this.e = fdvf.a(null);
    }

    @Override // defpackage.ctpa
    public final ctpi a() {
        ctpd ctpdVar = new ctpd(this.e, this);
        fdus fdusVarA = fdur.a(0L, 3);
        int i = ekgb.d;
        return new ctpi(fdtg.b(ctpdVar, this.a, fdusVarA, ekoe.a), new ctpe(this));
    }

    @Override // defpackage.ctpa
    public final void b(ajou ajouVar) {
        if (((ekoe) ajouVar.b()).c <= 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.e.f(ajouVar);
    }

    public final void c() {
        this.e.f(null);
    }
}
