package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rwl extends rxt {
    public static final rwl a = new rwl(0);
    public final int b;

    public rwl(int i) {
        this.b = i;
    }

    public final String toString() {
        return String.format("#%06x", Integer.valueOf(this.b));
    }
}
