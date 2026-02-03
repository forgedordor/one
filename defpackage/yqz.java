package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yqz extends fcyz implements fdat {
    int a;
    final /* synthetic */ yrg b;
    final /* synthetic */ ajmy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqz(yrg yrgVar, ajmy ajmyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = yrgVar;
        this.c = ajmyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yqz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            yrg yrgVar = this.b;
            eiju eijuVarG = yrgVar.d.G(this.c);
            eijuVarG.getClass();
            this.a = 1;
            if (fdxs.c(eijuVarG, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new yqz(this.b, this.c, fcxyVar);
    }
}
