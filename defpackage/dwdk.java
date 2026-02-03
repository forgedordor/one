package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwdk implements eora {
    final /* synthetic */ dwje a;
    final /* synthetic */ dwfp b;
    final /* synthetic */ dwpx c;
    final /* synthetic */ dwdo d;

    public dwdk(dwdo dwdoVar, dwje dwjeVar, dwfp dwfpVar, dwpx dwpxVar) {
        this.a = dwjeVar;
        this.b = dwfpVar;
        this.c = dwpxVar;
        this.d = dwdoVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(19);
        dwje dwjeVar = this.a;
        dwhpVarR.n(dwjeVar.c().f());
        dwhpVarR.o(dwjeVar.d().E());
        dwhpVarR.p(this.b.a);
        dwhpVarR.d(this.c);
        this.d.c.b(dwhpVarR.a());
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(20);
        dwje dwjeVar = this.a;
        dwhpVarR.n(dwjeVar.c().f());
        dwhpVarR.o(dwjeVar.d().E());
        dwhpVarR.p(this.b.a);
        dwhpVarR.d(this.c);
        this.d.c.b(dwhpVarR.a());
    }
}
