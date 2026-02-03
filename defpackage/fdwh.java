package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdwh extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpl b;
    final /* synthetic */ fdxf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdwh(fdpl fdplVar, fdxf fdxfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdplVar;
        this.c = fdxfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fdwh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpl fdplVar = this.b;
            fdxf fdxfVar = this.c;
            this.a = 1;
            if (fdplVar.a(fdxfVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new fdwh(this.b, this.c, fcxyVar);
    }
}
