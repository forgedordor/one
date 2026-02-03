package defpackage;

import j$.time.Instant;
import j$.time.ZoneOffset;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csst {
    public static final evvp a(Instant instant) {
        Instant instant2 = instant.atZone(ZoneOffset.UTC).toLocalDate().atStartOfDay(ZoneOffset.UTC).toInstant();
        instant2.getClass();
        return evxd.b(instant2);
    }
}
