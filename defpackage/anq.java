package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class anq implements bjk {
    static final anq a = new anq();

    @Override // defpackage.bjk
    public void a(bni bniVar, bjj bjjVar) {
        bjl bjlVar = (bjl) blz.c(bniVar, bni.q, null);
        bjq bjqVar = blo.b;
        bjo bjoVar = bjl.a;
        int i = new bjj().b().f;
        if (bjlVar != null) {
            bjjVar.c(bjlVar.h);
            bjqVar = bjlVar.e;
            i = bjlVar.f;
        }
        bjjVar.k(bjqVar);
        ale aleVar = new ale(bniVar);
        bjjVar.b = aleVar.a(i);
        bjjVar.d(new aqb(aleVar.b(new anp())));
        bjjVar.f(aleVar.c());
    }
}
