package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aste extends astr {
    private asva a;
    private Instant b;

    @Override // defpackage.astr
    public final asts a() {
        if (this.a != null && this.b != null) {
            return new astg(this.a, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rcsCapabilities");
        }
        if (this.b == null) {
            sb.append(" lastRefreshTimestamp");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.astr
    public final void b(Instant instant) {
        if (instant == null) {
            throw new NullPointerException("Null lastRefreshTimestamp");
        }
        this.b = instant;
    }

    @Override // defpackage.astr
    public final void c(asva asvaVar) {
        if (asvaVar == null) {
            throw new NullPointerException("Null rcsCapabilities");
        }
        this.a = asvaVar;
    }
}
