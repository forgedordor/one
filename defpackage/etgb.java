package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum etgb implements evst {
    ANDROID_PERMISSION_STATE_UNSPECIFIED(0),
    ANDROID_PERMISSION_STATE_AUTHORIZED(1),
    ANDROID_PERMISSION_STATE_DENIED(2),
    UNRECOGNIZED(-1);

    private final int f;

    etgb(int i) {
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
