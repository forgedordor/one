package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtjr {
    public final kca a;

    public dtjr(kca kcaVar) {
        this.a = kcaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dtjr) && fdbq.f(this.a, ((dtjr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GoogleSansFlexConfig(variationSettings=" + this.a + ")";
    }
}
