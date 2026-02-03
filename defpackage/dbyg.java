package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbyg extends dbzx {
    public final Instant a;

    public dbyg(Instant instant) {
        if (instant == null) {
            throw new NullPointerException("Null eventTime");
        }
        this.a = instant;
    }

    @Override // defpackage.dbzx
    public final Instant a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dbzx) {
            return this.a.equals(((dbzx) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "LogSamplerProperties{eventTime=" + this.a.toString() + "}";
    }
}
