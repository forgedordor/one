package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpvk {
    public final long a;
    public final int b;

    public dpvk(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpvk)) {
            return false;
        }
        dpvk dpvkVar = (dpvk) obj;
        return this.a == dpvkVar.a && this.b == dpvkVar.b;
    }

    public final int hashCode() {
        long j = this.a;
        return (((int) (j ^ (j >>> 32))) * 31) + this.b;
    }

    public final String toString() {
        return "ScrollEvent(time=" + this.a + ", delta=" + this.b + ")";
    }
}
