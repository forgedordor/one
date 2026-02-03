package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cggf extends cayl {
    public final fcsu a;
    private final cqpz b;
    private final eosc c;

    public cggf(fcsu fcsuVar, cqpz cqpzVar, eosc eoscVar) {
        this.a = fcsuVar;
        this.b = cqpzVar;
        this.c = eoscVar;
    }

    @Override // defpackage.cayl, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxk caxkVar = (caxk) caxzVarL;
        caxkVar.c = elgm.REFRESH_STATEFUL_NOTIFICATIONS_ACTION;
        caxzVarL.d(20);
        caxkVar.d = Duration.ofMillis(this.b.c("bugle_refresh_notification_backoff_duration_in_millis", 100L));
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("RefreshMessageFailureNotificationHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return caxy.a.getParserForType();
    }

    @Override // defpackage.cayl
    public final eiju j(cayy cayyVar, ekgb ekgbVar) {
        return eijx.f(new Runnable() { // from class: cggd
            @Override // java.lang.Runnable
            public final void run() {
                ((cgbn) this.a.a.b()).B();
            }
        }, this.c).h(new ejvr() { // from class: cgge
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return cbcw.i();
            }
        }, eoqg.a);
    }
}
