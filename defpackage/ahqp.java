package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ahqp implements evst {
    UNSPECIFIED(0),
    REPLIED_TO_MESSAGE_NOT_FOUND(1),
    UNRECOGNIZED(-1);

    private final int e;

    ahqp(int i) {
        this.e = i;
    }

    public static ahqp b(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return REPLIED_TO_MESSAGE_NOT_FOUND;
    }

    @Override // defpackage.evst
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
