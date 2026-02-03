package defpackage;

import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajjx {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/analytics/statistics/cobalt/ActiveUserActionCobaltLogger");
    public final Optional b;
    public final dcdc c;
    private final ajke d;
    private final fcsu e;
    private final eosc f;
    private final eosc g;
    private final eosc h;

    public ajjx(Optional optional, dcdc dcdcVar, ajke ajkeVar, fcsu fcsuVar, eosc eoscVar, eosc eoscVar2, eosc eoscVar3) {
        this.b = optional;
        this.c = dcdcVar;
        this.d = ajkeVar;
        this.e = fcsuVar;
        this.f = eoscVar;
        this.g = eoscVar2;
        this.h = eoscVar3;
    }

    private final void d(eieu eieuVar, eosc eoscVar) {
        eiju eijuVarF = eijx.f(new Runnable() { // from class: ajju
            @Override // java.lang.Runnable
            public final void run() {
                ajjx ajjxVar = this.a;
                ((ajkc) ajjxVar.b.get()).a(1L, ajjxVar.a());
            }
        }, eoscVar);
        eieuVar.b(eijuVarF);
        auvh.h(eijuVarF);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ekgb a() {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajjx.a():ekgb");
    }

    public final void b() {
        eieu eieuVarK;
        if (((Boolean) ((cczi) ajkb.c.get()).e()).booleanValue()) {
            if (this.b.isPresent()) {
                eieuVarK = eiiy.k("ActiveUserActionCobaltLogger::logCobaltActiveUserMetric");
                try {
                    if (((Boolean) ((cczi) ajkb.f.get()).e()).booleanValue()) {
                        d(eieuVarK, this.g);
                    } else if (((Boolean) ((cczi) ajkb.e.get()).e()).booleanValue()) {
                        d(eieuVarK, this.h);
                    } else {
                        d(eieuVarK, this.f);
                    }
                    eieuVarK.close();
                } catch (Throwable th) {
                    throw th;
                }
            }
            eieuVarK = eiiy.k("ActiveUserActionCobaltLogger::logCobaltActiveUserMetricGmsCore");
            try {
                eiju eijuVarG = eijx.g(new Callable() { // from class: ajjv
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ajjx ajjxVar = this.a;
                        defn defnVarA = ajjxVar.c.a(3, eonc.j(ajjxVar.a()));
                        defnVarA.t(new defe() { // from class: ajjw
                            @Override // defpackage.defe
                            public final void d(Exception exc) {
                                if ((exc instanceof dcff) && ((dcff) exc).a() == 17) {
                                    return;
                                }
                                ((ekrd) ((ekrd) ((ekrd) ajjx.a.j()).g(exc)).h("com/google/android/apps/messaging/shared/analytics/statistics/cobalt/ActiveUserActionCobaltLogger", "logUnexpectedFailure", 149, "ActiveUserActionCobaltLogger.java")).t("Failed to log to Cobalt in GMS Core: %s", exc);
                            }
                        });
                        return defnVarA;
                    }
                }, this.h);
                eieuVarK.b(eijuVarG);
                auvh.h(eijuVarG);
                eieuVarK.close();
            } finally {
                try {
                    eieuVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        }
    }

    public final void c(boolean z) {
        if (z) {
            b();
        }
    }
}
