package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fas extends fcyz implements fdat {
    int a;
    final /* synthetic */ isn b;
    final /* synthetic */ fbh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fas(isn isnVar, fbh fbhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = isnVar;
        this.c = fbhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fas) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            isn isnVar = this.b;
            fbh fbhVar = this.c;
            this.a = 1;
            Object objB = dvn.b(isnVar, new fav(fbhVar, null), this);
            if (objB != obj2) {
                objB = fctx.a;
            }
            if (objB == obj2) {
                return obj2;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new fas(this.b, this.c, fcxyVar);
    }
}
