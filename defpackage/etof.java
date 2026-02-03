package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum etof implements evst {
    UNKNOWN(0),
    ABOVE(1),
    BELOW(2);

    public final int d;

    etof(int i) {
        this.d = i;
    }

    public static etof b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ABOVE;
        }
        if (i != 2) {
            return null;
        }
        return BELOW;
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
