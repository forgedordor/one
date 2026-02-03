package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csjf extends fcyz implements fdat {
    final /* synthetic */ csjh a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csjf(csjh csjhVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = csjhVar;
        this.b = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csjf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((ains) this.a.a.b()).e("Bugle.Spam.CrossCountry.Banner.Counts", this.b);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csjf(this.a, this.b, fcxyVar);
    }
}
