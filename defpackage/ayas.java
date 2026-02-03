package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayas extends fcyz implements fdat {
    final /* synthetic */ baqv a;
    final /* synthetic */ aybe b;
    final /* synthetic */ brvp c;
    final /* synthetic */ boolean d;
    final /* synthetic */ cmtz e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayas(fcxy fcxyVar, baqv baqvVar, aybe aybeVar, brvp brvpVar, boolean z, cmtz cmtzVar) {
        super(2, fcxyVar);
        this.a = baqvVar;
        this.b = aybeVar;
        this.c = brvpVar;
        this.d = z;
        this.e = cmtzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayas) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        baqv baqvVar = this.a;
        if (baqvVar != null) {
            return ((baxe) this.b.g.b()).G(baqvVar.a(), this.c.f, this.d, false);
        }
        baxe baxeVar = (baxe) this.b.g.b();
        cmtz cmtzVar = this.e;
        cmtzVar.getClass();
        brvp brvpVar = this.c;
        return baxeVar.F(cmtzVar.a, brvpVar.f, this.d, cmtzVar.b.size() > 1);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ayas ayasVar = new ayas(fcxyVar, this.a, this.b, this.c, this.d, this.e);
        ayasVar.f = obj;
        return ayasVar;
    }
}
