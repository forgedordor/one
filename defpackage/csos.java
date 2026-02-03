package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csos extends fcyz implements fdat {
    final /* synthetic */ cspf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csos(cspf cspfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cspfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csos) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cspf cspfVar = this.a;
        return ((bakt) cspfVar.d.b()).r(cspfVar.g);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csos(this.a, fcxyVar);
    }
}
