package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aibt extends fcyz implements fdat {
    final /* synthetic */ aice a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aibt(fcxy fcxyVar, aice aiceVar) {
        super(2, fcxyVar);
        this.a = aiceVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aibt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return new Integer(this.a.b.am());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aibt aibtVar = new aibt(fcxyVar, this.a);
        aibtVar.b = obj;
        return aibtVar;
    }
}
