package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbmf extends fcyz implements fdat {
    int a;
    final /* synthetic */ cbmh b;
    final /* synthetic */ String c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbmf(fcxy fcxyVar, cbmh cbmhVar, String str) {
        super(2, fcxyVar);
        this.b = cbmhVar;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbmf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cbmh cbmhVar = this.b;
            String str = this.c;
            this.a = 1;
            if (cbmhVar.b(str, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbmf cbmfVar = new cbmf(fcxyVar, this.b, this.c);
        cbmfVar.d = obj;
        return cbmfVar;
    }
}
