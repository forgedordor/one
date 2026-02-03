package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eont {
    public static final long a(Duration duration) {
        int i = eonv.a;
        return duration.getSeconds() < -9223372036854L ? eolp.b(eolp.c(duration.getSeconds() + 1, 1000000L), (duration.getNano() / 1000) - 1000000) : eolp.b(eolp.c(duration.getSeconds(), 1000000L), duration.getNano() / 1000);
    }
}
