package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crft extends fcyz implements fdap {
    final /* synthetic */ crgd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crft(crgd crgdVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.a = crgdVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return ((ejly) this.a.d.b()).e();
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new crft(this.a, (fcxy) obj).b(fctx.a);
    }
}
