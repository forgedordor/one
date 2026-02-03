package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dml extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dml(dmm dmmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dml) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dmm dmmVar = this.b;
            this.a = 1;
            if (jqk.a(dmmVar, null, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dml(this.b, fcxyVar);
    }
}
