package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum evlt implements evst {
    BUTTONS_ORDER_UNSPECIFIED(0),
    ACTION_BUTTON_PRIMARY(1),
    ACK_BUTTON_PRIMARY(2);

    private final int e;

    evlt(int i) {
        this.e = i;
    }

    public static evlt b(int i) {
        if (i == 0) {
            return BUTTONS_ORDER_UNSPECIFIED;
        }
        if (i == 1) {
            return ACTION_BUTTON_PRIMARY;
        }
        if (i != 2) {
            return null;
        }
        return ACK_BUTTON_PRIMARY;
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
