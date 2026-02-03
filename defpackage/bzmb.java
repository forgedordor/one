package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzmb extends fcyz implements fdat {
    int a;
    final /* synthetic */ bzmf b;
    final /* synthetic */ byiv c;
    final /* synthetic */ Throwable d;
    final /* synthetic */ int e;
    final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzmb(bzmf bzmfVar, byiv byivVar, Throwable th, int i, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bzmfVar;
        this.c = byivVar;
        this.d = th;
        this.e = i;
        this.f = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzmb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            bzmf bzmfVar = this.b;
            byiv byivVar = this.c;
            Throwable th = this.d;
            int i2 = this.e;
            String str = this.f;
            this.a = 1;
            if (fdin.a(eicg.a(bzmfVar.b), new bzma(null, bzmfVar, th, byivVar, i2, str), this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bzmb(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
