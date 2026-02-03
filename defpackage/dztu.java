package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dztu extends dzty {
    public ejwi a = ejud.a;
    public int b;
    private int c;
    private float d;
    private byte e;

    @Override // defpackage.dzty
    public final dztz a() {
        int i;
        if (this.e == 3 && (i = this.b) != 0) {
            return new dztv(i, this.c, this.d, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" enablement");
        }
        if ((this.e & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if ((this.e & 2) == 0) {
            sb.append(" samplingProbability");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzty
    public final dzty b(int i) {
        this.b = i;
        return this;
    }

    @Override // defpackage.dzty
    public final void c(int i) {
        this.c = i;
        this.e = (byte) (this.e | 1);
    }

    @Override // defpackage.dzty
    public final void d(float f) {
        this.d = f;
        this.e = (byte) (this.e | 2);
    }
}
