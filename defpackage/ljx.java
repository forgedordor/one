package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ljx extends fcyz implements fdap {
    int a;
    final /* synthetic */ lju b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ljx(lju ljuVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = ljuVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            lju ljuVar = this.b;
            this.a = 1;
            if (ljuVar.a() == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ljx(this.b, (fcxy) obj).b(fctx.a);
    }
}
