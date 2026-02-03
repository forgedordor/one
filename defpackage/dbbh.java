package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbbh implements dbbo {
    private final String a;
    private final int b;

    public dbbh(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbbh)) {
            return false;
        }
        dbbh dbbhVar = (dbbh) obj;
        return fdbq.f(this.a, dbbhVar.a) && this.b == dbbhVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "Buffering(videoId=" + this.a + ", currentTime=" + this.b + ")";
    }
}
