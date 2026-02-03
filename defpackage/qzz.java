package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qzz {
    public static final boolean a = raa.b;
    private final List b = new ArrayList();
    private boolean c = false;

    public final synchronized void a(String str, long j) {
        if (this.c) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.b.add(new qzy(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        this.c = true;
        List<qzy> list = this.b;
        long j = list.size() == 0 ? 0L : ((qzy) list.get(list.size() - 1)).c - ((qzy) list.get(0)).c;
        if (j > 0) {
            long j2 = ((qzy) list.get(0)).c;
            raa.a("(%-4d ms) %s", Long.valueOf(j), str);
            for (qzy qzyVar : list) {
                long j3 = qzyVar.c;
                raa.a("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(qzyVar.b), qzyVar.a);
                j2 = j3;
            }
        }
    }

    protected final void finalize() {
        if (this.c) {
            return;
        }
        b("Request on the loose");
        raa.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
