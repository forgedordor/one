package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gem extends fcyz implements fdat {
    int a;
    final /* synthetic */ igr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gem(igr igrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = igrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gem) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            this.b.a(new igq());
        } else if (this.b != null) {
            this.a = 1;
            if (fdkj.c(300L, this) == fcylVar) {
                return fcylVar;
            }
            this.b.a(new igq());
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new gem(this.b, fcxyVar);
    }
}
