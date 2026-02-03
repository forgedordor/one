package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum envd implements evst {
    UNKNOWN_INTENT_SOURCE(0),
    SHARE_INTENT(1),
    FORWARD(2),
    SNAP_IT(3);

    public final int e;

    envd(int i) {
        this.e = i;
    }

    public static envd b(int i) {
        if (i == 0) {
            return UNKNOWN_INTENT_SOURCE;
        }
        if (i == 1) {
            return SHARE_INTENT;
        }
        if (i == 2) {
            return FORWARD;
        }
        if (i != 3) {
            return null;
        }
        return SNAP_IT;
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
