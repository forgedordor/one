package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vzn {
    public final aokl a;
    public final ajna b;
    public final String c;

    public vzn(aokl aoklVar, ajna ajnaVar, String str) {
        this.a = aoklVar;
        this.b = ajnaVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzn)) {
            return false;
        }
        vzn vznVar = (vzn) obj;
        return fdbq.f(this.a, vznVar.a) && this.b == vznVar.b && fdbq.f(this.c, vznVar.c);
    }

    public final int hashCode() {
        aokl aoklVar = this.a;
        int iHashCode = ((aoklVar == null ? 0 : aoklVar.hashCode()) * 31) + this.b.hashCode();
        String str = this.c;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "SimpleMessagePropertiesData(simpleMessagePropertiesProvider=" + this.a + ", bestAvailableTransportFeatureSet=" + this.b + ", draftText=" + this.c + ")";
    }
}
