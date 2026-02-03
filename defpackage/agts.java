package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agts extends fcyz implements fdat {
    final /* synthetic */ agua a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agts(agua aguaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = aguaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agts) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.f.h(agei.a);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new agts(this.a, fcxyVar);
    }
}
