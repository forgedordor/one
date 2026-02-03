package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eptc implements evst {
    IMDN_UNSPECIFIED(0),
    IMDN_UNAVAILABLE(1),
    IMDN_DELIVERED(2),
    IMDN_READ(3),
    IMDN_FAILED_TO_DECRYPT(4),
    UNRECOGNIZED(-1);

    private final int h;

    eptc(int i) {
        this.h = i;
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
