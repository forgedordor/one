package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayar extends fcyz implements fdat {
    final /* synthetic */ aybe a;
    final /* synthetic */ brvp b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayar(fcxy fcxyVar, aybe aybeVar, brvp brvpVar) {
        super(2, fcxyVar);
        this.a = aybeVar;
        this.b = brvpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayar) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(((cpjp) this.a.A.b()).e(this.b.f));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ayar ayarVar = new ayar(fcxyVar, this.a, this.b);
        ayarVar.c = obj;
        return ayarVar;
    }
}
