package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djex {
    public final String a;
    public final String b;
    public final dlcr c;

    public djex(String str, dlcr dlcrVar, String str2) {
        this.a = str;
        this.c = dlcrVar;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djex)) {
            return false;
        }
        djex djexVar = (djex) obj;
        return fdbq.f(this.a, djexVar.a) && fdbq.f(this.c, djexVar.c) && fdbq.f(this.b, djexVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        dlcr dlcrVar = this.c;
        return ((iHashCode + (dlcrVar == null ? 0 : dlcrVar.hashCode())) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ComposeRowSimData(carrierName=" + this.a + ", simIcon=" + this.c + ", phoneNumber=" + this.b + ")";
    }

    public djex() {
        this("", null, "");
    }
}
