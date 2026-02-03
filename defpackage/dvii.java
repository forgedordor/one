package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvii extends dvit {
    private final int a;

    public dvii(int i) {
        this.a = i;
    }

    @Override // defpackage.dvit
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof dvit) && this.a == ((dvit) obj).a();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        int i = this.a;
        return a.a(i != 1 ? i != 2 ? i != 3 ? "NEED_VERIFY" : "FAILURE" : "SUCCESS" : "UNKNOWN", "RegisterResult{status=", "}");
    }
}
