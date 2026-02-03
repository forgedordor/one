package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class eapf extends eatq {
    public final List a;

    public eapf(List list) {
        if (list == null) {
            throw new NullPointerException("Null legs");
        }
        this.a = list;
    }

    @Override // defpackage.eatq
    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eatq) {
            return this.a.equals(((eatq) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RoutingSummary{legs=" + this.a.toString() + "}";
    }
}
