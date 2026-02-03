package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eauh extends eavh {
    private final List a;

    public eauh(List list) {
        if (list == null) {
            throw new NullPointerException("Null autocompletePredictions");
        }
        this.a = list;
    }

    @Override // defpackage.eavh
    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eavh) {
            return this.a.equals(((eavh) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "FindAutocompletePredictionsResponse{autocompletePredictions=" + this.a.toString() + "}";
    }
}
