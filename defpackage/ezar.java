package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum ezar implements evst {
    SUGGESTION_TAG_UNSPECIFIED(0),
    SUGGESTION_TAG_BIRTHDAY(1),
    UNRECOGNIZED(-1);

    private final int e;

    ezar(int i) {
        this.e = i;
    }

    @Override // defpackage.evst
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
