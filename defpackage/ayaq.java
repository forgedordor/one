package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayaq extends fcyz implements fdat {
    final /* synthetic */ aybe a;
    final /* synthetic */ cmtz b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayaq(fcxy fcxyVar, aybe aybeVar, cmtz cmtzVar, String str, int i) {
        super(2, fcxyVar);
        this.a = aybeVar;
        this.b = cmtzVar;
        this.c = str;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayaq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cmtz cmtzVar = this.b;
        cmtzVar.getClass();
        new Integer(this.d);
        return fdct.b(this.a.k.ah(cmtzVar, this.c));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ayaq ayaqVar = new ayaq(fcxyVar, this.a, this.b, this.c, this.d);
        ayaqVar.e = obj;
        return ayaqVar;
    }
}
