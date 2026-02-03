package defpackage;

import com.google.android.rcs.client.messaging.AutoValue_MessagingResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class effe {
    public abstract MessagingResult a();

    public abstract void b(int i);

    public abstract void c(int i);

    public abstract void d(Duration duration);

    public final MessagingResult e() {
        MessagingResult messagingResultA = a();
        AutoValue_MessagingResult autoValue_MessagingResult = (AutoValue_MessagingResult) messagingResultA;
        int i = autoValue_MessagingResult.a;
        if (i != 0 && i != 1) {
            return messagingResultA;
        }
        ejwl.m(autoValue_MessagingResult.b == 0, "ErrorCause should be UNKNOWN");
        ejwl.m(autoValue_MessagingResult.c.isZero(), "retryAfter should be 0");
        return messagingResultA;
    }
}
