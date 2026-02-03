package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eiqd extends eiqp {
    private final Optional a;

    public eiqd(Optional optional) {
        this.a = optional;
    }

    @Override // defpackage.eiqp
    public final Optional a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eiqp) {
            return this.a.equals(((eiqp) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Output{executionStatus=" + String.valueOf(this.a) + "}";
    }
}
