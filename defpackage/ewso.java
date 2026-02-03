package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ewso implements evst {
    UNKNOWN_SUPER_SORT_CATEGORY(0),
    PERSONAL(1),
    TRANSACTION(2),
    PROMOTION(3),
    UPDATE(4),
    OTP(5),
    BUSINESS_UPDATE(7),
    UNRECOGNIZED(-1);

    private final int j;

    ewso(int i2) {
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
