package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum ezsc implements evst {
    UNKNOWN_JOIN_BY_LINK_POLICY(0),
    NO_JOIN_BY_LINK_ALLOWED(1),
    JOIN_BY_LINK_ALLOWED(2),
    UNRECOGNIZED(-1);

    private final int f;

    ezsc(int i) {
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
