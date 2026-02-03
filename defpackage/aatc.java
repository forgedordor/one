package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aatc extends aauz {
    private final boolean a;

    public aatc(boolean z) {
        this.a = z;
    }

    @Override // defpackage.aauz
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof aauz) && this.a == ((aauz) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "UpdateConfirmButtonEvent{anySelected=" + this.a + "}";
    }
}
