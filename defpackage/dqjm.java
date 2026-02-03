package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqjm extends fcyz implements fdat {
    final /* synthetic */ dqjo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqjm(dqjo dqjoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dqjoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqjm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        System.loadLibrary(this.a.c.a);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dqjm(this.a, fcxyVar);
    }
}
