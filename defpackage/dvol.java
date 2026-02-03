package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvol implements eora {
    final /* synthetic */ dwje a;
    final /* synthetic */ dwpx b;
    final /* synthetic */ dvop c;

    public dvol(dvop dvopVar, dwje dwjeVar, dwpx dwpxVar) {
        this.a = dwjeVar;
        this.b = dwpxVar;
        this.c = dvopVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(206);
        dwje dwjeVar = this.a;
        dwhpVarR.n(dwjeVar.c().f());
        dwhpVarR.o(dwjeVar.d().E());
        dwhpVarR.d(this.b);
        this.c.f.b(dwhpVarR.a());
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(207);
        dwje dwjeVar = this.a;
        dwhpVarR.n(dwjeVar.c().f());
        dwhpVarR.o(dwjeVar.d().E());
        dwhpVarR.d(this.b);
        this.c.f.b(dwhpVarR.a());
    }
}
