package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccvm extends fcyz implements fdap {
    int a;
    final /* synthetic */ ccvp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccvm(ccvp ccvpVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = ccvpVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        awzf awzfVar = (awzf) this.b.b.b();
        this.a = 1;
        Object objF = awzfVar.f(this);
        return objF == fcylVar ? fcylVar : objF;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ccvm(this.b, (fcxy) obj).b(fctx.a);
    }
}
