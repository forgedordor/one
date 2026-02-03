package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzrj extends dzrl {
    private final int a;
    private final boolean b;
    private final ejwi c;
    private final int d;

    public dzrj(int i, int i2, boolean z, ejwi ejwiVar) {
        this.d = i;
        this.a = i2;
        this.b = z;
        this.c = ejwiVar;
    }

    @Override // defpackage.dzrl
    public final int d() {
        return this.a;
    }

    @Override // defpackage.dzrl
    public final ejwi e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzrl) {
            dzrl dzrlVar = (dzrl) obj;
            if (this.d == dzrlVar.g() && this.a == dzrlVar.d()) {
                dzrlVar.h();
                if (this.b == dzrlVar.f() && this.c.equals(dzrlVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.dzrl
    public final boolean f() {
        return this.b;
    }

    @Override // defpackage.dzrl
    public final int g() {
        return this.d;
    }

    public final int hashCode() {
        return (((true != this.b ? 1237 : 1231) ^ ((((this.d ^ 1000003) * 1000003) ^ this.a) * (-721379959))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "NetworkConfigurations{enablement=" + dzjw.a(this.d) + ", batchSize=" + this.a + ", urlSanitizer=null, enableUrlAutoSanitization=" + this.b + ", metricExtensionProvider=" + String.valueOf(this.c) + "}";
    }

    @Override // defpackage.dzrl
    public final void h() {
    }
}
