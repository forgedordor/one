package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzuj extends dzuq {
    public int a;
    public boolean b;
    public byte c;
    public int d;
    public dzur e;

    @Override // defpackage.dzuq
    public final dzus a() {
        int i;
        dzur dzurVar;
        if (this.c == 7 && (i = this.d) != 0 && (dzurVar = this.e) != null) {
            return new dzuk(i, this.a, dzurVar, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" enablement");
        }
        if ((this.c & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if (this.e == null) {
            sb.append(" dynamicSampler");
        }
        if ((this.c & 2) == 0) {
            sb.append(" recordTimerDuration");
        }
        if ((this.c & 4) == 0) {
            sb.append(" sendEmptyTraces");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzuq
    public final dzuq b(int i) {
        this.d = i;
        return this;
    }
}
