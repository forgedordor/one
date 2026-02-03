package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yde extends fcyz implements fdat {
    int a;
    final /* synthetic */ yek b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yde(yek yekVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = yekVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yde) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            yek yekVar = this.b;
            this.a = 1;
            if (yekVar.h.b(0, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new yde(this.b, fcxyVar);
    }
}
