package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eskv implements esex {
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    MESSAGE_OPEN(2);

    private final int e;

    eskv(int i) {
        this.e = i;
    }

    @Override // defpackage.esex
    public final int a() {
        return this.e;
    }
}
