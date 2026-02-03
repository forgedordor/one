package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum evhb implements evst {
    CHANNEL_GROUP_UNKNOWN(0),
    ALLOWED(1),
    BANNED(2);

    public final int d;

    evhb(int i) {
        this.d = i;
    }

    public static evhb b(int i) {
        if (i == 0) {
            return CHANNEL_GROUP_UNKNOWN;
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
