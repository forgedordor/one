package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyes extends dyfd {
    private final dyfc a;

    public dyes(dyfc dyfcVar) {
        this.a = dyfcVar;
    }

    @Override // defpackage.dyfd
    public final dyfc a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyfd) {
            return this.a.equals(((dyfd) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "CardRetrieverWrapper{cardRetriever=" + this.a.toString() + "}";
    }
}
