package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eskn {
    static final long a = TimeUnit.MINUTES.toMillis(1);
    public static final Object b = new Object();
    public static deel c;

    public static void a(Context context) {
        if (c == null) {
            deel deelVar = new deel(context);
            c = deelVar;
            synchronized (deelVar.a) {
                deelVar.c = true;
            }
        }
    }

    static void b(Intent intent) {
        synchronized (b) {
            if (c != null && d(intent)) {
                c(intent, false);
                deel deelVar = c;
                if (deelVar.g.decrementAndGet() < 0) {
                    deei deeiVar = deel.h;
                    Log.w("WakeLock", String.format("%s release without a matched acquire!", deelVar.e));
                }
                synchronized (deelVar.a) {
                    deelVar.d();
                    Map map = deelVar.f;
                    if (map.containsKey(null)) {
                        deej deejVar = (deej) map.get(null);
                        if (deejVar != null) {
                            int i = deejVar.a - 1;
                            deejVar.a = i;
                            if (i == 0) {
                                map.remove(null);
                            }
                        }
                    } else {
                        Log.w("WakeLock", deelVar.e + " counter does not exist");
                    }
                    deelVar.e();
                }
            }
        }
    }

    public static void c(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }
}
