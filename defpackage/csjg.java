package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csjg extends fcyz implements fdat {
    final /* synthetic */ csjh a;
    final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csjg(csjh csjhVar, boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = csjhVar;
        this.b = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csjg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((ains) this.a.a.b()).e("Bugle.Spam.CrossCountry.Settings.Counts", true != this.b ? 2 : 1);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csjg(this.a, this.b, fcxyVar);
    }
}
