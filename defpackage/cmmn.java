package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmmn extends cmqi {
    public final ekhx a;
    public final ekhx b;
    public final ekhx c;
    public final ekhx d;

    public cmmn(ekhx ekhxVar, ekhx ekhxVar2, ekhx ekhxVar3, ekhx ekhxVar4) {
        if (ekhxVar == null) {
            throw new NullPointerException("Null from");
        }
        this.a = ekhxVar;
        if (ekhxVar2 == null) {
            throw new NullPointerException("Null to");
        }
        this.b = ekhxVar2;
        if (ekhxVar3 == null) {
            throw new NullPointerException("Null cc");
        }
        this.c = ekhxVar3;
        if (ekhxVar4 == null) {
            throw new NullPointerException("Null fromIdentities");
        }
        this.d = ekhxVar4;
    }

    @Override // defpackage.cmqi
    public final ekhx a() {
        return this.c;
    }

    @Override // defpackage.cmqi
    public final ekhx b() {
        return this.a;
    }

    @Override // defpackage.cmqi
    public final ekhx c() {
        return this.d;
    }

    @Override // defpackage.cmqi
    public final ekhx d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cmqi) {
            cmqi cmqiVar = (cmqi) obj;
            if (this.a.equals(cmqiVar.b()) && this.b.equals(cmqiVar.d()) && this.c.equals(cmqiVar.a()) && this.d.equals(cmqiVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        ekhx ekhxVar = this.d;
        ekhx ekhxVar2 = this.c;
        ekhx ekhxVar3 = this.b;
        return "MessageEnvelope{from=" + this.a.toString() + ", to=" + ekhxVar3.toString() + ", cc=" + ekhxVar2.toString() + ", fromIdentities=" + ekhxVar.toString() + "}";
    }
}
