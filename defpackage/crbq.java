package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crbq extends fcyz implements fdat {
    final /* synthetic */ crcm a;
    final /* synthetic */ String b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crbq(fcxy fcxyVar, crcm crcmVar, String str) {
        super(2, fcxyVar);
        this.a = crcmVar;
        this.b = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crbq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return ((crif) this.a.b.b()).d(this.b).orElse(null);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        crbq crbqVar = new crbq(fcxyVar, this.a, this.b);
        crbqVar.c = obj;
        return crbqVar;
    }
}
