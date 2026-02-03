package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum evby implements evst {
    CHANNEL_GROUP_STATE_UNKNOWN(0),
    ALLOWED(1),
    BANNED(2);

    public final int d;

    evby(int i) {
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
