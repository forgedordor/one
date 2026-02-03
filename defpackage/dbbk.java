package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbbk implements dbbo {
    private final String a;
    private final int b;

    public dbbk(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbbk)) {
            return false;
        }
        dbbk dbbkVar = (dbbk) obj;
        return fdbq.f(this.a, dbbkVar.a) && this.b == dbbkVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "Paused(videoId=" + this.a + ", currentTime=" + this.b + ")";
    }
}
