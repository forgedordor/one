package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wkf extends fcyz implements fdat {
    final /* synthetic */ String a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkf(fcxy fcxyVar, String str) {
        super(2, fcxyVar);
        this.a = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wkf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return le.d(this.a);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wkf wkfVar = new wkf(fcxyVar, this.a);
        wkfVar.b = obj;
        return wkfVar;
    }
}
