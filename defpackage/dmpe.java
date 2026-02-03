package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmpe extends lxd {
    public final fdjx a;
    public final fdue b;
    public final fduj c;
    public final fdue d;
    public final fduj e;
    public final fdpl f;

    public dmpe(dmop dmopVar, fdjx fdjxVar) {
        dmopVar.getClass();
        fdjxVar.getClass();
        this.a = fdjxVar;
        fdue fdueVarE = fdun.e(0, 0, 0, 7);
        this.b = fdueVarE;
        this.c = new fdug(fdueVarE);
        fdue fdueVarE2 = fdun.e(0, 0, 0, 7);
        this.d = fdueVarE2;
        this.e = new fdug(fdueVarE2);
        this.f = dmopVar.a(fdjxVar, new fdap() { // from class: dmpa
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dojw dojwVar = (dojw) obj;
                dojwVar.getClass();
                dmpe dmpeVar = this.a;
                fdil.d(dmpeVar.a, null, null, new dmpc(dmpeVar, dojwVar, null), 3);
                return fctx.a;
            }
        }, new fdap() { // from class: dmpb
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dmnr dmnrVar = (dmnr) obj;
                dmnrVar.getClass();
                dmpe dmpeVar = this.a;
                fdil.d(dmpeVar.a, null, null, new dmpd(dmpeVar, dmnrVar, null), 3);
                return fctx.a;
            }
        }, 1).a();
    }
}
