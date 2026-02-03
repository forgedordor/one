package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum emfv implements evst {
    UNKNOWN_CONTENT_TYPE(0),
    TEXT(1),
    ATTACHMENT(2),
    READ_RECEIPT(3);

    public final int e;

    emfv(int i) {
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
