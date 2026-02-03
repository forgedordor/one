package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akcf {
    public final aukf a;
    public final aukd b;
    public final long c;
    public final String d;

    public akcf(aukf aukfVar, aukd aukdVar, long j, String str) {
        this.a = aukfVar;
        this.b = aukdVar;
        this.c = j;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akcf)) {
            return false;
        }
        akcf akcfVar = (akcf) obj;
        return this.a == akcfVar.a && this.b == akcfVar.b && this.c == akcfVar.c && fdbq.f(this.d, akcfVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.d;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.c;
        return (((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + iHashCode2;
    }

    public final String toString() {
        return "ConversationClassification(classificationType=" + this.a + ", classificationState=" + this.b + ", impressionCount=" + this.c + ", date=" + this.d + ")";
    }
}
