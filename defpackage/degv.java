package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class degv {
    public final long a;
    private final degx b;
    private final Long c;
    private final degq d;

    public degv(degx degxVar, long j, Long l, degq degqVar) {
        this.b = degxVar;
        this.a = j;
        this.c = l;
        this.d = degqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof degv)) {
            return false;
        }
        degv degvVar = (degv) obj;
        return this.a == degvVar.a && Objects.equals(this.c, degvVar.c) && this.b.equals(degvVar.b) && this.d.equals(degvVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.b, Long.valueOf(this.a), this.c, this.d);
    }

    public final String toString() {
        degq degqVar = this.d;
        return "ComputedInstant{originalTimeSignal=" + this.b.toString() + ", instantUnixMillis=" + this.a + ", estimatedErrorUnixMillis=" + this.c + ", ticks=" + degqVar.toString() + "}";
    }
}
