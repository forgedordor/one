package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum epjt implements evst {
    UNKNOWN_CONVERSATION_TYPE(0),
    CONVERSATION_TYPE_ONE_ON_ONE(1),
    CONVERSATION_TYPE_GROUP_XMS(2),
    CONVERSATION_TYPE_GROUP_RCS(3),
    UNRECOGNIZED(-1);

    private final int g;

    epjt(int i) {
        this.g = i;
    }

    @Override // defpackage.evst
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
