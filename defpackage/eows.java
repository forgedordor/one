package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eows implements evst {
    UNKNOWN_CONVERSATION_TYPE(0),
    XMS(1),
    RCS(2),
    UNRECOGNIZED(-1);

    private final int f;

    eows(int i) {
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
