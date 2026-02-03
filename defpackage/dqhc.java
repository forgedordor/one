package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqhc extends fcyz implements fdat {
    int a;
    final /* synthetic */ dqhd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqhc(dqhd dqhdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dqhdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqhc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dqhd dqhdVar = this.b;
            fdvc fdvcVar = dqhd.f(dqhdVar).f;
            dqhb dqhbVar = new dqhb(dqhdVar);
            this.a = 1;
            if (fdvcVar.a(dqhbVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        throw new fcta();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dqhc(this.b, fcxyVar);
    }
}
