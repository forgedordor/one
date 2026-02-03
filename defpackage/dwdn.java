package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwdn implements eora {
    final /* synthetic */ dwje a;
    final /* synthetic */ dwgb b;
    final /* synthetic */ dwpx c;
    final /* synthetic */ dwdo d;

    public dwdn(dwdo dwdoVar, dwje dwjeVar, dwgb dwgbVar, dwpx dwpxVar) {
        this.a = dwjeVar;
        this.b = dwgbVar;
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
