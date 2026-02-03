package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ezd extends fcyz implements fdat {
    int a;
    final /* synthetic */ isn b;
    final /* synthetic */ fmx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezd(isn isnVar, fmx fmxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = isnVar;
        this.c = fmxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ezd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            isn isnVar = this.b;
            final fmx fmxVar = this.c;
            fdap fdapVar = new fdap() { // from class: ezc
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    fmxVar.s();
                    return fctx.a;
                }
            };
            this.a = 1;
            if (dzm.i(isnVar, null, null, null, fdapVar, this, 7) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ezd(this.b, this.c, fcxyVar);
    }
}
