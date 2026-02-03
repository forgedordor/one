package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aicw extends fcyz implements fdat {
    final /* synthetic */ aicx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aicw(aicx aicxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = aicxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aicw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        aicx aicxVar = this.a;
        if (((Boolean) aicxVar.a.b()).booleanValue()) {
            aicxVar.b.g("Starting deferred restore from synclet.");
            szv.a();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aicw(this.a, fcxyVar);
    }
}
