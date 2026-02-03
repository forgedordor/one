package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dtlz implements evst {
    UNSPECIFIED(0),
    DOWNLOADED(1),
    PENDING(2),
    PENDING_CUSTOM_VALIDATION(3);

    public final int e;

    dtlz(int i) {
        this.e = i;
    }

    public static dtlz b(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return DOWNLOADED;
        }
        if (i == 2) {
            return PENDING;
        }
        if (i != 3) {
            return null;
        }
        return PENDING_CUSTOM_VALIDATION;
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
