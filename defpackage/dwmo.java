package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwmo extends dwov {
    private final boolean a;

    public dwmo(boolean z) {
        this.a = z;
    }

    @Override // defpackage.dwov
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof dwov) && this.a == ((dwov) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "Block{blocked=" + this.a + "}";
    }
}
