package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crze {
    public final csnx a;
    public final String b;
    public final csnz c;
    public final String d;

    public crze(csnx csnxVar, String str, csnz csnzVar, String str2) {
        this.a = csnxVar;
        this.b = str;
        this.c = csnzVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crze)) {
            return false;
        }
        crze crzeVar = (crze) obj;
        return fdbq.f(this.a, crzeVar.a) && fdbq.f(this.b, crzeVar.b) && fdbq.f(this.c, crzeVar.c) && fdbq.f(this.d, crzeVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        csnz csnzVar = this.c;
        int iHashCode2 = ((iHashCode * 31) + (csnzVar == null ? 0 : csnzVar.hashCode())) * 31;
        String str = this.d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "SpamLoggingIdPair(conversationId=" + this.a + ", conversationLoggingId=" + this.b + ", messageId=" + this.c + ", messageLoggingId=" + this.d + ")";
    }
}
