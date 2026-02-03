package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ycr extends fcyz implements fdat {
    int a;
    final /* synthetic */ aafi b;
    final /* synthetic */ yek c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycr(aafi aafiVar, yek yekVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aafiVar;
        this.c = yekVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ycr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            aafi aafiVar = this.b;
            yek yekVar = this.c;
            fdpl fdplVarA = aafiVar.a();
            ycq ycqVar = new ycq(yekVar, null);
            this.a = 1;
            if (fdpy.b(fdplVarA, ycqVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ycr(this.b, this.c, fcxyVar);
    }
}
