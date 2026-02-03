package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqml {
    public static final dqmj a = new dqmj();
    public static final Thread b;
    public static dqmh c;

    static {
        Thread thread = Looper.getMainLooper().getThread();
        thread.getClass();
        b = thread;
    }
}
