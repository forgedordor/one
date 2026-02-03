package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dvw {
    public final long a;
    public final long b;
    public final boolean c = false;

    public dvw(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final dvw a(dvw dvwVar) {
        return new dvw(ihs.e(this.a, dvwVar.a), Math.max(this.b, dvwVar.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvw)) {
            return false;
        }
        dvw dvwVar = (dvw) obj;
        if (!ihs.h(this.a, dvwVar.a) || this.b != dvwVar.b) {
            return false;
        }
        boolean z = dvwVar.c;
        return true;
    }

    public final int hashCode() {
        long j = this.b;
        return (((ihr.a(this.a) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + 1237;
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) ihs.g(this.a)) + ", timeMillis=" + this.b + ", shouldApplyImmediately=false)";
    }
}
