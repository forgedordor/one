package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaub extends eavb {
    private final eatj a;

    public eaub(eatj eatjVar) {
        this.a = eatjVar;
    }

    @Override // defpackage.eavb
    public final eatj a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eavb) {
            return this.a.equals(((eavb) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "FetchPlaceResponse{place=" + this.a.toString() + "}";
    }
}
