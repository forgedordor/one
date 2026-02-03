package defpackage;

import android.net.TrafficStats;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drff implements Executor {
    private final Executor a;

    public drff(Executor executor) {
        this.a = executor;
        Integer num = 0;
        num.getClass();
        Integer num2 = -1;
        num2.getClass();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        this.a.execute(eiid.k(new Runnable() { // from class: drfe
            @Override // java.lang.Runnable
            public final void run() {
                TrafficStats.setThreadStatsTag(0);
                try {
                    runnable.run();
                } finally {
                    TrafficStats.clearThreadStatsTag();
                }
            }
        }));
    }
}
