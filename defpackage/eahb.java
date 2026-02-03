package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum eahb implements evst {
    UNKNOWN(0),
    SIGNED_OUT(1),
    SIGNED_IN_SETUP_PENDING(2),
    SIGNED_IN_SETUP_COMPLETE(3),
    UNRECOGNIZED(-1);

    private final int g;

    eahb(int i) {
        this.g = i;
    }

    @Override // defpackage.evst
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
