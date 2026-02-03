package defpackage;

import android.os.Process;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehnn {

    /* compiled from: PG */
    public interface a {
        eigp b();
    }

    public static final long a(long j) {
        return Math.max(0L, System.currentTimeMillis() - Math.max(0L, SystemClock.elapsedRealtime() - j));
    }

    public static final long b() {
        ejwi ejwiVarA = dztj.a();
        if (ejwiVarA.g()) {
            return ((Long) ejwiVarA.c()).longValue();
        }
        int i = ehnm.t;
        return Process.getStartElapsedRealtime();
    }
}
