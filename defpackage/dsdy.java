package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsdy extends dsee {
    public final dsbm a;
    private final etht b;

    public dsdy(etht ethtVar, dsbm dsbmVar) {
        if (ethtVar == null) {
            throw new NullPointerException("Null promoId");
        }
        this.b = ethtVar;
        this.a = dsbmVar;
    }

    @Override // defpackage.dsee
    public final dsbm a() {
        return this.a;
    }

    @Override // defpackage.dsee
    public final etht b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dsee) {
            dsee dseeVar = (dsee) obj;
            dseeVar.c();
            if (this.b.equals(dseeVar.b()) && this.a.equals(dseeVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ (-721379959)) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        dsbm dsbmVar = this.a;
        return "TriggeringRuleEvalContext{accountName=null, promoId=" + this.b.toString() + ", triggeringEvent=" + dsbmVar.toString() + "}";
    }

    @Override // defpackage.dsee
    public final void c() {
    }
}
