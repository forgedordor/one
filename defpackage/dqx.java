package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dqx implements fdau {
    final /* synthetic */ fdap a;
    final /* synthetic */ dqb b;

    public dqx(fdap fdapVar, dqb dqbVar) {
        this.a = fdapVar;
        this.b = dqbVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        int i = iIntValue & 17;
        if (hmlVar.J(i != 16, iIntValue & 1)) {
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                objF = new dqj();
                hmlVar.y(objF);
            }
            fdap fdapVar = this.a;
            dqb dqbVar = this.b;
            dqj dqjVar = (dqj) objF;
            dqjVar.a.clear();
            fdapVar.invoke(dqjVar);
            dqjVar.a(dqbVar, hmlVar, 0);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
