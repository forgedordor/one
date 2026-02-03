package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvww extends fcyz implements fdap {
    int a;
    final /* synthetic */ fdap b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvww(fdap fdapVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = fdapVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdap fdapVar = this.b;
            this.a = 1;
            if (fdapVar.invoke(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new bvww(this.b, (fcxy) obj).b(fctx.a);
    }
}
