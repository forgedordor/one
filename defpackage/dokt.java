package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dokt implements evst {
    ORIENTATION_UNKNOWN(0),
    PORTRAIT(1),
    LANDSCAPE(2),
    UNRECOGNIZED(-1);

    private final int f;

    dokt(int i) {
        this.f = i;
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
