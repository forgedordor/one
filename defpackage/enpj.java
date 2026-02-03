package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum enpj implements evst {
    UNKNOWN_PROTOCOL(0),
    SCYTALE_PROTOCOL(1),
    MLS_PROTOCOL(2);

    public final int d;

    enpj(int i) {
        this.d = i;
    }

    public static enpj b(int i) {
        if (i == 0) {
            return UNKNOWN_PROTOCOL;
        }
        if (i == 1) {
            return SCYTALE_PROTOCOL;
        }
        if (i != 2) {
            return null;
        }
        return MLS_PROTOCOL;
    }

    @Override // defpackage.evst
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
