package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum elyq implements evst {
    UNKNOWN_PROVISIONING_STATE(0),
    PROVISIONED(1),
    NOT_PROVISIONED(2),
    DISABLED(3),
    NOT_PROVISIONED_BUT_INITIALIZED(4),
    ERROR(5);

    public final int g;

    elyq(int i) {
        this.g = i;
    }

    @Override // defpackage.evst
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
