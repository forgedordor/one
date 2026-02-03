package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvqc extends dvqp {
    private final ejwi a;
    private final int b;

    public dvqc(int i, ejwi ejwiVar) {
        this.b = i;
        this.a = ejwiVar;
    }

    @Override // defpackage.dvqp
    public final ejwi a() {
        return this.a;
    }

    @Override // defpackage.dvqp
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvqp) {
            dvqp dvqpVar = (dvqp) obj;
            if (this.b == dvqpVar.b() && this.a.equals(dvqpVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "GetProfileResult{status=" + (this.b != 1 ? "SUCCESS" : "UNSUPPORTED") + ", profileInfo=" + String.valueOf(this.a) + "}";
    }
}
