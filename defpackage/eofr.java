package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eofr implements evst {
    UNKNOWN_USER_ACTION_TYPE(0),
    REPORTED_SPAM(1),
    REPORTED_NOT_SPAM(2),
    BLOCKED(3),
    UNBLOCKED(4),
    DISMISSED_WARNING_BANNER(5),
    DELETED(6),
    UNRECOGNIZED(-1);

    private final int j;

    eofr(int i2) {
        this.j = i2;
    }

    @Override // defpackage.evst
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
