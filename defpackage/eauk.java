package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eauk extends eavk {
    private final List a;

    public eauk(List list) {
        if (list == null) {
            throw new NullPointerException("Null placeLikelihoods");
        }
        this.a = list;
    }

    @Override // defpackage.eavk
    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eavk) {
            return this.a.equals(((eavk) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "FindCurrentPlaceResponse{placeLikelihoods=" + this.a.toString() + "}";
    }
}
