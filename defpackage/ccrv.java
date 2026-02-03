package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccrv extends fcyz implements fdap {
    final /* synthetic */ chfg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccrv(chfg chfgVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.a = chfgVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return evqs.A(((chff) this.a).a);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ccrv(this.a, (fcxy) obj).b(fctx.a);
    }
}
