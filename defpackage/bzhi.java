package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzhi extends bzhm {
    public cbog a;
    private byiv b;

    @Override // defpackage.bzhm
    public final bzhn a() {
        cbog cbogVar;
        byiv byivVar = this.b;
        if (byivVar != null && (cbogVar = this.a) != null) {
            return new bzhj(byivVar, cbogVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" scheduledItem");
        }
        if (this.a == null) {
            sb.append(" requestExtras");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.bzhm
    public final void b(byiv byivVar) {
        if (byivVar == null) {
            throw new NullPointerException("Null scheduledItem");
        }
        this.b = byivVar;
    }
}
