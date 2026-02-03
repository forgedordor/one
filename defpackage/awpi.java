package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awpi extends fcyz implements fdat {
    int a;
    final /* synthetic */ awpo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awpi(awpo awpoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = awpoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awpi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            awpo awpoVar = this.b;
            this.a = 1;
            obj = awpoVar.h(false, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awpi(this.b, fcxyVar);
    }
}
