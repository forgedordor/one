package defpackage;

import android.os.Looper;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drjz {
    public static void a() {
        if (b()) {
            return;
        }
        if (drxl.a) {
            throw new IllegalThreadStateException("Expected in UI thread, but not.");
        }
        Log.wtf("ThreadUtil", "Expected in UI thread, but not.");
    }

    public static boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
