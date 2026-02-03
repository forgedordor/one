package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvik extends dviv {
    private final int a;

    public dvik(int i) {
        this.a = i;
    }

    @Override // defpackage.dviv
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof dviv) && this.a == ((dviv) obj).a();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        return a.a(this.a != 1 ? "FAILURE" : "SUCCESS", "UnregisterResult{status=", "}");
    }
}
