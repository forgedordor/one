package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxyf extends fcyz implements fdap {
    int a;
    final /* synthetic */ fdap b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxyf(fdap fdapVar, fcxy fcxyVar) {
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
            obj = fdapVar.invoke(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return String.valueOf(((Number) obj).intValue());
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cxyf(this.b, (fcxy) obj).b(fctx.a);
    }
}
