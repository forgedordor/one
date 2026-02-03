package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum evgr implements evst {
    APP_BLOCK_STATE_UNKNOWN(0),
    ALLOWED(1),
    BANNED(2);

    public final int d;

    evgr(int i) {
        this.d = i;
    }

    public static evgr b(int i) {
        if (i == 0) {
            return APP_BLOCK_STATE_UNKNOWN;
        }
        if (i == 1) {
            return ALLOWED;
        }
        if (i != 2) {
            return null;
        }
        return BANNED;
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
