package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpoj extends fcyz implements fdat {
    final /* synthetic */ boolean a;
    final /* synthetic */ lhb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpoj(boolean z, lhb lhbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = z;
        this.b = lhbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpoj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        if (this.a) {
            this.b.a.e();
        } else {
            this.b.e();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dpoj(this.a, this.b, fcxyVar);
    }
}
