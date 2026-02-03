package defpackage;

import j$.time.Instant;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fceh implements fcmq {
    @Override // defpackage.fcmq
    public final long a() {
        return eolp.g(TimeUnit.SECONDS.toNanos(Instant.now().getEpochSecond()), r0.getNano());
    }
}
