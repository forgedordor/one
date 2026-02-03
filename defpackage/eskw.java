package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eskw implements esex {
    UNKNOWN(0),
    DATA_MESSAGE(1),
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);

    private final int f;

    eskw(int i) {
        this.f = i;
    }

    @Override // defpackage.esex
    public final int a() {
        return this.f;
    }
}
