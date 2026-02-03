package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class goe extends fcyz implements fdau {
    /* synthetic */ float a;
    final /* synthetic */ fdap b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public goe(fdap fdapVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.b = fdapVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        goe goeVar = new goe(this.b, (fcxy) obj3);
        goeVar.a = fFloatValue;
        return goeVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.b.invoke(new Float(this.a));
        return fctx.a;
    }
}
