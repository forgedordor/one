package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dixl extends fcyz implements fdat {
    final /* synthetic */ dsd a;
    final /* synthetic */ dixn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dixl(dsd dsdVar, dixn dixnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dsdVar;
        this.b = dixnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dixl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        if (this.a.f() == diwy.b) {
            this.b.b.invoke();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dixl(this.a, this.b, fcxyVar);
    }
}
