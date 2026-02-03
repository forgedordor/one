package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aata extends aaum {
    private final int a;

    public aata(int i) {
        this.a = i;
    }

    @Override // defpackage.aaum
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof aaum) && this.a == ((aaum) obj).a();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        return a.a(Integer.toString(this.a - 1), "EndActivityEvent{status=", "}");
    }
}
