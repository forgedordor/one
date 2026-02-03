package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yfz extends fcyz implements fdat {
    final /* synthetic */ oxm a;
    final /* synthetic */ yen b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yfz(oxm oxmVar, yen yenVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = oxmVar;
        this.b = yenVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yfz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        if (this.a.b().e) {
            this.b.r.invoke();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new yfz(this.a, this.b, fcxyVar);
    }
}
