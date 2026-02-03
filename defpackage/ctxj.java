package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctxj extends fcyz implements fdap {
    int a;
    final /* synthetic */ ctxr b;
    final /* synthetic */ alqm c;
    final /* synthetic */ aoer d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctxj(ctxr ctxrVar, alqm alqmVar, aoer aoerVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = ctxrVar;
        this.c = alqmVar;
        this.d = aoerVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ctxr ctxrVar = this.b;
            alqm alqmVar = this.c;
            aoer aoerVar = this.d;
            this.a = 1;
            ((dzuc) ctxrVar.d.b()).e(ajfo.n);
            Object objA = fdin.a(eicg.a(ctxrVar.b), new ctxk(null, ctxrVar, alqmVar, aoerVar, new ctxl(ctxrVar)), this);
            if (objA != obj2) {
                objA = fctx.a;
            }
            if (objA == obj2) {
                return obj2;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ctxj(this.b, this.c, this.d, (fcxy) obj).b(fctx.a);
    }
}
