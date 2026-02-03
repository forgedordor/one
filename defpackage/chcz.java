package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chcz implements chda {
    public final chcp a;
    public final eqdw b;

    public chcz(chcp chcpVar, eqdw eqdwVar) {
        eqdwVar.getClass();
        this.a = chcpVar;
        this.b = eqdwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chcz)) {
            return false;
        }
        chcz chczVar = (chcz) obj;
        return fdbq.f(this.a, chczVar.a) && fdbq.f(this.b, chczVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "UpdateLocalState(context=" + this.a + ", inviteLink=" + this.b + ")";
    }
}
