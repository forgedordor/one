package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cqph extends cqpw {
    private final List a;

    public cqph(List list) {
        if (list == null) {
            throw new NullPointerException("Null results");
        }
        this.a = list;
    }

    @Override // defpackage.cqpw
    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqpw) {
            return this.a.equals(((cqpw) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "TenorSearchResponse{results=" + this.a.toString() + "}";
    }
}
