package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class auys extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ fdpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auys(fdpl fdplVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdplVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((auys) c(obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        ((ekrd) auxt.a.h().h("com/google/android/apps/messaging/shared/concurrent/flow/LogEmissionsKt$logEmissions$withOnEach$1", "invokeSuspend", 20, "LogEmissions.kt")).D("%s emitted: %s", obj3 instanceof auyj ? ((auyj) obj3).a : obj3.toString(), cqcv.b(String.valueOf(obj2)).toString());
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        auys auysVar = new auys(this.b, fcxyVar);
        auysVar.a = obj;
        return auysVar;
    }
}
