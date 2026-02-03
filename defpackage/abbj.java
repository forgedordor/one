package defpackage;

import defpackage.abbp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abbj extends abbp.a {
    private final abbo a;

    public abbj(abbo abboVar) {
        this.a = abboVar;
    }

    @Override // abbp.a
    public final abbo a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abbp.a) {
            return this.a.equals(((abbp.a) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "TakeBugReportRequestEvent{eventData=" + this.a.toString() + "}";
    }
}
