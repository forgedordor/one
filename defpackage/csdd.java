package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csdd {
    public final eoff a;
    public final csdo b;
    public final String c;
    public final Integer d;
    public final csdb e;

    public csdd(eoff eoffVar, csdo csdoVar, String str, Integer num, csdb csdbVar) {
        eoffVar.getClass();
        csdoVar.getClass();
        this.a = eoffVar;
        this.b = csdoVar;
        this.c = str;
        this.d = num;
        this.e = csdbVar;
        if (num != null && num.intValue() < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csdd)) {
            return false;
        }
        csdd csddVar = (csdd) obj;
        return this.a == csddVar.a && fdbq.f(this.b, csddVar.b) && fdbq.f(this.c, csddVar.c) && fdbq.f(this.d, csddVar.d) && fdbq.f(this.e, csddVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        int iHashCode2 = ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        csdb csdbVar = this.e;
        return iHashCode3 + (csdbVar != null ? csdbVar.hashCode() : 0);
    }

    public final String toString() {
        return "SpamClassificationResult(outcome=" + this.a + ", score=" + this.b + ", classificationSourceMetadata=" + this.c + ", reclassificationDelaySeconds=" + this.d + ", reinforcementParams=" + this.e + ")";
    }

    public /* synthetic */ csdd(eoff eoffVar, csdo csdoVar, String str, Integer num, csdb csdbVar, int i) {
        this(eoffVar, csdoVar, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : csdbVar);
    }
}
