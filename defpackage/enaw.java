package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum enaw implements evst {
    UNKNOWN_MESSAGE_RECEIPT_TYPE(0),
    DELIVERY(1),
    DISPLAY(2),
    PROCESSING(3),
    INTERWORKING(4);

    public final int f;

    enaw(int i) {
        this.f = i;
    }

    @Override // defpackage.evst
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
