package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgyf extends dgyz {
    private int a;
    private int b;
    private Duration c;
    private byte d;

    @Override // defpackage.dgyz
    public final dgza a() {
        if (this.d == 3 && this.c != null) {
            return new dgyg(this.a, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" type");
        }
        if ((this.d & 2) == 0) {
            sb.append(" reason");
        }
        if (this.c == null) {
            sb.append(" retryAfter");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dgyz
    public final void b(int i) {
        this.b = i;
        this.d = (byte) (this.d | 2);
    }

    @Override // defpackage.dgyz
    public final void c(Duration duration) {
        if (duration == null) {
            throw new NullPointerException("Null retryAfter");
        }
        this.c = duration;
    }

    @Override // defpackage.dgyz
    public final void d(int i) {
        this.a = i;
        this.d = (byte) (this.d | 1);
    }
}
