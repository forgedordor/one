package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnkv extends fcyz implements fdat {
    int a;
    final /* synthetic */ cnkx b;
    final /* synthetic */ eqeq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnkv(cnkx cnkxVar, eqeq eqeqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cnkxVar;
        this.c = eqeqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnkv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cnkx cnkxVar = this.b;
            eqeq eqeqVar = this.c;
            this.a = 1;
            if (cnkxVar.a.i(eqeqVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnkv(this.b, this.c, fcxyVar);
    }
}
