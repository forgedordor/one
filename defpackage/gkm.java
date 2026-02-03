package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gkm extends fcyz implements fdat {
    int a;
    final /* synthetic */ gkn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkm(gkn gknVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = gknVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gkm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            gkn gknVar = this.b;
            this.a = 1;
            if (gknVar.e(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new gkm(this.b, fcxyVar);
    }
}
