package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csbq {
    public final int a;
    public final String b;

    public csbq(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csbq)) {
            return false;
        }
        csbq csbqVar = (csbq) obj;
        return this.a == csbqVar.a && fdbq.f(this.b, csbqVar.b);
    }

    public final int hashCode() {
        String str = this.b;
        return (this.a * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SubIdAndSelfDestination(subId=" + this.a + ", selfNormalizedDestination=" + this.b + ")";
    }
}
