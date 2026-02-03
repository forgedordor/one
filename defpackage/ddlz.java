package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddlz extends ddme {
    public final ejwi a;
    private final ejwi b;

    public ddlz(ejwi ejwiVar, ejwi ejwiVar2) {
        this.a = ejwiVar;
        this.b = ejwiVar2;
    }

    @Override // defpackage.ddme
    public final ejwi a() {
        return this.a;
    }

    @Override // defpackage.ddme
    public final ejwi b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ddme) {
            ddme ddmeVar = (ddme) obj;
            if (this.a.equals(ddmeVar.a()) && this.b.equals(ddmeVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "Identifiers{androidId=" + this.a.toString() + ", ssaidDerivative=Optional.absent()}";
    }
}
