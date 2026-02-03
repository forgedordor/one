package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aijs {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/alarm/BugleAlarmScheduler");
    public final Context a;
    public AlarmManager b;
    private final aijy d;

    public aijs(Context context, aijy aijyVar) {
        context.getClass();
        this.a = context;
        this.d = aijyVar;
    }

    public final void a(aiju aijuVar) {
        aijuVar.getClass();
        Context context = this.a;
        Object systemService = context.getSystemService("alarm");
        systemService.getClass();
        this.b = (AlarmManager) systemService;
        Intent intentA = aiiw.b(new ComponentName(context, "com.google.android.apps.messaging.shared.alarm.BugleAlarmReceiver"), "com.google.android.apps.messaging.shared.alarm.ACTION_BUGLE_ALARM").a();
        intentA.getClass();
        PendingIntent pendingIntentA = this.d.a(intentA, aijuVar);
        AlarmManager alarmManager = this.b;
        if (alarmManager == null) {
            fdbq.c("alarmManager");
            alarmManager = null;
        }
        alarmManager.cancel(pendingIntentA);
    }

    public final void b(Instant instant, aiju aijuVar, boolean z, fdau fdauVar, fdau fdauVar2) {
        Intent intentA = aiiw.b(new ComponentName(this.a, "com.google.android.apps.messaging.shared.alarm.BugleAlarmReceiver"), "com.google.android.apps.messaging.shared.alarm.ACTION_BUGLE_ALARM").a();
        intentA.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            AlarmManager alarmManager = this.b;
            if (alarmManager == null) {
                fdbq.c("alarmManager");
                alarmManager = null;
            }
            if (!alarmManager.canScheduleExactAlarms()) {
                if (!z) {
                    throw new SecurityException("Missing permission to use exact alarms.");
                }
                ((ekrd) c.h().h("com/google/android/apps/messaging/shared/alarm/BugleAlarmScheduler", "scheduleInternalWithFallback", 86, "BugleAlarmScheduler.kt")).q("Missing permission to use exact alarms.");
                fdauVar2.a(0, Long.valueOf(instant.toEpochMilli()), this.d.a(intentA, aijuVar));
                return;
            }
        }
        fdauVar.a(0, Long.valueOf(instant.toEpochMilli()), this.d.a(intentA, aijuVar));
    }
}
