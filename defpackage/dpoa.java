package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpoa implements dpnt {
    private final fdjx a;
    private final fduf b;
    private final fdpl c;

    public dpoa(fdjx fdjxVar) {
        fdjxVar.getClass();
        this.a = fdjxVar;
        fduf fdufVarA = fdvf.a(null);
        this.b = fdufVarA;
        this.c = new dpnz(fdufVarA);
    }

    private final void d(dpnu dpnuVar) {
        fduf fdufVar;
        Object objC;
        dpnu dpnuVar2;
        do {
            fdufVar = this.b;
            objC = fdufVar.c();
            dpnuVar2 = (dpnu) objC;
        } while (!fdufVar.g(objC, dpnuVar));
        if (dpnuVar2 != null) {
            dpnuVar2.b.t(null);
        }
    }

    @Override // defpackage.dpnt
    public final fdpl a() {
        return this.c;
    }

    @Override // defpackage.dpnt
    public final void b(dpmh dpmhVar) {
        fdjx fdjxVar = this.a;
        fdmt fdmtVar = new fdmt((fdlr) fdjxVar.hE().get(fdlr.c));
        d(new dpnu(new dpmg(dpmhVar.b(fdjy.b(fdjxVar.hE().plus(fdmtVar)), new dpnv(this)), dpmhVar.a(), new dpnw(dpmhVar, this)), fdmtVar));
    }

    public final void c() {
        d(null);
    }
}
