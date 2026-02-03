package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hhb extends fcyz implements fdat {
    final /* synthetic */ hcj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhb(hcj hcjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = hcjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hhb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.b();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new hhb(this.a, fcxyVar);
    }
}
