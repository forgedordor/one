package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chcs implements chda {
    private final int a;

    public chcs(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chcs) && this.a == ((chcs) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Preconditions(error=");
        int i = this.a;
        sb.append((Object) (i != 1 ? i != 2 ? "IDENTITY_NOT_PART_OF_GROUP" : "IDENTITY_NOT_RCS" : "IDENTITY_NOT_ACTIVE"));
        sb.append(")");
        return sb.toString();
    }
}
