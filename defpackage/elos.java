package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum elos implements evst {
    UNKNOWN_PRIORITY(0),
    LOW_PRIORITY(1),
    NORMAL_PRIORITY(2),
    HIGH_PRIORITY(3);

    public final int e;

    elos(int i) {
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
