package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgha {
    public final dggn a;
    public final dggk b;
    public final int c;

    public dgha(dggn dggnVar, dggk dggkVar, int i) {
        this.a = dggnVar;
        this.b = dggkVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgha)) {
            return false;
        }
        dgha dghaVar = (dgha) obj;
        return fdbq.f(this.a, dghaVar.a) && fdbq.f(this.b, dghaVar.b) && dggr.b(this.c, dghaVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        dggk dggkVar = this.b;
        return ((iHashCode + (dggkVar == null ? 0 : dggkVar.hashCode())) * 31) + this.c;
    }

    public final String toString() {
        return "IdentityMappingInfo(rcsProvisioningId=" + this.a + ", phoneNumber=" + this.b + ", subscriptionId=" + dggr.a(this.c) + ")";
    }
}
