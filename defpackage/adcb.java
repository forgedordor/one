package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adcb extends fcyz implements fdat {
    final /* synthetic */ adcg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adcb(adcg adcgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = adcgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adcb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        adcg adcgVar = this.a;
        adcgVar.d.b(new adca(adcgVar));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new adcb(this.a, fcxyVar);
    }
}
