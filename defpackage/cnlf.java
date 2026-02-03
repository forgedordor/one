package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnlf extends fcyz implements fdat {
    final /* synthetic */ cnlh a;
    final /* synthetic */ aubq b;
    final /* synthetic */ fbrg c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnlf(fcxy fcxyVar, cnlh cnlhVar, aubq aubqVar, fbrg fbrgVar) {
        super(2, fcxyVar);
        this.a = cnlhVar;
        this.b = aubqVar;
        this.c = fbrgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnlf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.d(this.b, this.c);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cnlf cnlfVar = new cnlf(fcxyVar, this.a, this.b, this.c);
        cnlfVar.d = obj;
        return cnlfVar;
    }
}
