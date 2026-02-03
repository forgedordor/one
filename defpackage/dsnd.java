package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsnd extends fcyz implements fdat {
    final /* synthetic */ dsnf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsnd(dsnf dsnfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dsnfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsnd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        dedi.a(this.a.c);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dsnd(this.a, fcxyVar);
    }
}
