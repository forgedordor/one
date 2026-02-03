package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum ckbw implements evst {
    CODE_UNKNOWN(0),
    CODE_CONNECTED(2000),
    UNRECOGNIZED(-1);

    private final int e;

    ckbw(int i) {
        this.e = i;
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
