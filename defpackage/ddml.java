package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddml extends ddmo {
    public final ejwi a;
    private final ejwi b;
    private final ejwi c;
    private final ejwi d;
    private final ejwi e;

    public ddml(ejwi ejwiVar, ejwi ejwiVar2, ejwi ejwiVar3, ejwi ejwiVar4, ejwi ejwiVar5) {
        this.b = ejwiVar;
        this.a = ejwiVar2;
        this.c = ejwiVar3;
        this.d = ejwiVar4;
        this.e = ejwiVar5;
    }

    @Override // defpackage.ddmo
    public final ejwi a() {
        return this.a;
    }

    @Override // defpackage.ddmo
    public final ejwi b() {
        return this.c;
    }

    @Override // defpackage.ddmo
    public final ejwi c() {
        return this.b;
    }

    @Override // defpackage.ddmo
    public final ejwi d() {
        return this.e;
    }

    @Override // defpackage.ddmo
    public final ejwi e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ddmo) {
            ddmo ddmoVar = (ddmo) obj;
            if (this.b.equals(ddmoVar.c()) && this.a.equals(ddmoVar.a()) && this.c.equals(ddmoVar.b()) && this.d.equals(ddmoVar.e()) && this.e.equals(ddmoVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        ejwi ejwiVar = this.e;
        ejwi ejwiVar2 = this.d;
        ejwi ejwiVar3 = this.c;
        ejwi ejwiVar4 = this.a;
        return "ValidatedEnforcementDecision{failureReason=" + String.valueOf(this.b) + ", enforcementDecision=" + String.valueOf(ejwiVar4) + ", enforcementResponse=" + String.valueOf(ejwiVar3) + ", responseUuid=" + String.valueOf(ejwiVar2) + ", provisionalState=" + String.valueOf(ejwiVar) + "}";
    }
}
