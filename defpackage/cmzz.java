package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cmzz extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        eqcn eqcnVar = (eqcn) obj;
        aubv aubvVar = (aubv) aubx.a.createBuilder();
        String strC = eqcnVar.c();
        aubvVar.copyOnWrite();
        aubx aubxVar = (aubx) aubvVar.instance;
        aubxVar.b |= 1;
        aubxVar.c = strC;
        String strB = eqcnVar.b();
        aubvVar.copyOnWrite();
        aubx aubxVar2 = (aubx) aubvVar.instance;
        aubxVar2.b |= 2;
        aubxVar2.d = strB;
        aubvVar.a(ekgp.j(eqcnVar.a()));
        return (aubx) aubvVar.build();
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        aubx aubxVar = (aubx) obj;
        eqcg eqcgVar = new eqcg();
        if ((aubxVar.b & 1) != 0) {
            eqcgVar.f(aubxVar.c);
        }
        if ((aubxVar.b & 2) != 0) {
            eqcgVar.e(aubxVar.d);
        }
        c(aubxVar, eqcgVar);
        return eqcgVar.g();
    }

    public abstract void c(aubx aubxVar, eqcm eqcmVar);
}
