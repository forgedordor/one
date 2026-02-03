package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum evlw implements evst {
    ALIGNMENT_UNSPECIFIED(0),
    TRAILING(1),
    CENTER(2);

    private final int e;

    evlw(int i) {
        this.e = i;
    }

    public static evlw b(int i) {
        if (i == 0) {
            return ALIGNMENT_UNSPECIFIED;
        }
        if (i == 1) {
            return TRAILING;
        }
        if (i != 2) {
            return null;
        }
        return CENTER;
    }

    @Override // defpackage.evst
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
