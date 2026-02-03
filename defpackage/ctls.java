package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctls extends fcyz implements fdat {
    final /* synthetic */ ctlz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctls(ctlz ctlzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ctlzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctls) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ctlz ctlzVar = this.a;
        if (ctlzVar != null && ctlzVar.a()) {
            ctlzVar.a.invoke();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ctls(this.a, fcxyVar);
    }
}
