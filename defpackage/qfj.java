package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qfj {
    public static final String a = qas.d("Alarms");

    public static void a(Context context, qiw qiwVar, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, qfk.c(context, qiwVar), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        qas.c().a(a, "Cancelling existing alarm with (workSpecId, systemId) (" + qiwVar + ", " + i + ")");
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, qiw qiwVar, long j) throws IOException {
        qiq qiqVarA = workDatabase.A();
        qio qioVarA = qip.a(qiqVarA, qiwVar);
        if (qioVarA != null) {
            int i = qioVarA.c;
            a(context, qiwVar, i);
            c(context, qiwVar, i, j);
        } else {
            final qld qldVar = new qld(workDatabase);
            Object objF = qldVar.a.f(new Callable() { // from class: qlb
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Integer.valueOf(qle.a(qldVar.a, "next_alarm_manager_id"));
                }
            });
            objF.getClass();
            int iIntValue = ((Number) objF).intValue();
            qiqVarA.a(qiv.a(qiwVar, iIntValue));
            c(context, qiwVar, iIntValue, j);
        }
    }

    private static void c(Context context, qiw qiwVar, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, qfk.c(context, qiwVar), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
