package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chct implements chda {
    private final int a;

    public chct(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chct) && this.a == ((chct) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnexpectedLinkState(error=");
        sb.append((Object) (this.a != 1 ? "VALID" : "DISABLED"));
        sb.append(")");
        return sb.toString();
    }
}
