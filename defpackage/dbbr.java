package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbbr extends fcyz implements fdat {
    int a;
    final /* synthetic */ dbbp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbbr(dbbp dbbpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dbbpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbbr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dbbp dbbpVar = this.b;
            this.a = 1;
            if (dbbpVar.d.c(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dbbr(this.b, fcxyVar);
    }
}
