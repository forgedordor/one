package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum etns implements evst {
    UNSPECIFIED(0),
    LIGHT(1),
    DARK(2);

    public final int d;

    etns(int i) {
        this.d = i;
    }

    public static etns b(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return LIGHT;
        }
        if (i != 2) {
            return null;
        }
        return DARK;
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
