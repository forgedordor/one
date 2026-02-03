package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class out extends fcyz implements fdap {
    final /* synthetic */ fdae a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public out(fdae fdaeVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.a = fdaeVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.invoke();
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new out(this.a, (fcxy) obj).b(fctx.a);
    }
}
