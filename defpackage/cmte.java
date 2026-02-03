package defpackage;

import android.os.Environment;
import android.os.StatFs;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmte {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/sms/analytics/RcsTelephonyFilePersistenceEventLogger");
    public final fdjx b;
    public final asfd c;
    private final fcsu d;
    private final fcsu e;

    public cmte(fcsu fcsuVar, fcsu fcsuVar2, fdjx fdjxVar, asfd asfdVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fdjxVar.getClass();
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.b = fdjxVar;
        this.c = asfdVar;
    }

    public static final long b() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    public final void a(ellg ellgVar) {
        if (this.c.a()) {
            ailn ailnVarA = ((aimb) this.e.b()).a();
            ailnVarA.d(emxt.TELEPHONY_PERSISTENCE_EVENT);
            ailnVarA.j(ellgVar, aioj.LOG_SPEC_TELEPHONY_PERSISTENCE_EVENTS);
        } else {
            ailn ailnVarA2 = ((aimb) this.d.b()).a();
            ailnVarA2.d(emxt.TELEPHONY_PERSISTENCE_EVENT);
            ailnVarA2.j(ellgVar, aioj.LOG_SPEC_TELEPHONY_PERSISTENCE_EVENTS);
        }
    }
}
