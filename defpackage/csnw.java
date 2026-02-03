package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csnw {
    public final csdl a;
    public final csdo b;
    public final eoff c;
    public final String d;
    private final csnz e;
    private final csnx f;
    private final long g;
    private final eoeo h;
    private final int i;
    private final eofg j;
    private final eykc k;
    private final csdn l;
    private final csoe m;

    public csnw(csoe csoeVar, csnz csnzVar, csnx csnxVar, csdl csdlVar, csdo csdoVar, long j, eoeo eoeoVar, int i, eoff eoffVar, String str, eofg eofgVar, eykc eykcVar, csdn csdnVar) {
        csdlVar.getClass();
        this.m = csoeVar;
        this.e = csnzVar;
        this.f = csnxVar;
        this.a = csdlVar;
        this.b = csdoVar;
        this.g = j;
        this.h = eoeoVar;
        this.i = i;
        this.c = eoffVar;
        this.d = str;
        this.j = eofgVar;
        this.k = eykcVar;
        this.l = csdnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csnw)) {
            return false;
        }
        csnw csnwVar = (csnw) obj;
        return fdbq.f(this.m, csnwVar.m) && fdbq.f(this.e, csnwVar.e) && fdbq.f(this.f, csnwVar.f) && this.a == csnwVar.a && fdbq.f(this.b, csnwVar.b) && this.g == csnwVar.g && this.h == csnwVar.h && this.i == csnwVar.i && this.c == csnwVar.c && fdbq.f(this.d, csnwVar.d) && this.j == csnwVar.j && this.k == csnwVar.k && fdbq.f(this.l, csnwVar.l);
    }

    public final int hashCode() {
        int iHashCode = (((((((this.m.hashCode() * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
        long j = this.g;
        return (((((((((((((((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.h.hashCode()) * 31) + this.i) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode();
    }

    public final String toString() {
        return "Classification(classificationId=" + this.m + ", messageId=" + this.e + ", conversationId=" + this.f + ", source=" + this.a + ", score=" + this.b + ", classificationTimestamp=" + this.g + ", trigger=" + this.h + ", reclassificationIndex=" + this.i + ", outcome=" + this.c + ", classificationSourceMetadata=" + this.d + ", errorCode=" + this.j + ", action=" + this.k + ", actionContributors=" + this.l + ")";
    }
}
