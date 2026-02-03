package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cweh extends fcyz implements fdat {
    int a;
    final /* synthetic */ cwek b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cweh(cwek cwekVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cwekVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cweh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            this.b.e.c.f(cwen.d);
            this.a = 1;
            if (fdkj.c(150L, this) == fcylVar) {
                return fcylVar;
            }
        }
        cwdc cwdcVar = this.b.e;
        cwdcVar.c.f(cwen.e);
        cwdcVar.b.f(null);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cweh(this.b, fcxyVar);
    }
}
