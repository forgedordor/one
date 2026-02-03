package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddmp {
    public static boolean a(evvp evvpVar, long j, long j2, long j3) {
        long millis = (TimeUnit.SECONDS.toMillis(evvpVar.b) + TimeUnit.NANOSECONDS.toMillis(evvpVar.c)) - j;
        return j2 <= millis && millis < j3;
    }
}
