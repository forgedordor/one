package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqds {
    public final eqdr a;
    public final eqed b;
    public final eqdo c;
    public final ekhx d;

    public eqds(eqdr eqdrVar, eqed eqedVar, eqdo eqdoVar, ekhx ekhxVar) {
        this.a = eqdrVar;
        this.b = eqedVar;
        this.c = eqdoVar;
        this.d = ekhxVar;
        if (ekhxVar.isEmpty()) {
            throw new IllegalStateException("Check failed.");
        }
        if (!eqedVar.b.a(eqdoVar)) {
            throw new IllegalStateException("Check failed.");
        }
        ekqg ekqgVarListIterator = ekhxVar.listIterator();
        ekqgVarListIterator.getClass();
        while (ekqgVarListIterator.hasNext()) {
            eqea eqeaVar = (eqea) ekqgVarListIterator.next();
            eqef eqefVar = this.b.b;
            eqdz eqdzVarA = eqeaVar.a();
            int iOrdinal = eqefVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw null;
                    }
                    if (eqdz.b != eqdzVarA && eqdz.c != eqdzVarA) {
                        throw new IllegalStateException("Check failed.");
                    }
                } else if (eqdz.b != eqdzVarA) {
                    throw new IllegalStateException("Check failed.");
                }
            } else if (eqdz.a != eqdzVarA) {
                throw new IllegalStateException("Check failed.");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqds)) {
            return false;
        }
        eqds eqdsVar = (eqds) obj;
        return fdbq.f(this.a, eqdsVar.a) && fdbq.f(this.b, eqdsVar.b) && fdbq.f(this.c, eqdsVar.c) && fdbq.f(this.d, eqdsVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "GroupInfo(id=" + this.a + ", properties=" + this.b + ", features=" + this.c + ", members=" + this.d + ")";
    }
}
