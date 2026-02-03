package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgzm extends fcyz implements fdau {
    int a;
    final /* synthetic */ cgxw b;
    final /* synthetic */ cgxi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgzm(cgxi cgxiVar, cgxw cgxwVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = cgxiVar;
        this.b = cgxwVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return new cgzm(this.c, this.b, (fcxy) obj3).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                ekrw ekrwVarE = cgzn.a.e();
                ekrwVarE.X(eksq.a, "BuglePipeline");
                ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/pipeline/SmartRetriesPipelineWorkHandler$1", "invokeSuspend", 40, "SmartRetriesPipelineWorkHandler.kt")).q("Running smart retries pipeline work handler.");
                Object objB = this.c.b.b();
                objB.getClass();
                Duration durationC = evxd.c((evrj) objB);
                long j = fdhi.j(fdhk.g(durationC.getSeconds(), fdhl.d), fdhk.f(durationC.getNano(), fdhl.a));
                cgzl cgzlVar = new cgzl(this.b, null);
                this.a = 1;
                if (fdna.b(j, cgzlVar, this) == fcylVar) {
                    return fcylVar;
                }
            }
            ekrw ekrwVarH = cgzn.a.h();
            ekrwVarH.X(eksq.a, "BuglePipeline");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/pipeline/SmartRetriesPipelineWorkHandler$1", "invokeSuspend", 50, "SmartRetriesPipelineWorkHandler.kt")).q("Finished pipeline work handler.");
            return cbcw.i();
        } catch (fdmx e) {
            ekrw ekrwVarJ = cgzn.a.j();
            ekrwVarJ.X(eksq.a, "BuglePipeline");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/pipeline/SmartRetriesPipelineWorkHandler$1", "invokeSuspend", 47, "SmartRetriesPipelineWorkHandler.kt")).q("Some pipelines didn't finish in time while starting processing from PWQ.");
            return cbcw.m();
        }
    }
}
