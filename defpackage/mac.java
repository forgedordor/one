package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mac {
    public static final mac a = mab.a(0, 1);
    public final int b;
    public final int c = 1;
    private maa d;

    static {
        mgb.O(0);
        mgb.O(1);
        mgb.O(2);
        mgb.O(3);
        mgb.O(4);
    }

    public mac(int i, int i2) {
        this.b = i;
    }

    public final maa a() {
        if (this.d == null) {
            this.d = new maa(this);
        }
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.b == ((mac) obj).b;
    }

    public final int hashCode() {
        return (((((this.b + 527) * 961) + 1) * 31) + 1) * 31;
    }
}
