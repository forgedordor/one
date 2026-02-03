package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ewms implements evst {
    NETWORK_INTERFACE_AVAILABILITY_UNKNOWN(0),
    NETWORK_INTERFACE_AVAILABILITY_AVAILABLE(1),
    NETWORK_INTERFACE_AVAILABILITY_UNAVAILABLE(2);

    public final int d;

    ewms(int i) {
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
