package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class egzt {
    public abstract int a();

    public abstract long b();

    public abstract egyi c();

    public abstract egyv d();

    public abstract egyz e();

    public abstract Instant f();

    final egzt g(egyi egyiVar, Instant instant) {
        ejwl.m(b() != Long.MAX_VALUE, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        return new egyd(egyiVar, b() + 1, new egxw(0L), new egxx(0L), 0, instant);
    }

    final boolean h(egzt egztVar) {
        ejwl.l(b() != Long.MIN_VALUE);
        ejwl.l(!equals(egztVar) || this == egztVar);
        long jB = b();
        egyd egydVar = (egyd) egztVar;
        long j = egydVar.b;
        if (jB < j) {
            return true;
        }
        if (b() == j) {
            if (((egxw) d()).a < ((egxw) egydVar.c).a) {
                return true;
            }
            if (((egxx) e()).a < ((egxx) egydVar.d).a) {
                return true;
            }
        }
        return false;
    }

    final boolean i() {
        return a() > 3;
    }
}
