package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbbg {
    private final String a;

    public dbbg(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dbbg) && fdbq.f(this.a, ((dbbg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VideoNotFound(videoId=" + this.a + ")";
    }
}
