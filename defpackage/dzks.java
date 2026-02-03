package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzks {
    public final fedk a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final fecr f;
    public final String g;
    public final feeg h;
    public final Integer i;

    public dzks(fedk fedkVar, Long l, Long l2, Long l3, Long l4, fecr fecrVar, String str, feeg feegVar, Integer num) {
        this.a = fedkVar;
        this.b = l;
        this.c = l2;
        this.d = l3;
        this.e = l4;
        this.f = fecrVar;
        this.g = str;
        this.h = feegVar;
        this.i = num;
    }

    public final String toString() {
        return String.format("StatsRecord:\n  elapsed: %d\n  current: %d\n  Primes version: %d\n  version name #: %d\n  customName: %s\n", this.b, this.c, this.d, this.e, this.g);
    }
}
