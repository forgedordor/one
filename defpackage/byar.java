package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byar {
    public final int a;
    public final String b;
    public final bcvd c;
    public final boolean d;
    public final byas e;
    public final int f;
    private final bdxj g;

    public byar(int i, String str, bdxj bdxjVar, bcvd bcvdVar, boolean z, int i2, byas byasVar) {
        if (i2 == 0) {
            throw null;
        }
        byasVar.getClass();
        this.a = i;
        this.b = str;
        this.g = bdxjVar;
        this.c = bcvdVar;
        this.d = z;
        this.f = i2;
        this.e = byasVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byar)) {
            return false;
        }
        byar byarVar = (byar) obj;
        return this.a == byarVar.a && fdbq.f(this.b, byarVar.b) && fdbq.f(this.g, byarVar.g) && fdbq.f(this.c, byarVar.c) && this.d == byarVar.d && this.f == byarVar.f && this.e == byarVar.e;
    }

    public final int hashCode() {
        return (((((((((((this.a * 31) + this.b.hashCode()) * 31) + this.g.hashCode()) * 31) + this.c.hashCode()) * 31) + (true != this.d ? 1237 : 1231)) * 31) + this.f) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "ConversationListFilterData(iconResId=" + this.a + ", name=" + this.b + ", whereClause=" + this.g + ", whereClauseFromConversationToParticipantsQuery=" + this.c + ", shouldBeDisplayed=" + this.d + ", logType=" + ((Object) Integer.toString(this.f - 1)) + ", position=" + this.e + ")";
    }
}
