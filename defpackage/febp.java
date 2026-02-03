package defpackage;

import j$.time.Duration;
import j$.time.temporal.ChronoUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class febp {
    public static final Object a(Duration duration, fcxy fcxyVar) {
        Object objC = fdkj.c(duration.compareTo(Duration.ZERO) <= 0 ? 0L : duration.compareTo(ChronoUnit.MILLIS.getDuration()) <= 0 ? 1L : (duration.getSeconds() < 9223372036854775L || (duration.getSeconds() == 9223372036854775L && duration.getNano() < 807000000)) ? duration.toMillis() : Long.MAX_VALUE, fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }
}
