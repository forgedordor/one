package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwnh extends dwqb {
    private ekgb a;
    private ekgb b;

    @Override // defpackage.dwqb
    public final dwqc a() {
        if (this.a != null && this.b != null) {
            return new dwni(this.a, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" decorationIdsToAdd");
        }
        if (this.b == null) {
            sb.append(" decorationIdsToRemove");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwqb
    public final void b(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null decorationIdsToAdd");
        }
        this.a = ekgbVar;
    }

    @Override // defpackage.dwqb
    public final void c(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null decorationIdsToRemove");
        }
        this.b = ekgbVar;
    }
}
