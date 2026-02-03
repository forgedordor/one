package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum evmr implements evst {
    PULSE_ANIMATION_TYPE_UNSPECIFIED(0),
    PULSE_WITH_INNER_CIRCLE(1),
    PULSE(2);

    private final int e;

    evmr(int i) {
        this.e = i;
    }

    public static evmr b(int i) {
        if (i == 0) {
            return PULSE_ANIMATION_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return PULSE_WITH_INNER_CIRCLE;
        }
        if (i != 2) {
            return null;
        }
        return PULSE;
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
