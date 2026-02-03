package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ewnt implements evst {
    SOCKET_PROTOCOL_TYPE_UNKNOWN(0),
    SOCKET_PROTOCOL_TYPE_UDP(1),
    SOCKET_PROTOCOL_TYPE_TCP(2),
    SOCKET_PROTOCOL_TYPE_TLS(3);

    public final int e;

    ewnt(int i) {
        this.e = i;
    }

    @Override // defpackage.evst
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
