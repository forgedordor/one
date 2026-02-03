package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crit extends fcyz implements fdat {
    final /* synthetic */ biwj a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crit(fcxy fcxyVar, biwj biwjVar) {
        super(2, fcxyVar);
        this.a = biwjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crit) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(this.a.b().h() > 0);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        crit critVar = new crit(fcxyVar, this.a);
        critVar.b = obj;
        return critVar;
    }
}
