package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum evcc implements evst {
    UNSPECIFIED(0),
    TRUE(1),
    FALSE(2);

    public final int d;

    evcc(int i) {
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
