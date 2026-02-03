package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eugz extends eulc {
    private final int a;

    public eugz(int i) {
        this.a = i;
    }

    @Override // defpackage.eulc
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof eulc) && this.a == ((eulc) obj).a();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        return "Permissions{readContacts=" + this.a + "}";
    }
}
