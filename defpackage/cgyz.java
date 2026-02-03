package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgyz extends fcyz implements fdap {
    final /* synthetic */ cgzi a;
    final /* synthetic */ cgxy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgyz(cgzi cgziVar, cgxy cgxyVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.a = cgziVar;
        this.b = cgxyVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.e.a(this.b);
        ekrw ekrwVarH = cgzi.a.h();
        ekrwVarH.X(eksq.a, "BuglePipeline");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/pipeline/PwqBackedPipelineManager$queue$3", "invokeSuspend", 239, "PwqBackedPipelineManager.kt")).q("Successfully queued pipeline work item");
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cgyz(this.a, this.b, (fcxy) obj).b(fctx.a);
    }
}
