package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum cdap implements evst {
    UNSPECIFIED_APP(0),
    DIALER_APP(1),
    UNRECOGNIZED(-1);

    private final int e;

    cdap(int i) {
        this.e = i;
    }

    public static cdap b(int i) {
        if (i == 0) {
            return UNSPECIFIED_APP;
        }
        if (i != 1) {
            return null;
        }
        return DIALER_APP;
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
