package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwml extends dwjs {
    public dwjt a;
    private ekgb b;
    private Instant c;
    private Instant d;

    @Override // defpackage.dwjs
    public final dwju a() {
        if (this.b != null && this.c != null && this.d != null && this.a != null) {
            return new dwmm(this.b, this.c, this.d, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" tachyonToken");
        }
        if (this.c == null) {
            sb.append(" expireAt");
        }
        if (this.d == null) {
            sb.append(" refreshedAt");
        }
        if (this.a == null) {
            sb.append(" oneOfId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwjs
    public final void b(Instant instant) {
        if (instant == null) {
            throw new NullPointerException("Null expireAt");
        }
        this.c = instant;
    }

    @Override // defpackage.dwjs
    public final void c(dwjt dwjtVar) {
        this.a = dwjtVar;
    }

    @Override // defpackage.dwjs
    public final void d(Instant instant) {
        if (instant == null) {
            throw new NullPointerException("Null refreshedAt");
        }
        this.d = instant;
    }

    @Override // defpackage.dwjs
    public final void e(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null tachyonToken");
        }
        this.b = ekgbVar;
    }
}
