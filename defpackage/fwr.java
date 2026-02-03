package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fwr extends fcyz implements fdat {
    int a;
    final /* synthetic */ fws b;
    final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwr(fws fwsVar, float f, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fwsVar;
        this.c = f;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fwr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fws fwsVar = this.b;
            fwq fwqVar = new fwq(fwsVar, this.c, null);
            this.a = 1;
            if (fwsVar.c.a(dod.a, fwqVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new fwr(this.b, this.c, fcxyVar);
    }
}
