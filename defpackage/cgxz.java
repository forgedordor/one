package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgxz extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ cgxw c;
    final /* synthetic */ cgxu d;
    final /* synthetic */ chaw e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgxz(cgxw cgxwVar, cgxu cgxuVar, chaw chawVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = cgxwVar;
        this.d = cgxuVar;
        this.e = chawVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cgxz cgxzVar = new cgxz(this.c, this.d, this.e, (fcxy) obj3);
        cgxzVar.f = (cgyd) obj;
        cgxzVar.b = (cayy) obj2;
        return cgxzVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        cayy cayyVar;
        cgzx cgzxVarA;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        if (i == 0) {
            fctl.b(obj);
            cgyd cgydVar = (cgyd) this.f;
            cayyVar = (cayy) this.b;
            String str = cgydVar.b;
            str.getClass();
            cgzxVarA = cgzw.a(str);
            ekrw ekrwVarH = cgya.a.h();
            ekrwVarH.X(eksq.a, "BuglePipeline");
            ekrd ekrdVar = (ekrd) ekrwVarH;
            ekrz ekrzVar = cgxx.a;
            ekrdVar.X(cgxx.a, cgzxVarA);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/pipeline/PipelineWorkHandler$1", "invokeSuspend", 45, "PipelineWorkHandler.kt")).q("Running pipeline work handler");
            cgxw cgxwVar = this.c;
            this.f = cayyVar;
            this.b = cgzxVarA;
            this.a = 1;
            obj = cgxwVar.d(cgzxVarA, this);
            if (obj != fcylVar) {
            }
            return fcylVar;
        }
        if (i != 1) {
            cbcw cbcwVar = (cbcw) this.f;
            fctl.b(obj);
            return cbcwVar;
        }
        cgzxVarA = (cgzx) this.b;
        cayyVar = (cayy) this.f;
        fctl.b(obj);
        int i2 = ((cgyg) obj).c - 1;
        cbcw cbcwVarK = i2 != 0 ? i2 != 1 ? cbcw.k() : cbcw.m() : cbcw.i();
        ekrg ekrgVar = cgya.a;
        ekrw ekrwVarH2 = ekrgVar.h();
        ekrz ekrzVar2 = eksq.a;
        ekrwVarH2.X(ekrzVar2, "BuglePipeline");
        ekrd ekrdVar2 = (ekrd) ekrwVarH2;
        ekrz ekrzVar3 = cgxx.a;
        ekrz ekrzVar4 = cgxx.a;
        ekrdVar2.X(ekrzVar4, cgzxVarA);
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/pipeline/PipelineWorkHandler$1", "invokeSuspend", 52, "PipelineWorkHandler.kt")).t("Finished pipeline work handler. WorkQueueResult: %s ", cbcwVarK);
        if (((caxq) cbcwVarK).b && !cayyVar.c()) {
            ekrw ekrwVarH3 = ekrgVar.h();
            ekrwVarH3.X(ekrzVar2, "BuglePipeline");
            ekrd ekrdVar3 = (ekrd) ekrwVarH3;
            ekrdVar3.X(ekrzVar4, cgzxVarA);
            ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/pipeline/PipelineWorkHandler$1", "invokeSuspend", 58, "PipelineWorkHandler.kt")).q("Pipeline returned a retryable result, but no more PWQ retries are allowed. Deleting work item.");
            this.d.c(null, 10);
            chaw chawVar = this.e;
            this.f = cbcwVarK;
            this.b = null;
            this.a = 2;
            if (chawVar.a(cgzxVarA, this) == fcylVar) {
                return fcylVar;
            }
        }
        return cbcwVarK;
    }
}
