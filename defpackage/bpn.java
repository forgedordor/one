package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpn {
    private static volatile ScheduledExecutorService a;

    private bpn() {
    }

    public static ScheduledExecutorService a() {
        if (a == null) {
            synchronized (bpn.class) {
                if (a == null) {
                    a = new bpi(new Handler(Looper.getMainLooper()));
                }
            }
        }
        return a;
    }
}
