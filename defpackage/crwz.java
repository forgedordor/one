package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum crwz implements evst {
    UNSUBSCRIBE_REASON_UNSPECIFIED(0),
    OTHER(1),
    NOT_SIGNED_UP(2),
    NO_INTEREST(3),
    SPAM(4),
    TOO_MANY_MESSAGES(5),
    UNRECOGNIZED(-1);

    private final int i;

    crwz(int i) {
        this.i = i;
    }

    @Override // defpackage.evst
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
