package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzlw {
    public static dzlw d(diep diepVar) {
        return new dzky(SystemClock.elapsedRealtime(), diepVar.e().toMillis());
    }

    public static dzlw e() {
        return new dzky(SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long a();

    public abstract long b();

    public final long c(boolean z) {
        return a();
    }
}
