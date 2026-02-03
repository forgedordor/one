package defpackage;

import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cawy extends cayv {
    public static final eksp a = eksp.c("BugleNotifications");
    public final fcsu b;
    public final Optional c;
    private final eosd d;

    public cawy(eosd eosdVar, fcsu fcsuVar, Optional optional) {
        this.d = eosdVar;
        this.b = fcsuVar;
        this.c = optional;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        ((caxk) caxzVarL).d = Duration.ofSeconds(1L);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("UpdateUnreadCounterHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return caxa.a.getParserForType();
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final /* synthetic */ boolean h(evuh evuhVar) {
        return k();
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final caxa caxaVar = (caxa) evuhVar;
        return eijx.g(new Callable() { // from class: cawx
            /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
            /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() throws defpackage.fekk {
                /*
                    r7 = this;
                    cawy r0 = r7.a
                    boolean r1 = r0.k()
                    if (r1 == 0) goto L6f
                    fcsu r1 = r0.b
                    java.lang.Object r1 = r1.b()
                    crnp r1 = (defpackage.crnp) r1
                    boolean r1 = r1.d()
                    java.lang.String r2 = "processPendingWorkItemAsync"
                    java.lang.String r3 = "com/google/android/apps/messaging/shared/datamodel/workhandlers/UpdateUnreadCounterHandler"
                    java.lang.String r4 = "UpdateUnreadCounterHandler.java"
                    if (r1 == 0) goto L28
                    caxa r5 = r2
                    int r6 = r5.b
                    r6 = r6 & 1
                    if (r6 == 0) goto L4b
                    boolean r5 = r5.c
                    if (r5 == 0) goto L4b
                L28:
                    j$.util.Optional r5 = r0.c
                    java.lang.Object r5 = r5.get()
                    crah r5 = (defpackage.crah) r5
                    r6 = 0
                    r5.a(r6)
                    eksp r5 = defpackage.cawy.a
                    ekrw r5 = r5.h()
                    eksl r5 = (defpackage.eksl) r5
                    r6 = 80
                    ekrw r5 = r5.h(r3, r2, r6, r4)
                    eksl r5 = (defpackage.eksl) r5
                    java.lang.String r6 = "Cleared shortcut badge counter"
                    r5.q(r6)
                    if (r1 == 0) goto L6f
                L4b:
                    j$.util.Optional r0 = r0.c
                    int r1 = defpackage.bxjj.a()
                    java.lang.Object r0 = r0.get()
                    crah r0 = (defpackage.crah) r0
                    r0.a(r1)
                    eksp r0 = defpackage.cawy.a
                    ekrw r0 = r0.h()
                    eksl r0 = (defpackage.eksl) r0
                    r5 = 86
                    ekrw r0 = r0.h(r3, r2, r5, r4)
                    eksl r0 = (defpackage.eksl) r0
                    java.lang.String r2 = "Set shortcut badge counter to %d"
                    r0.r(r2, r1)
                L6f:
                    cbcw r0 = defpackage.cbcw.i()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cawx.call():java.lang.Object");
            }
        }, this.d);
    }

    public final boolean k() {
        Optional optional = this.c;
        optional.isPresent();
        return fekl.b(((crah) optional.get()).a) && ((crah) optional.get()).b();
    }
}
