package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvoc extends cvoe {
    private final cvog a;
    private final cvof b;

    public cvoc(cvog cvogVar, cvof cvofVar) {
        this.a = cvogVar;
        this.b = cvofVar;
    }

    @Override // defpackage.cvoe
    public final cvof a() {
        return this.b;
    }

    @Override // defpackage.cvoe
    public final cvog b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvoe) {
            cvoe cvoeVar = (cvoe) obj;
            if (this.a.equals(cvoeVar.b()) && this.b.equals(cvoeVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        cvof cvofVar = this.b;
        return "CreationParams{bannerFactory=" + this.a.toString() + ", priority=" + cvofVar.toString() + "}";
    }
}
