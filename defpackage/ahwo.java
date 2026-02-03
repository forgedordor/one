package defpackage;

import androidx.car.app.model.Alert;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahwo {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/restore/analytics/RestoreEventLogger");
    public final fdjx b;
    public final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;

    public ahwo(fcsu fcsuVar, fcsu fcsuVar2, fdjx fdjxVar, fcsu fcsuVar3, fcsu fcsuVar4) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fdjxVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.b = fdjxVar;
        this.f = fcsuVar3;
        this.c = fcsuVar4;
    }

    public static final int b(int i, Duration duration) {
        if (duration.toMillis() == 0) {
            return 0;
        }
        double millis = (i / duration.toMillis()) * 1000.0d;
        return millis < 0.0d ? Alert.DURATION_SHOW_INDEFINITELY : (int) millis;
    }

    public final fcsu a(boolean z) {
        return (z || !((arjc) this.f.b()).a()) ? this.d : this.e;
    }
}
