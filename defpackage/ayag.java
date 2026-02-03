package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayag extends fcyz implements fdat {
    final /* synthetic */ aybe a;
    final /* synthetic */ int b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayag(fcxy fcxyVar, aybe aybeVar, int i) {
        super(2, fcxyVar);
        this.a = aybeVar;
        this.b = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayag) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(this.a.l.c(this.b));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ayag ayagVar = new ayag(fcxyVar, this.a, this.b);
        ayagVar.c = obj;
        return ayagVar;
    }
}
