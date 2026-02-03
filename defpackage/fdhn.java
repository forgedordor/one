package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
class fdhn {
    public static final double a(double d, fdhl fdhlVar, fdhl fdhlVar2) {
        fdhlVar.getClass();
        fdhlVar2.getClass();
        TimeUnit timeUnit = fdhlVar.h;
        long jConvert = fdhlVar2.h.convert(1L, timeUnit);
        return jConvert > 0 ? d * jConvert : d / timeUnit.convert(1L, r9);
    }

    public static final long b(long j, fdhl fdhlVar, fdhl fdhlVar2) {
        fdhlVar.getClass();
        fdhlVar2.getClass();
        return fdhlVar2.h.convert(j, fdhlVar.h);
    }

    public static final long c(long j, fdhl fdhlVar, fdhl fdhlVar2) {
        fdhlVar.getClass();
        fdhlVar2.getClass();
        return fdhlVar2.h.convert(j, fdhlVar.h);
    }
}
