package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzot extends dzpg {
    public int a;
    public byte b;
    public int c;

    @Override // defpackage.dzpg
    public final dzph a() {
        int i;
        if (this.b == 3 && (i = this.c) != 0) {
            return new dzou(i, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" enablement");
        }
        if ((this.b & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if ((this.b & 2) == 0) {
            sb.append(" perfettoMustBeExplicitlyTriggered");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzpg
    public final dzpg b(int i) {
        this.c = i;
        return this;
    }
}
