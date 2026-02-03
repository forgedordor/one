package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coic implements cliu {
    public static final cczi a = cdag.a("file_transfer_timeout", 86400000);
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/transfer/FileTransferConnectionMonitor");
    public final fcsu c;
    public final fcsu d;
    private final eosc e;

    public coic(eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.e = eoscVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
    }

    @Override // defpackage.cliu
    public final void d(axcm axcmVar) {
        auvh.h(eijx.f(new Runnable() { // from class: coib
            @Override // java.lang.Runnable
            public final void run() {
                coic coicVar = this.a;
                cokd cokdVar = (cokd) coicVar.c.b();
                final Duration durationOfMillis = Duration.ofMillis(((Long) coic.a.e()).longValue());
                ecem.b();
                ejwl.b(!durationOfMillis.isNegative(), "duration should not be negative");
                final Instant instantF = cokdVar.e.f();
                ekgb ekgbVar = (ekgb) cokdVar.d.c("updateRcsFileTransferToAutoResume", new ejxr() { // from class: cojo
                    @Override // defpackage.ejxr
                    public final Object get() {
                        eksp ekspVar = cokd.a;
                        int i = ekgb.d;
                        ekfw ekfwVar = new ekfw();
                        Instant instant = instantF;
                        Duration duration = durationOfMillis;
                        ekfwVar.j(cokd.d(instant, 110, 104, duration));
                        ekfwVar.j(cokd.d(instant, 12, 7, duration));
                        return ekfwVar.g();
                    }
                });
                ekrw ekrwVarE = coic.b.e();
                ekrwVarE.X(eksq.a, "BugleFileTransfer");
                ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/transfer/FileTransferConnectionMonitor", "scheduleFileTransferResume", 87, "FileTransferConnectionMonitor.java")).t("Resume file transfers %s that paused by satellite", ekgbVar);
                if (ekgbVar.isEmpty()) {
                    return;
                }
                ((aypv) coicVar.d.b()).b(9).w(0L);
            }
        }, this.e));
    }

    @Override // defpackage.cliu
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.cliu
    public final /* synthetic */ void a(axcm axcmVar) {
    }

    @Override // defpackage.cliu
    public final /* synthetic */ void b(axcm axcmVar) {
    }

    @Override // defpackage.cliu
    public final /* synthetic */ void c(axcm axcmVar) {
    }

    @Override // defpackage.cliu
    public final /* synthetic */ void e(axcm axcmVar) {
    }

    @Override // defpackage.cliu
    public final /* synthetic */ void f(axcm axcmVar) {
    }
}
