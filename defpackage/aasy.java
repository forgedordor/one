package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aasy extends aate {
    private final boolean a;

    public aasy(boolean z) {
        this.a = z;
    }

    @Override // defpackage.aate
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof aate) && this.a == ((aate) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "ChangeAllSelectionEvent{selected=" + this.a + "}";
    }
}
