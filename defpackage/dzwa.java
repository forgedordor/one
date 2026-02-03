package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzwa extends dzwd {
    private final boolean b;

    public dzwa(fehf fehfVar, boolean z) {
        super(fehfVar);
        this.b = z;
    }

    private final fehf f() {
        return this.b ? this.a : e();
    }

    @Override // defpackage.dzwd
    public final long a(String str) {
        fehf fehfVarF = f();
        if (fehfVarF.equals(fehf.a)) {
            return 1000L;
        }
        return fehfVarF.c;
    }

    @Override // defpackage.dzwd
    public final fehf b(Long l) {
        return this.a;
    }

    @Override // defpackage.dzwd
    public final fehf c(Long l) {
        return f();
    }

    @Override // defpackage.dzwd
    public final boolean d() {
        return this.b;
    }
}
