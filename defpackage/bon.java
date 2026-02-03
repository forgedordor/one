package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bon {
    private static volatile Handler a;

    private bon() {
    }

    public static Handler a() {
        if (a == null) {
            synchronized (bon.class) {
                if (a == null) {
                    a = laf.a(Looper.getMainLooper());
                }
            }
        }
        return a;
    }
}
