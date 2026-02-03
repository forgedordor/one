package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bypl {
    public static final cqce a = cqce.g("BugleCms", "CmsDeletedMessagesBufferPersister");
    public final cogw b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcyh f;
    public final fdjx g;
    public final int h;
    public final Duration i;
    public final byeq j;

    public bypl(byeq byeqVar, cogw cogwVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcyh fcyhVar, fdjx fdjxVar) {
        byeqVar.getClass();
        cogwVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcyhVar.getClass();
        fdjxVar.getClass();
        this.j = byeqVar;
        this.b = cogwVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcyhVar;
        this.g = fdjxVar;
        Object objE = cpyl.D.e();
        objE.getClass();
        this.h = ((Number) objE).intValue();
        Object objE2 = cpyl.E.e();
        objE2.getClass();
        Duration durationOfDays = Duration.ofDays(((Number) objE2).longValue());
        durationOfDays.getClass();
        this.i = durationOfDays;
    }

    public final void a(String str, bmsp bmspVar) {
        str.getClass();
        bmspVar.getClass();
        auvw.k(this.g, null, null, new bypi(this, str, bmspVar, null), 3);
    }
}
