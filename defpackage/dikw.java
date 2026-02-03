package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dikw implements diky {
    public final String a;
    public final dkpi b;
    public final dkpc c;
    public final boolean d;
    public final boolean e;
    public final dike f;
    private final String g;

    public dikw(String str, dkpi dkpiVar, String str2, dkpc dkpcVar, boolean z, boolean z2, dike dikeVar) {
        this.a = str;
        this.b = dkpiVar;
        this.g = str2;
        this.c = dkpcVar;
        this.d = z;
        this.e = z2;
        this.f = dikeVar;
    }

    @Override // defpackage.dilm
    public final String e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dikw)) {
            return false;
        }
        dikw dikwVar = (dikw) obj;
        return fdbq.f(this.a, dikwVar.a) && fdbq.f(this.b, dikwVar.b) && fdbq.f(this.g, dikwVar.g) && fdbq.f(this.c, dikwVar.c) && this.d == dikwVar.d && this.e == dikwVar.e && fdbq.f(this.f, dikwVar.f);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.g.hashCode();
        dkpc dkpcVar = this.c;
        int iHashCode2 = ((((((iHashCode * 31) + (dkpcVar == null ? 0 : dkpcVar.hashCode())) * 31) + dikv.a(this.d)) * 31) + dikv.a(this.e)) * 31;
        dike dikeVar = this.f;
        return iHashCode2 + (dikeVar != null ? dikeVar.hashCode() : 0);
    }

    public final String toString() {
        return "Info(name=" + this.a + ", image=" + this.b + ", contentDescription=" + this.g + ", statusUiData=" + this.c + ", enableInBubbleReadReceipts=" + this.d + ", disableNewTimestampsForTalkback=" + this.e + ", renderListener=" + this.f + ")";
    }
}
