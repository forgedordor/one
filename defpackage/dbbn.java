package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbbn implements dbbo {
    private final String a;
    private final int b;

    public dbbn(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbbn)) {
            return false;
        }
        dbbn dbbnVar = (dbbn) obj;
        return fdbq.f(this.a, dbbnVar.a) && this.b == dbbnVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "Unstarted(videoId=" + this.a + ", currentTime=" + this.b + ")";
    }
}
