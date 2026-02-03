package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ztl extends fcyz implements fdap {
    final /* synthetic */ ztv a;
    final /* synthetic */ alff b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ztl(ztv ztvVar, alff alffVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.a = ztvVar;
        this.b = alffVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        alff alffVar = this.b;
        alfa alfaVar = (alfa) alffVar;
        Long lD = alfaVar.d();
        Long lC = alfaVar.c();
        String strF = alfaVar.f();
        String strG = alfaVar.g();
        String strE = alfaVar.e();
        ztv ztvVar = this.a;
        boolean zA = ztvVar.I.a(lD, lC, strF, strG, strE, alffVar);
        if (zA) {
            ztvVar.m(4);
        }
        return Boolean.valueOf(zA);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ztl(this.a, this.b, (fcxy) obj).b(fctx.a);
    }
}
