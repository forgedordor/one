package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ztm extends fcyz implements fdap {
    final /* synthetic */ ztv a;
    final /* synthetic */ alff b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ztm(ztv ztvVar, alff alffVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.a = ztvVar;
        this.b = alffVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        bbeb bbebVar = (bbeb) this.b;
        this.a.k(bbebVar.a.o(), bbebVar.c());
        return true;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ztm(this.a, this.b, (fcxy) obj).b(fctx.a);
    }
}
