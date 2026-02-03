package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efbo extends efdd {
    private final evqs a;
    private final efdf b;

    public efbo(evqs evqsVar, efdf efdfVar) {
        this.a = evqsVar;
        this.b = efdfVar;
    }

    @Override // defpackage.efdd
    public final efdf a() {
        return this.b;
    }

    @Override // defpackage.efdd
    public final evqs b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efdd) {
            efdd efddVar = (efdd) obj;
            if (this.a.equals(efddVar.b()) && this.b.equals(efddVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
