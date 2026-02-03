package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbf extends fdbr implements fdap {
    final /* synthetic */ iyl a;
    final /* synthetic */ dbg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbf(iyl iylVar, dbg dbgVar) {
        super(1);
        this.a = iylVar;
        this.b = dbgVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ivy ivyVarB;
        dbl dblVar;
        iyk iykVar = (iyk) obj;
        iykVar.s(this.a, 0, 0, 0.0f);
        dbg dbgVar = this.b;
        dbl dblVarM = dbgVar.m();
        dbm dbmVar = dbgVar.b;
        dblVarM.i();
        if (dblVarM.j() && dbmVar.c().e() && (ivyVarB = iykVar.b()) != null) {
            long jD = kjh.d(ivyVarB.g());
            long jDY = dbmVar.d().b.dY(dbmVar.d().b.d(), ivyVarB);
            dcf dcfVar = dbmVar.d().b;
            long jI = dbmVar.d().b.d().i(ivyVarB, 0L, (6 & 4) != 0);
            ddj ddjVarA = dblVarM.a();
            if (ddjVarA == null) {
                ddjVarA = new ddj(jD, ihs.d(jDY, jI), jI);
            }
            if (ihs.h(ddjVarA.d(), jI) && ihz.f(ddjVarA.c(), jD) && !dblVarM.e) {
                dblVar = dblVarM;
            } else {
                ddjVarA.a.b(new ihz(jD));
                ddjVarA.c.b(new ihs(jI));
                if (dblVarM.e) {
                    dblVar = dblVarM;
                    ddjVarA.b.b(new ihs(ihs.d(ihs.d(jDY, jI), ihs.d(ddjVarA.a(), ddjVarA.b()))));
                } else {
                    dblVar = dblVarM;
                }
                if (dblVar.b() == null) {
                    ihu ihuVarC = dblVar.c();
                    if (ihuVarC == null) {
                        ihuVarC = ihv.a(jDY, jD);
                    }
                    dblVar.e(ihuVarC);
                }
            }
            ddjVarA.d.b(new ihs(ihs.d(jDY, jI)));
            if (dblVar.j()) {
                dblVar.g(ddjVarA);
            }
            dblVar.e = false;
        }
        return fctx.a;
    }
}
