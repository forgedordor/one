package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cskl {
    public final int a;
    public final String b;

    public cskl(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cskl)) {
            return false;
        }
        cskl csklVar = (cskl) obj;
        return this.a == csklVar.a && fdbq.f(this.b, csklVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RcsNetworkSpamIndicator(spamVerdict=" + this.a + ", source=" + this.b + ")";
    }
}
