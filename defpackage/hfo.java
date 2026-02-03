package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hfo extends fcyz implements fdau {
    /* synthetic */ float a;
    final /* synthetic */ hgn b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hfo(hgn hgnVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.b = hgnVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        hfo hfoVar = new hfo(this.b, (fcxy) obj3);
        hfoVar.c = (fdjx) obj;
        hfoVar.a = fFloatValue;
        return hfoVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [fdjx, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        fdil.d(this.c, null, null, new hfn(this.b, this.a, null), 3);
        return fctx.a;
    }
}
