package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hch extends fcyz implements fdap {
    int a;
    final /* synthetic */ hcj b;
    final /* synthetic */ fdap c;
    final /* synthetic */ dod d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hch(hcj hcjVar, fdap fdapVar, dod dodVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = hcjVar;
        this.c = fdapVar;
        this.d = dodVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                fdap fdapVar = this.c;
                this.a = 1;
                if (fdapVar.invoke(this) == fcylVar) {
                    return fcylVar;
                }
            }
            if (this.d != dod.c) {
                this.b.b();
            }
            return fctx.a;
        } finally {
            if (this.d != dod.c) {
                this.b.b();
            }
        }
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new hch(this.b, this.c, this.d, (fcxy) obj).b(fctx.a);
    }
}
