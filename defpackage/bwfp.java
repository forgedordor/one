package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwfp extends fcyz implements fdat {
    final /* synthetic */ bwfq a;
    final /* synthetic */ int b;
    final /* synthetic */ bwvi c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwfp(fcxy fcxyVar, bwfq bwfqVar, int i, bwvi bwviVar) {
        super(2, fcxyVar);
        this.a = bwfqVar;
        this.b = i;
        this.c = bwviVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwfp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.e(this.b, this.c);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bwfp bwfpVar = new bwfp(fcxyVar, this.a, this.b, this.c);
        bwfpVar.d = obj;
        return bwfpVar;
    }
}
