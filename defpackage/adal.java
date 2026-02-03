package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adal {
    public final rbr a;
    public final rbr b;

    public adal() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adal)) {
            return false;
        }
        adal adalVar = (adal) obj;
        return fdbq.f(this.a, adalVar.a) && fdbq.f(this.b, adalVar.b);
    }

    public final int hashCode() {
        rbr rbrVar = this.a;
        int iHashCode = rbrVar == null ? 0 : rbrVar.hashCode();
        rbr rbrVar2 = this.b;
        return (iHashCode * 31) + (rbrVar2 != null ? rbrVar2.hashCode() : 0);
    }

    public final String toString() {
        return "AvatarViewPartUiData(glideRequestBuilder=" + this.a + ", glideFallbackRequestBuilder=" + this.b + ")";
    }

    public adal(rbr rbrVar, rbr rbrVar2) {
        this.a = rbrVar;
        this.b = rbrVar2;
    }

    public /* synthetic */ adal(byte[] bArr) {
        this(null, null);
    }
}
