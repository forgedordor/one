package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cspd extends fcyz implements fdat {
    final /* synthetic */ cspf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cspd(cspf cspfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cspfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cspd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return new Integer(baxe.a(this.a.g));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cspd(this.a, fcxyVar);
    }
}
