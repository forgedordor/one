package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wpm {
    public final long a;
    public final long b;

    public wpm(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wpm)) {
            return false;
        }
        wpm wpmVar = (wpm) obj;
        return this.a == wpmVar.a && this.b == wpmVar.b;
    }

    public final int hashCode() {
        return (wpl.a(this.a) * 31) + wpl.a(this.b);
    }

    public final String toString() {
        return "AttachmentSize(currentSizeBytes=" + this.a + ", finalSizeBytes=" + this.b + ")";
    }
}
