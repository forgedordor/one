package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejsz {
    public static final ejya a;

    static {
        ejya ejsyVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            ejsyVar = new ejsx();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            ejsyVar = new ejsy();
        }
        a = ejsyVar;
    }
}
