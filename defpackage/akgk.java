package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akgk {
    private final akgl a;
    private final cgsr b;

    public akgk(akgl akglVar, cgsr cgsrVar) {
        akglVar.getClass();
        this.a = akglVar;
        this.b = cgsrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akgk)) {
            return false;
        }
        akgk akgkVar = (akgk) obj;
        return this.a == akgkVar.a && fdbq.f(this.b, akgkVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        cgsr cgsrVar = this.b;
        return iHashCode + (cgsrVar == null ? 0 : cgsrVar.hashCode());
    }

    public final String toString() {
        return "PalModeData(state=" + this.a + ", geminiConversationId=" + this.b + ")";
    }

    public /* synthetic */ akgk(akgl akglVar) {
        this(akglVar, null);
    }
}
