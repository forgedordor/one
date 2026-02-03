package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayap extends fcyz implements fdat {
    final /* synthetic */ aybe a;
    final /* synthetic */ cmtz b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayap(fcxy fcxyVar, aybe aybeVar, cmtz cmtzVar, String str, int i) {
        super(2, fcxyVar);
        this.a = aybeVar;
        this.b = cmtzVar;
        this.c = str;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayap) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cmtz cmtzVar = this.b;
        cmtzVar.getClass();
        new Integer(this.d);
        aybe aybeVar = this.a;
        alqm alqmVar = (alqm) fdct.b(aybeVar.k.ah(cmtzVar, this.c));
        if (alqmVar != null) {
            return alqmVar;
        }
        aybe.a.r("Received an MMS without sender address; using unknown sender.");
        return ((alrj) aybeVar.C.b()).f();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ayap ayapVar = new ayap(fcxyVar, this.a, this.b, this.c, this.d);
        ayapVar.e = obj;
        return ayapVar;
    }
}
