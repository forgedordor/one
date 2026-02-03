package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.android.vcard.VCardConfig;
import defpackage.qar;
import defpackage.qas;
import defpackage.qee;
import defpackage.qlj;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ForceStopRunnable implements Runnable {
    private static final String a = qas.d("ForceStopRunnable");
    private static final long b = TimeUnit.DAYS.toMillis(3650);
    private final Context c;
    private final qee d;
    private final qlj e;
    private int f = 0;

    /* compiled from: PG */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        private static final String a = qas.d("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            int i = ((qar) qas.c()).a;
            String str = a;
            if (i <= 2) {
                Log.v(str, "Rescheduling alarm that keeps track of force-stops.");
            }
            ForceStopRunnable.a(context);
        }
    }

    public ForceStopRunnable(Context context, qee qeeVar) {
        this.c = context.getApplicationContext();
        this.d = qeeVar;
        this.e = qeeVar.h;
    }

    static void a(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent pendingIntentB = b(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
        long jCurrentTimeMillis = System.currentTimeMillis() + b;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentB);
        }
    }

    private static PendingIntent b(Context context, int i) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0322 A[Catch: SQLiteTableLockedException -> 0x0397, SQLiteFullException -> 0x0399, SQLiteDiskIOException -> 0x039b, SQLiteDatabaseLockedException -> 0x039d, SQLiteDatabaseCorruptException -> 0x039f, SQLiteConstraintException -> 0x03a1, SQLiteCantOpenDatabaseException -> 0x03a3, SQLiteAccessPermException -> 0x03a5, all -> 0x043a, TRY_ENTER, TryCatch #12 {all -> 0x043a, blocks: (B:3:0x0006, B:5:0x0012, B:9:0x0037, B:11:0x0048, B:13:0x007a, B:14:0x00b6, B:16:0x00c1, B:18:0x00d2, B:19:0x00da, B:21:0x00e0, B:23:0x00f8, B:25:0x00fe, B:26:0x0111, B:28:0x0117, B:30:0x012a, B:29:0x0120, B:17:0x00c6, B:32:0x0132, B:33:0x013d, B:39:0x0175, B:41:0x017d, B:43:0x0183, B:45:0x018a, B:47:0x0190, B:48:0x0194, B:50:0x019a, B:52:0x01a6, B:53:0x01ac, B:54:0x01b4, B:55:0x01b8, B:57:0x01be, B:59:0x01ca, B:63:0x01dc, B:69:0x01fa, B:71:0x01ff, B:72:0x0202, B:73:0x0203, B:144:0x0389, B:145:0x038c, B:87:0x026d, B:93:0x0279, B:95:0x0289, B:97:0x0293, B:99:0x02b5, B:103:0x02c0, B:106:0x02cc, B:107:0x02cf, B:109:0x02df, B:111:0x02e5, B:113:0x02f3, B:115:0x02f8, B:117:0x02fe, B:119:0x030e, B:132:0x0343, B:122:0x0317, B:127:0x0322, B:124:0x031c, B:131:0x0339, B:181:0x03b8, B:183:0x03c1, B:187:0x03ce, B:189:0x03e3, B:190:0x03f0, B:191:0x03f1, B:193:0x0413, B:147:0x038e, B:148:0x0396, B:196:0x0419, B:198:0x0430, B:201:0x0439, B:6:0x001e), top: B:210:0x0006, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03f1 A[Catch: all -> 0x043a, TRY_LEAVE, TryCatch #12 {all -> 0x043a, blocks: (B:3:0x0006, B:5:0x0012, B:9:0x0037, B:11:0x0048, B:13:0x007a, B:14:0x00b6, B:16:0x00c1, B:18:0x00d2, B:19:0x00da, B:21:0x00e0, B:23:0x00f8, B:25:0x00fe, B:26:0x0111, B:28:0x0117, B:30:0x012a, B:29:0x0120, B:17:0x00c6, B:32:0x0132, B:33:0x013d, B:39:0x0175, B:41:0x017d, B:43:0x0183, B:45:0x018a, B:47:0x0190, B:48:0x0194, B:50:0x019a, B:52:0x01a6, B:53:0x01ac, B:54:0x01b4, B:55:0x01b8, B:57:0x01be, B:59:0x01ca, B:63:0x01dc, B:69:0x01fa, B:71:0x01ff, B:72:0x0202, B:73:0x0203, B:144:0x0389, B:145:0x038c, B:87:0x026d, B:93:0x0279, B:95:0x0289, B:97:0x0293, B:99:0x02b5, B:103:0x02c0, B:106:0x02cc, B:107:0x02cf, B:109:0x02df, B:111:0x02e5, B:113:0x02f3, B:115:0x02f8, B:117:0x02fe, B:119:0x030e, B:132:0x0343, B:122:0x0317, B:127:0x0322, B:124:0x031c, B:131:0x0339, B:181:0x03b8, B:183:0x03c1, B:187:0x03ce, B:189:0x03e3, B:190:0x03f0, B:191:0x03f1, B:193:0x0413, B:147:0x038e, B:148:0x0396, B:196:0x0419, B:198:0x0430, B:201:0x0439, B:6:0x001e), top: B:210:0x0006, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03c1 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v48, types: [java.util.Map] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1089
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.run():void");
    }
}
