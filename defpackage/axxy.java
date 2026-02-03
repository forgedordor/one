package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axxy {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/action/ProcessPendingMessagesTimers");
    public static final long b = TimeUnit.SECONDS.toMillis(5);
    public static final long c = TimeUnit.SECONDS.toMillis(3);
    public static long d = 0;
    public static final Random e = new Random();
    public static final long[] f = new long[8];
    public static final int[] g = new int[8];
    public static final long[] h = new long[8];
    public final cqpz i;
    public final ayqx j;

    static {
        for (int i = 0; i < 8; i++) {
            f[i] = 0;
            g[i] = 0;
            h[i] = 0;
        }
    }

    public axxy(cqpz cqpzVar, ayqx ayqxVar) {
        this.i = cqpzVar;
        this.j = ayqxVar;
    }

    static long a(int i) {
        if (ayqx.f(i)) {
            long j = h[i];
            return j > 0 ? j : f[i];
        }
        ekrw ekrwVarI = a.i();
        ekrwVarI.X(eksq.a, "BugleDataModel");
        ((ekrd) ((ekrd) ekrwVarI).h("com/google/android/apps/messaging/shared/datamodel/action/ProcessPendingMessagesTimers", "getNextRetryTime", 235, "ProcessPendingMessagesTimers.java")).r("Invalid channel at getNextRetryTime: %s", i);
        return Long.MAX_VALUE;
    }

    public static void b(int i, boolean z) {
        if (!ayqx.f(i)) {
            ekrw ekrwVarI = a.i();
            ekrwVarI.X(eksq.a, "BugleDataModel");
            ((ekrd) ((ekrd) ekrwVarI).h("com/google/android/apps/messaging/shared/datamodel/action/ProcessPendingMessagesTimers", "clearNextRetryTimestamp", 268, "ProcessPendingMessagesTimers.java")).r("Invalid channel at clearNextRetryTimestamp: %s", i);
        } else {
            f[i] = 0;
            if (z) {
                g[i] = 0;
            }
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleDataModel");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/action/ProcessPendingMessagesTimers", "clearNextRetryTimestamp", 276, "ProcessPendingMessagesTimers.java")).D("Cleared next retry time for channel: %s %s", aypw.d(i), true != z ? "" : "including counter");
        }
    }

    public static void c(MessageCoreData messageCoreData) {
        b(ayqx.b(messageCoreData), true);
    }

    public final boolean d(int i, long j) {
        return i == 1 && j - d <= c;
    }
}
