package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evwz {
    public static evrj a(Duration duration) {
        return evwy.g(duration.getSeconds(), duration.getNano());
    }

    public static evvp b(Instant instant) {
        return evxc.f(instant.getEpochSecond(), instant.getNano());
    }

    public static Duration c(evrj evrjVar) {
        return Duration.ofSeconds(evwy.g(evrjVar.b, evrjVar.c).b, r4.c);
    }

    public static Instant d(evvp evvpVar) {
        return Instant.ofEpochSecond(evxc.f(evvpVar.b, evvpVar.c).b, r4.c);
    }
}
