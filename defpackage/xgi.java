package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xgi extends fcyz implements fdap {
    int a;
    final /* synthetic */ xgm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xgi(xgm xgmVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = xgmVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            xgm xgmVar = this.b;
            this.a = 1;
            if (xgmVar.d.c(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new xgi(this.b, (fcxy) obj).b(fctx.a);
    }
}
