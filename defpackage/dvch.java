package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvch extends fcyz implements fdat {
    int a;
    final /* synthetic */ dvcp b;
    final /* synthetic */ dvbn c;
    final /* synthetic */ agz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvch(dvcp dvcpVar, dvbn dvbnVar, agz agzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dvcpVar;
        this.c = dvbnVar;
        this.d = agzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvch) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dvcp dvcpVar = this.b;
            dvbn dvbnVar = this.c;
            agz agzVar = this.d;
            this.a = 1;
            if (dvcpVar.c(dvbnVar, agzVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dvch(this.b, this.c, this.d, fcxyVar);
    }
}
