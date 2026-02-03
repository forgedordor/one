package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum elys implements evst {
    UNKNOWN_PREKEY_STATE(0),
    SUFFICIENT_PREKEYS(1),
    LOW_PREKEYS(2);

    public final int d;

    elys(int i) {
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
