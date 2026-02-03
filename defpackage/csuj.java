package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum csuj implements evst {
    UNKNOWN_TYPE(0),
    NOT_YET_KNOWN(1),
    RCS(2),
    C11N(3),
    C11N_RCS(4),
    UNRECOGNIZED(-1);

    private final int h;

    csuj(int i) {
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
