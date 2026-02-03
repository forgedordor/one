package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
class astf extends asts {
    public final asva a;
    private final Instant c;

    public astf(asva asvaVar, Instant instant) {
        if (asvaVar == null) {
            throw new NullPointerException("Null rcsCapabilities");
        }
        this.a = asvaVar;
        if (instant == null) {
            throw new NullPointerException("Null lastRefreshTimestamp");
        }
        this.c = instant;
    }

    @Override // defpackage.asts
    public final asva a() {
        return this.a;
    }

    @Override // defpackage.asts
    public final Instant b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof asts) {
            asts astsVar = (asts) obj;
            if (this.a.equals(astsVar.a()) && this.c.equals(astsVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }
}
