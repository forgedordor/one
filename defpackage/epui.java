package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum epui implements evst {
    PENDING_REASON_UNKNOWN(0),
    PENDING_REASON_GROUP_LOCKED_FOR_SELF_HEAL(1),
    PENDING_REASON_KEY_REFRESH_REQUIRED(2),
    PENDING_REASON_COMMIT_REQUIRED(3),
    PENDING_REASON_GROUP_NOT_FOUND(4),
    UNRECOGNIZED(-1);

    private final int h;

    epui(int i) {
        this.h = i;
    }

    public static epui b(int i) {
        if (i == 0) {
            return PENDING_REASON_UNKNOWN;
        }
        if (i == 1) {
            return PENDING_REASON_GROUP_LOCKED_FOR_SELF_HEAL;
        }
        if (i == 2) {
            return PENDING_REASON_KEY_REFRESH_REQUIRED;
        }
        if (i == 3) {
            return PENDING_REASON_COMMIT_REQUIRED;
        }
        if (i != 4) {
            return null;
        }
        return PENDING_REASON_GROUP_NOT_FOUND;
    }

    @Override // defpackage.evst
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
