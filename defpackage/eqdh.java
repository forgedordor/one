package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqdh extends eqea {
    private final ezol a;
    private final eqdz b;

    public eqdh(ezol ezolVar, eqdz eqdzVar) {
        this.a = ezolVar;
        this.b = eqdzVar;
    }

    @Override // defpackage.eqea
    public final eqdz a() {
        return this.b;
    }

    @Override // defpackage.eqea
    public final ezol b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eqea) {
            eqea eqeaVar = (eqea) obj;
            if (this.a.equals(eqeaVar.b()) && this.b.equals(eqeaVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        eqdz eqdzVar = this.b;
        return "GroupMember{id=" + this.a.toString() + ", role=" + eqdzVar.toString() + "}";
    }
}
