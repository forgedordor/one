package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cihl extends fcyz implements fdat {
    final /* synthetic */ cihr a;
    final /* synthetic */ ekgb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cihl(cihr cihrVar, ekgb ekgbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cihrVar;
        this.b = ekgbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cihl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        bakt baktVar = (bakt) this.a.b.b();
        ekgb ekgbVar = this.b;
        ekgbVar.getClass();
        baktVar.Q(fcva.av(ekgbVar));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cihl(this.a, this.b, fcxyVar);
    }
}
