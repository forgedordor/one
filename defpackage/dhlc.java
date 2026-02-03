package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhlc {
    public static dhlc a;
    private final Context b;

    public dhlc(Context context) {
        this.b = context;
    }

    public static dhlc a() {
        dhlc dhlcVar = a;
        if (dhlcVar != null) {
            return dhlcVar;
        }
        throw new IllegalStateException("WakeLockThreadFactory was not initialized");
    }

    public final Thread b(String str, Runnable runnable, long j) {
        return new dhlb(str, this.b, runnable, j);
    }
}
