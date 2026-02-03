package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ext extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ hox c;
    final /* synthetic */ fmx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ext(hox hoxVar, fmx fmxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = hoxVar;
        this.d = fmxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ext) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        hox hoxVar;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            Object obj2 = this.a;
            fctl.b(obj);
            hoxVar = obj2;
        } else {
            fctl.b(obj);
            hox hoxVar2 = this.c;
            fmx fmxVar = this.d;
            this.a = hoxVar2;
            this.b = 1;
            Object objA = exx.a(fmxVar, this);
            if (objA == fcylVar) {
                return fcylVar;
            }
            hoxVar = hoxVar2;
            obj = objA;
        }
        hoxVar.b(obj);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ext(this.c, this.d, fcxyVar);
    }
}
