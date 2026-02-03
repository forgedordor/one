package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum etlr implements evst {
    BUTTONS_ORDER_UNSPECIFIED(0),
    ACTION_BUTTON_PRIMARY(1),
    ACK_BUTTON_PRIMARY(2);

    public final int d;

    etlr(int i) {
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
