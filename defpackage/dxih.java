package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxih {
    public final evih a;
    public final int b;

    public dxih(evih evihVar, int i) {
        this.a = evihVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxih)) {
            return false;
        }
        dxih dxihVar = (dxih) obj;
        return fdbq.f(this.a, dxihVar.a) && this.b == dxihVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtractedPayloadData(androidPayload=");
        sb.append(this.a);
        sb.append(", pushPayloadType=");
        int i = this.b;
        sb.append((Object) (i != 1 ? i != 2 ? "PLACEHOLDER" : "ENCRYPTED" : "CLEARTEXT"));
        sb.append(")");
        return sb.toString();
    }
}
