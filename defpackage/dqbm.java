package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqbm extends fcyz implements fdat {
    int a;
    final /* synthetic */ dqbn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqbm(dqbn dqbnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dqbnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqbm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        do {
            ekrg ekrgVar = dqbn.a;
            dqbn dqbnVar = this.b;
            if (!((Boolean) dqbnVar.c.c()).booleanValue()) {
                return fctx.a;
            }
            dqbnVar.d.f(eoob.d(dqbnVar.e().getCurrentPosition()));
            this.a = 1;
        } while (fdkj.c(100L, this) != fcylVar);
        return fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dqbm(this.b, fcxyVar);
    }
}
