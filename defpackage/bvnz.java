package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvnz extends fcyz implements fdap {
    int a;
    final /* synthetic */ bvmw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvnz(bvmw bvmwVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = bvmwVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            bvmw bvmwVar = this.b;
            this.a = 1;
            if (bvmwVar.m(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new bvnz(this.b, (fcxy) obj).b(fctx.a);
    }
}
