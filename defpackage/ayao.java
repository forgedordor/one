package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayao extends fcyz implements fdat {
    final /* synthetic */ aybe a;
    final /* synthetic */ cmtz b;
    final /* synthetic */ String c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayao(fcxy fcxyVar, aybe aybeVar, cmtz cmtzVar, String str) {
        super(2, fcxyVar);
        this.a = aybeVar;
        this.b = cmtzVar;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayao) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cmtz cmtzVar = this.b;
        cmtzVar.getClass();
        String strA = this.a.k.A(cmtzVar, this.c);
        if (strA != null) {
            return strA;
        }
        aybe.a.r("Received an MMS without sender address; using unknown sender.");
        return "ʼUNKNOWN_SENDER!ʼ";
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ayao ayaoVar = new ayao(fcxyVar, this.a, this.b, this.c);
        ayaoVar.d = obj;
        return ayaoVar;
    }
}
