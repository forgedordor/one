package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chcu implements chda {
    private final int a = 1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chcu)) {
            return false;
        }
        int i = ((chcu) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return "UpdateLocalState(error=UPDATE_STATE_NOT_PERSISTED)";
    }
}
