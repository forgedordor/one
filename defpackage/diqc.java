package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class diqc extends fcyz implements fdat {
    final /* synthetic */ boolean a;
    final /* synthetic */ fdae b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public diqc(boolean z, fdae fdaeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = z;
        this.b = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((diqc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        if (this.a) {
            this.b.invoke();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new diqc(this.a, this.b, fcxyVar);
    }
}
