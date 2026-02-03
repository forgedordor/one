package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum enle implements evst {
    NOISE_CANCELLATION_STATE_UNKNOWN(0),
    NOISE_CANCELLATION_STATE_ENABLED(1),
    NOISE_CANCELLATION_STATE_DISABLED(2);

    public final int d;

    enle(int i) {
        this.d = i;
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
