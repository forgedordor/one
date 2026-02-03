package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vac extends fcyz implements fdap {
    final /* synthetic */ ellg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vac(ellg ellgVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.a = ellgVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new vac(this.a, (fcxy) obj).b(fctx.a);
    }
}
