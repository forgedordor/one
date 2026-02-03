package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayat extends fcyz implements fdat {
    final /* synthetic */ aybe a;
    final /* synthetic */ cmtz b;
    final /* synthetic */ bvdk c;
    final /* synthetic */ int d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayat(fcxy fcxyVar, aybe aybeVar, cmtz cmtzVar, bvdk bvdkVar, int i) {
        super(2, fcxyVar);
        this.a = aybeVar;
        this.b = cmtzVar;
        this.c = bvdkVar;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayat) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return ((baqy) this.a.i.b()).b(this.b, this.c, this.d);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ayat ayatVar = new ayat(fcxyVar, this.a, this.b, this.c, this.d);
        ayatVar.e = obj;
        return ayatVar;
    }
}
