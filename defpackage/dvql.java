package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvql extends dvqy {
    private final int a;
    private final ejwi b;
    private final ejwi c;

    public dvql(int i, ejwi ejwiVar, ejwi ejwiVar2) {
        this.a = i;
        this.b = ejwiVar;
        this.c = ejwiVar2;
    }

    @Override // defpackage.dvqy
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dvqy
    public final ejwi b() {
        return this.c;
    }

    @Override // defpackage.dvqy
    public final ejwi c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvqy) {
            dvqy dvqyVar = (dvqy) obj;
            if (this.a == dvqyVar.a() && this.b.equals(dvqyVar.c()) && this.c.equals(dvqyVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ejwi ejwiVar = this.c;
        return "RegistrationResult{status=" + this.a + ", unsavedAccountContext=" + String.valueOf(this.b) + ", authToken=" + String.valueOf(ejwiVar) + "}";
    }
}
