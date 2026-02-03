package defpackage;

import androidx.car.app.model.Alert;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayss {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/backup/analytics/BackupEventLogger");
    public final fdjx b;
    public final arje c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;

    public ayss(fcsu fcsuVar, fcsu fcsuVar2, fdjx fdjxVar, fcsu fcsuVar3, arje arjeVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fdjxVar.getClass();
        fcsuVar3.getClass();
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.b = fdjxVar;
        this.f = fcsuVar3;
        this.c = arjeVar;
    }

    public static final int b(int i, Duration duration) {
        if (duration.toMillis() == 0) {
            return 0;
        }
        double millis = (i / duration.toMillis()) * 1000.0d;
        return millis < 0.0d ? Alert.DURATION_SHOW_INDEFINITELY : (int) millis;
    }

    public final void a(ellg ellgVar, boolean z) {
        ailn ailnVarA = ((aimb) ((z || !((arjc) this.f.b()).a()) ? this.d : this.e).b()).a();
        ailnVarA.d(emxt.BACKUP_WORKFLOW_EVENT);
        ailnVarA.j(ellgVar, aioj.LOG_SPEC_BACKUP_WORKFLOW_EVENTS);
    }
}
