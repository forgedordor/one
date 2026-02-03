package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jps extends fcyz implements fdat {
    int a;
    final /* synthetic */ jpw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jps(jpw jpwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = jpwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jps) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            jpw jpwVar = this.b;
            this.a = 1;
            Object objH = jpwVar.a.s.h(this);
            if (objH != fcylVar) {
                objH = fctx.a;
            }
            if (objH == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new jps(this.b, fcxyVar);
    }
}
