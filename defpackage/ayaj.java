package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayaj extends fcyz implements fdat {
    final /* synthetic */ aybe a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayaj(fcxy fcxyVar, aybe aybeVar) {
        super(2, fcxyVar);
        this.a = aybeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayaj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        axtl.d(2, this.a.c);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ayaj ayajVar = new ayaj(fcxyVar, this.a);
        ayajVar.b = obj;
        return ayajVar;
    }
}
