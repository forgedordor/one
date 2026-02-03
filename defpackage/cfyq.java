package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfyq extends cayv {
    public static final cqce a = cqce.g("BugleJobs", "DittoRetryHandler");
    public final eygg b;
    public final fcsu c;
    private final fcsu d;
    private final eygg e;
    private final fcsu f;
    private final fcsu g;
    private final eygg h;
    private final eosc i;
    private final eosc j;
    private final fcsu k;
    private final cfeh l;

    public cfyq(cfeh cfehVar, eygg eyggVar, fcsu fcsuVar, eygg eyggVar2, fcsu fcsuVar2, fcsu fcsuVar3, eygg eyggVar3, fcsu fcsuVar4, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar5) {
        this.l = cfehVar;
        this.b = eyggVar;
        this.d = fcsuVar;
        this.e = eyggVar2;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = eyggVar3;
        this.c = fcsuVar4;
        this.i = eoscVar;
        this.j = eoscVar2;
        this.k = fcsuVar5;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        pzh pzhVar = new pzh();
        pzhVar.c(2);
        ((caxk) caxzVarL).a = pzhVar.a();
        caxzVarL.c(5);
        caxzVarL.f(pza.a);
        caxzVarL.g(TimeUnit.SECONDS.toMillis(((Integer) bvfd.f.e()).intValue()));
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("DittoRetryHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cfyv.a.getParserForType();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.cayv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ defpackage.eiju j(final defpackage.cayy r7, defpackage.evuh r8) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfyq.j(cayy, evuh):eiju");
    }

    public final void k(cayy cayyVar) {
        ((ains) this.c.b()).e("Bugle.Ditto.RetryHandler.Failure.Count", ((caxm) cayyVar.a()).c);
    }
}
