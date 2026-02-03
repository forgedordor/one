package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgzc extends fcyz implements fdat {
    int a;
    final /* synthetic */ cgzi b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgzc(cgzi cgziVar, long j, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cgziVar;
        this.c = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgzc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cgzi cgziVar = this.b;
        cgyc cgycVar = (cgyc) cgyd.a.createBuilder();
        cgycVar.getClass();
        cgyd cgydVarA = cgye.a(cgycVar);
        caxr caxrVar = new caxr();
        Duration durationOfSeconds = Duration.ofSeconds(fdhi.h(this.c), fdhi.d(r3));
        durationOfSeconds.getClass();
        caxrVar.c = durationOfSeconds;
        caxrVar.b = "SMART_RETRIES_DEDUPLICATION_TAG";
        eiju eijuVarB = ((cazj) cgziVar.c.a.b()).a(cbcu.g("smart_retries_pipeline_work_handler", cgydVarA, caxrVar.a())).b();
        eijuVarB.getClass();
        this.a = 1;
        Object objC = fdxs.c(eijuVarB, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cgzc(this.b, this.c, fcxyVar);
    }
}
