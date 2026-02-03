package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uha extends fcyz implements fdat {
    final /* synthetic */ uhc a;
    final /* synthetic */ ekgb b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uha(fcxy fcxyVar, uhc uhcVar, ekgb ekgbVar) {
        super(2, fcxyVar);
        this.a = uhcVar;
        this.b = ekgbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((uha) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.b.getClass();
        return new ugd();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        uha uhaVar = new uha(fcxyVar, this.a, this.b);
        uhaVar.c = obj;
        return uhaVar;
    }
}
