package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqcz extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdat b;
    final /* synthetic */ dqdh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqcz(fdat fdatVar, dqdh dqdhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdatVar;
        this.c = dqdhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqcz) c((dlzk) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdat fdatVar = this.b;
            dqdh dqdhVar = this.c;
            this.a = 1;
            if (fdatVar.a(dqdhVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dqcz(this.b, this.c, fcxyVar);
    }
}
