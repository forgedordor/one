package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbbl implements dbbo {
    private final String a;
    private final int b;

    public dbbl(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbbl)) {
            return false;
        }
        dbbl dbblVar = (dbbl) obj;
        return fdbq.f(this.a, dbblVar.a) && this.b == dbblVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "Playing(videoId=" + this.a + ", currentTime=" + this.b + ")";
    }
}
