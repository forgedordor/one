package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dfk extends fcyz implements fdat {
    /* synthetic */ float a;

    public dfk(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dfk) c(Float.valueOf(((Number) obj).floatValue()), (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(this.a > 0.0f);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dfk dfkVar = new dfk(fcxyVar);
        dfkVar.a = ((Number) obj).floatValue();
        return dfkVar;
    }
}
