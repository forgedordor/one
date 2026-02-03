package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cilt {
    public final String a;
    public final String b;
    public final anue c;

    public cilt(anue anueVar, String str, String str2) {
        this.c = anueVar;
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cilt)) {
            return false;
        }
        cilt ciltVar = (cilt) obj;
        return fdbq.f(this.c, ciltVar.c) && fdbq.f(this.a, ciltVar.a) && fdbq.f(this.b, ciltVar.b);
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MentionSuggestion(recipientId=" + this.c + ", prefix=" + this.a + ", suffix=" + this.b + ")";
    }
}
