package defpackage;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cssu {
    public static final ZoneId a = ZoneId.of("America/Los_Angeles");

    public static evvp a(long j) {
        int nanos = (int) TimeUnit.MILLISECONDS.toNanos(j % TimeUnit.SECONDS.toMillis(1L));
        evvo evvoVar = (evvo) evvp.a.createBuilder();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
        evvoVar.copyOnWrite();
        ((evvp) evvoVar.instance).b = seconds;
        evvoVar.copyOnWrite();
        ((evvp) evvoVar.instance).c = nanos;
        return (evvp) evvoVar.build();
    }

    public static evvp b(evvp evvpVar) {
        return evxc.e(Math.round(evvpVar.b / 3600.0f) * 3600);
    }

    public static evvp c(evvp evvpVar) {
        return evwz.b(evwz.d(evvpVar).atZone(ZoneOffset.UTC).toLocalDate().atStartOfDay(ZoneOffset.UTC).toInstant());
    }
}
