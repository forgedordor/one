package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xhp implements xhq {
    public final Instant a;

    public xhp(Instant instant) {
        this.a = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xhp) && fdbq.f(this.a, ((xhp) obj).a);
    }

    public final int hashCode() {
        Instant instant = this.a;
        if (instant == null) {
            return 0;
        }
        return instant.hashCode();
    }

    public final String toString() {
        return "Succeeded(instantShown=" + this.a + ")";
    }
}
