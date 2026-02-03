package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddas extends ddau {
    public String a;
    public String b;
    private int c;
    private byte d;

    @Override // defpackage.ddau
    public final ddav a() {
        if (this.d == 1 && this.a != null && this.b != null) {
            return new ddat(this.a, this.c, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" hostName");
        }
        if (this.d == 0) {
            sb.append(" hostPort");
        }
        if (this.b == null) {
            sb.append(" apiKey");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ddau
    public final void b() {
        this.c = 443;
        this.d = (byte) 1;
    }
}
