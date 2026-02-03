package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpio extends fcyz implements fdat {
    final /* synthetic */ int a;
    final /* synthetic */ hox b;
    final /* synthetic */ hox c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpio(int i, hox hoxVar, hox hoxVar2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = i;
        this.b = hoxVar;
        this.c = hoxVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpio) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        int i = this.a;
        hox hoxVar = this.b;
        this.c.b(i > dpip.a(hoxVar) ? dpjd.b : dpip.a(hoxVar) > i ? dpjd.c : i <= 0 ? dpjd.d : dpjd.a);
        hoxVar.b(Integer.valueOf(i));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dpio(this.a, this.b, this.c, fcxyVar);
    }
}
