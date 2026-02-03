package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chax extends fcyz implements fdat {
    int a;
    final /* synthetic */ chbc b;
    final /* synthetic */ cgzx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chax(chbc chbcVar, cgzx cgzxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = chbcVar;
        this.c = cgzxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chax) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            chbc chbcVar = this.b;
            cgzx cgzxVar = this.c;
            this.a = 1;
            if (chbcVar.a.a(cgzxVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chax(this.b, this.c, fcxyVar);
    }
}
