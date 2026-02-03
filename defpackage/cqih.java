package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqih extends fcyz implements fdat {
    int a;
    final /* synthetic */ cqik b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqih(cqik cqikVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cqikVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cqih) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cqik cqikVar = this.b;
            cqia cqiaVar = cqia.b;
            this.a = 1;
            if (cqikVar.f.fO(cqiaVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cqih(this.b, fcxyVar);
    }
}
