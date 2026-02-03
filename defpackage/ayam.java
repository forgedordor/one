package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayam extends fcyz implements fdat {
    final /* synthetic */ aybe a;
    final /* synthetic */ long b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayam(fcxy fcxyVar, aybe aybeVar, long j) {
        super(2, fcxyVar);
        this.a = aybeVar;
        this.b = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayam) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((cmqf) this.a.y.b()).i(this.b);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ayam ayamVar = new ayam(fcxyVar, this.a, this.b);
        ayamVar.c = obj;
        return ayamVar;
    }
}
