package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wun {
    public final boolean a;
    public final long b;

    public wun(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wun)) {
            return false;
        }
        wun wunVar = (wun) obj;
        return this.a == wunVar.a && this.b == wunVar.b;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        long j = this.b;
        return (i * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "InfoData(useInfoTooltip=" + this.a + ", maxMessageSizeBytes=" + this.b + ")";
    }
}
