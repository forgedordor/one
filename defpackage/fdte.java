package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdte extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fdpl c;
    final /* synthetic */ fdue d;
    final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdte(fdpl fdplVar, fdue fdueVar, Object obj, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = fdplVar;
        this.d = fdueVar;
        this.e = obj;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fdte) c((fdup) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            int iOrdinal = ((fdup) this.b).ordinal();
            if (iOrdinal == 0) {
                fdpl fdplVar = this.c;
                fdue fdueVar = this.d;
                this.a = 1;
                if (fdplVar.a(fdueVar, this) == fcylVar) {
                    return fcylVar;
                }
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new fctg();
                }
                Object obj2 = this.e;
                if (obj2 == fdun.a) {
                    this.d.e();
                } else {
                    this.d.h(obj2);
                }
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        fdte fdteVar = new fdte(this.c, this.d, this.e, fcxyVar);
        fdteVar.b = obj;
        return fdteVar;
    }
}
