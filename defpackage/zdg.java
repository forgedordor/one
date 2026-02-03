package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zdg extends fcyz implements fdat {
    final /* synthetic */ zdm a;
    final /* synthetic */ amuy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdg(zdm zdmVar, amuy amuyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = zdmVar;
        this.b = amuyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zdg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.j.invoke(this.b);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zdg(this.a, this.b, fcxyVar);
    }
}
