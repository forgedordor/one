package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eqkj implements evst {
    ENCRYPTION_STATE_UNSPECIFIED(0),
    ENCRYPTION_STATE_ENCRYPTED(1),
    ENCRYPTION_STATE_NOT_ENCRYPTED(2),
    UNRECOGNIZED(-1);

    private final int f;

    eqkj(int i) {
        this.f = i;
    }

    @Override // defpackage.evst
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
