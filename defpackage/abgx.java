package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum abgx implements evst {
    UNKNOWN(0),
    REMOTE(1),
    STANDALONE(2),
    UNRECOGNIZED(-1);

    private final int f;

    abgx(int i) {
        this.f = i;
    }

    public static abgx b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return REMOTE;
        }
        if (i != 2) {
            return null;
        }
        return STANDALONE;
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
