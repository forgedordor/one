package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djsb extends fcyz implements fdat {
    final /* synthetic */ boolean a;
    final /* synthetic */ hox b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djsb(boolean z, hox hoxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = z;
        this.b = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djsb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.b.b(Boolean.valueOf(this.a));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new djsb(this.a, this.b, fcxyVar);
    }
}
