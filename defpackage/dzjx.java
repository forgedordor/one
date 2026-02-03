package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzjx extends dzkc {
    public byte a;
    public int b;
    private dzke c;

    @Override // defpackage.dzkc
    public final dzkd a() {
        int i;
        dzke dzkeVar;
        if (this.a == 1 && (i = this.b) != 0 && (dzkeVar = this.c) != null) {
            return new dzjy(i, dzkeVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" enablement");
        }
        if (this.a == 0) {
            sb.append(" chargeCounterEnabled");
        }
        if (this.c == null) {
            sb.append(" metricExtensionProvider");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzkc
    public final dzkc b(int i) {
        this.b = i;
        return this;
    }

    @Override // defpackage.dzkc
    public final void c(dzke dzkeVar) {
        if (dzkeVar == null) {
            throw new NullPointerException("Null metricExtensionProvider");
        }
        this.c = dzkeVar;
    }
}
