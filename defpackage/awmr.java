package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awmr {
    public final awmv a;
    public final Set b;

    public awmr(awmv awmvVar, Set set) {
        this.a = awmvVar;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awmr)) {
            return false;
        }
        awmr awmrVar = (awmr) obj;
        return fdbq.f(this.a, awmrVar.a) && fdbq.f(this.b, awmrVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "GroupData(details=" + this.a + ", members=" + this.b + ")";
    }
}
