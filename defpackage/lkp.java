package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lkp extends fcyz implements fdau {
    int a;
    final /* synthetic */ llo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkp(llo lloVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.b = lloVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return new lkp(this.b, (fcxy) obj3).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            llo lloVar = this.b;
            this.a = 1;
            if (lloVar.e(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
