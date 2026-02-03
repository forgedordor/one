package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oru extends fcyz implements fdau {
    final /* synthetic */ orv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oru(orv orvVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.a = orvVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return new oru(this.a, (fcxy) obj3).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return fctx.a;
    }
}
