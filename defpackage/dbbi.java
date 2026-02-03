package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbbi implements dbbo {
    private final String a;
    private final int b;

    public dbbi(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbbi)) {
            return false;
        }
        dbbi dbbiVar = (dbbi) obj;
        return fdbq.f(this.a, dbbiVar.a) && this.b == dbbiVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "Cued(videoId=" + this.a + ", currentTime=" + this.b + ")";
    }
}
