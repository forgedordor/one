package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csqh extends fcyz implements fdat {
    final /* synthetic */ csqi a;
    final /* synthetic */ cspo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csqh(csqi csqiVar, cspo cspoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = csqiVar;
        this.b = cspoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csqh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.b(this.b);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csqh(this.a, this.b, fcxyVar);
    }
}
