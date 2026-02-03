package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbbj implements dbbo {
    private final String a;
    private final int b;

    public dbbj(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbbj)) {
            return false;
        }
        dbbj dbbjVar = (dbbj) obj;
        return fdbq.f(this.a, dbbjVar.a) && this.b == dbbjVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "Ended(videoId=" + this.a + ", currentTime=" + this.b + ")";
    }
}
