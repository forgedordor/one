package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbbf {
    private final String a;

    public dbbf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dbbf) && fdbq.f(this.a, ((dbbf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VideoNotAllowed(videoId=" + this.a + ")";
    }
}
