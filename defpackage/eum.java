package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eum extends fcyz implements fdat {
    int a;
    final /* synthetic */ euo b;
    final /* synthetic */ fdae c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eum(euo euoVar, fdae fdaeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = euoVar;
        this.c = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eum) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            euo euoVar = this.b;
            fdae fdaeVar = this.c;
            this.a = 1;
            if (jqk.a(euoVar, fdaeVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new eum(this.b, this.c, fcxyVar);
    }
}
