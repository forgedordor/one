package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uwj extends fcyz implements fdat {
    int a;
    final /* synthetic */ uwl b;
    final /* synthetic */ fdos c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwj(fdos fdosVar, uwl uwlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = fdosVar;
        this.b = uwlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((uwj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdos fdosVar = this.c;
            Boolean boolValueOf = Boolean.valueOf(((crqx) this.b.h.b()).j());
            this.a = 1;
            if (fdosVar.a(boolValueOf, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new uwj(this.c, this.b, fcxyVar);
    }
}
