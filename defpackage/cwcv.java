package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwcv {
    public final dkri a;
    public final cwcu b;

    public cwcv(dkri dkriVar, cwcu cwcuVar) {
        this.a = dkriVar;
        this.b = cwcuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwcv)) {
            return false;
        }
        cwcv cwcvVar = (cwcv) obj;
        return fdbq.f(this.a, cwcvVar.a) && fdbq.f(this.b, cwcvVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AvatarUiData(avatar=" + this.a + ", flags=" + this.b + ")";
    }
}
