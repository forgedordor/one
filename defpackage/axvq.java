package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axvq {
    public final ekhx a;
    public final bojh b;
    public final baqv c;
    public final boolean d;
    public final boolean e;

    public axvq(ekhx ekhxVar, bojh bojhVar, baqv baqvVar, boolean z, boolean z2) {
        ekhxVar.getClass();
        bojhVar.getClass();
        baqvVar.getClass();
        this.a = ekhxVar;
        this.b = bojhVar;
        this.c = baqvVar;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axvq)) {
            return false;
        }
        axvq axvqVar = (axvq) obj;
        return fdbq.f(this.a, axvqVar.a) && fdbq.f(this.b, axvqVar.b) && fdbq.f(this.c, axvqVar.c) && this.d == axvqVar.d && this.e == axvqVar.e;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + axvp.a(this.d)) * 31) + axvp.a(this.e);
    }

    public final String toString() {
        return "BcmFindOrCreateConversationResults(recipientsNotIncludingSelf=" + this.a + ", targetConversation=" + this.b + ", bcmConversation=" + this.c + ", isAllowedByParents=" + this.d + ", isMergedToRcsGroup=" + this.e + ")";
    }
}
