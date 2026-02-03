package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chcr implements chda {
    private final int a = 1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chcr)) {
            return false;
        }
        int i = ((chcr) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return "IdentityLookup(error=RCS_NOT_AVAILABLE)";
    }
}
