package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddn extends fcyz implements fdap {
    final /* synthetic */ ddp a;
    final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddn(ddp ddpVar, Object obj, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.a = ddpVar;
        this.b = obj;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ddp ddpVar = this.a;
        ddpVar.g();
        Object obj2 = this.b;
        deb debVar = ddpVar.a;
        Object objB = ddpVar.b(obj2);
        debVar.c(objB);
        ddpVar.i(objB);
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ddn(this.a, this.b, (fcxy) obj).b(fctx.a);
    }
}
