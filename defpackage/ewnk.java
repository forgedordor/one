package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ewnk implements evst {
    SIP_TRANSPORT_EVENT_TYPE_UNKNOWN(0),
    SIP_TRANSPORT_EVENT_TYPE_ERROR(1);

    public final int c;

    ewnk(int i) {
        this.c = i;
    }

    public static ewnk b(int i) {
        if (i == 0) {
            return SIP_TRANSPORT_EVENT_TYPE_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return SIP_TRANSPORT_EVENT_TYPE_ERROR;
    }

    @Override // defpackage.evst
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
