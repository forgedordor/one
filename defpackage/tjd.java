package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tjd extends fcyz implements fdat {
    int a;
    final /* synthetic */ tjf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjd(tjf tjfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = tjfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tjd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            tjf tjfVar = this.b;
            tjc tjcVar = new tjc(tjfVar.c);
            tiz tizVar = new tiz(tjfVar);
            this.a = 1;
            if (tjcVar.a(tizVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new tjd(this.b, fcxyVar);
    }
}
