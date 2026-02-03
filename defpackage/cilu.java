package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cilu {
    public final String a;
    public final Integer b;
    public final anue c;

    public cilu(anue anueVar, String str, Integer num) {
        this.c = anueVar;
        this.a = str;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cilu)) {
            return false;
        }
        cilu ciluVar = (cilu) obj;
        return fdbq.f(this.c, ciluVar.c) && fdbq.f(this.a, ciluVar.a) && fdbq.f(this.b, ciluVar.b);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() * 31) + this.a.hashCode();
        Integer num = this.b;
        return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "MentionSuggestionPayload(recipientId=" + this.c + ", displayText=" + this.a + ", implicitMentionMinimumLength=" + this.b + ")";
    }
}
