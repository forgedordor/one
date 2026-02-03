package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axcw {
    public final int a;
    public final String b;

    public axcw(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axcw)) {
            return false;
        }
        axcw axcwVar = (axcw) obj;
        return this.a == axcwVar.a && fdbq.f(this.b, axcwVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SubIdIccIdPair(subId=" + this.a + ", iccId=" + this.b + ")";
    }
}
