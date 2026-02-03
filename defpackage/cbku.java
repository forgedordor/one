package defpackage;

import android.app.Notification;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbku {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkerExecutor");
    public final fcsu b;
    public final fcsu c;
    private final caxe d;

    public cbku(caxe caxeVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.d = caxeVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    final void a(eiju eijuVar, caya cayaVar, caze cazeVar) {
        caxe caxeVar = this.d;
        caxeVar.c(eijuVar);
        int iOrdinal = cazeVar.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalStateException("Unexpected value: ".concat(String.valueOf(String.valueOf(cazeVar))));
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            try {
                caxeVar.a(eijuVar);
                return;
            } catch (IllegalStateException unused) {
                ekrw ekrwVarH = a.h();
                ekrwVarH.X(eksq.a, "BugleWorkQueue");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkerExecutor", "keepAlive", 94, "WorkQueueWorkerExecutor.java")).q("unable to attach service -- probably in background already");
                if (cazeVar != caze.BACKGROUND_SERVICE_FALLBACK_TO_FOREGROUND_SERVICE) {
                    return;
                }
            }
        } else if (iOrdinal != 3) {
            return;
        }
        Notification notification = ((caxl) cayaVar).g;
        if (notification == null) {
            throw new IllegalStateException("cannot be null");
        }
        this.d.e(eijuVar, notification, 13);
    }
}
