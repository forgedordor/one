package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhcs extends fezk {
    private final feyt a;
    private final long b;

    public fhcs(feyt feytVar, long j) {
        this.a = feytVar;
        this.b = j;
    }

    @Override // defpackage.fezk
    public final long a() {
        return this.b;
    }

    @Override // defpackage.fezk
    public final feyt b() {
        return this.a;
    }

    @Override // defpackage.fezk
    public final fffb c() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
