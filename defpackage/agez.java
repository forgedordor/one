package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agez extends fcyz implements fdat {
    final /* synthetic */ agfa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agez(agfa agfaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = agfaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agez) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        agfa agfaVar = this.a;
        ((achu) agfaVar.b.b()).g(daiy.a(agfaVar.a));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new agez(this.a, fcxyVar);
    }
}
