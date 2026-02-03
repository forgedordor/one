package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gto extends fcyz implements fdau {
    final /* synthetic */ gtx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gto(gtx gtxVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.a = gtxVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).floatValue();
        return new gto(this.a, (fcxy) obj3).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.f.invoke();
        return fctx.a;
    }
}
