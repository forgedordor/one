package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aded extends adef {
    public final boolean a;

    public aded(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aded) && this.a == ((aded) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "UserSignedIn(useAnimation=" + this.a + ")";
    }
}
