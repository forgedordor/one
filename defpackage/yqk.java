package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yqk extends fcyz implements fdat {
    final /* synthetic */ yql a;
    final /* synthetic */ ajlt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqk(yql yqlVar, ajlt ajltVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = yqlVar;
        this.b = ajltVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yqk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.b.R(this.b.b(), 3);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new yqk(this.a, this.b, fcxyVar);
    }
}
