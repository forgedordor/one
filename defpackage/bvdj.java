package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum bvdj implements evst {
    UNKNOWN_WORKER(0),
    PHONE_NUMBER_NORMALIZATION(1),
    PARTICIPANTS_TABLE_MY_IDENTITY(2),
    MY_IDENTITY_FOREIGN_KEY(3),
    MY_IDENTITY_ADDRESS_DEDUPER(4),
    UNRECOGNIZED(-1);

    private final int h;

    bvdj(int i) {
        this.h = i;
    }

    public static bvdj b(int i) {
        if (i == 0) {
            return UNKNOWN_WORKER;
        }
        if (i == 1) {
            return PHONE_NUMBER_NORMALIZATION;
        }
        if (i == 2) {
            return PARTICIPANTS_TABLE_MY_IDENTITY;
        }
        if (i == 3) {
            return MY_IDENTITY_FOREIGN_KEY;
        }
        if (i != 4) {
            return null;
        }
        return MY_IDENTITY_ADDRESS_DEDUPER;
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
