package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfef extends dfej {
    private int a;
    private Duration b;
    private byte c;

    @Override // defpackage.dfej
    public final dfek a() {
        if (this.c == 1 && this.b != null) {
            return new dfeg(this.a, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" type");
        }
        if (this.b == null) {
            sb.append(" retryAfter");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dfej
    public final void b(Duration duration) {
        if (duration == null) {
            throw new NullPointerException("Null retryAfter");
        }
        this.b = duration;
    }

    @Override // defpackage.dfej
    public final void c(int i) {
        this.a = i;
        this.c = (byte) 1;
    }
}
