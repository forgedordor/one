package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmex extends fcyz implements fdat {
    final /* synthetic */ long a;
    final /* synthetic */ ddp b;
    final /* synthetic */ boolean c;
    final /* synthetic */ sgd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmex(sgd sgdVar, long j, ddp ddpVar, boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = sgdVar;
        this.a = j;
        this.b = ddpVar;
        this.c = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmex) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        float fFloatValue = ((Number) this.b.d()).floatValue();
        if (fFloatValue > 0.96f) {
            fFloatValue = 0.96f;
        }
        boolean z = this.c;
        long j = this.a;
        sge.c(this.d, ijg.f(ije.d(j), ije.c(j), ije.b(j), fFloatValue, ije.f(j)), z);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmex(this.d, this.a, this.b, this.c, fcxyVar);
    }
}
