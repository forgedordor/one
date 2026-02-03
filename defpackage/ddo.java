package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddo extends fcyz implements fdap {
    final /* synthetic */ ddp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddo(ddp ddpVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.a = ddpVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.g();
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ddo(this.a, (fcxy) obj).b(fctx.a);
    }
}
