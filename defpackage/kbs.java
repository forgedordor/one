package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kbs extends fcyz implements fdat {
    int a;
    final /* synthetic */ kax b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbs(kax kaxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = kaxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((kbs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            kax kaxVar = this.b;
            this.a = 1;
            if (kaxVar.b(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new kbs(this.b, fcxyVar);
    }
}
