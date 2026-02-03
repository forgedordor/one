package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzul extends dzuu {
    public float a;
    public byte b;
    public int c;

    @Override // defpackage.dzuu
    public final dzuv a() {
        int i;
        if (this.b == 1 && (i = this.c) != 0) {
            return new dzum(i, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" enablement");
        }
        if (this.b == 0) {
            sb.append(" samplingProbability");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzuu
    public final dzuu b(int i) {
        this.c = i;
        return this;
    }
}
