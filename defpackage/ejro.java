package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum ejro implements evst {
    UNSET(0),
    OCCURRENCE(8),
    INTEGER(9),
    INTEGER_HISTOGRAM(10),
    STRING(11),
    STRUCT(12),
    UNRECOGNIZED(-1);

    private final int i;

    ejro(int i) {
        this.i = i;
    }

    @Override // defpackage.evst
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
