package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class autc extends fcyz implements fdat {
    int a;
    final /* synthetic */ auti b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public autc(auti autiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = autiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((autc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            auti autiVar = this.b;
            this.a = 1;
            if (autiVar.f(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new autc(this.b, fcxyVar);
    }
}
