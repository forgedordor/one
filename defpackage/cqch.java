package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqch {
    public static float a(float f) {
        ejwl.a(true);
        if (f > 1.0f) {
            return 1.0f;
        }
        if (f < 0.0f) {
            return 0.0f;
        }
        return f;
    }

    public static int b(int i, int i2, int i3) {
        ejwl.a(i3 >= i2);
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    public static int c(int i, int i2, int i3) {
        return b(i, Math.min(i2, i3), Math.max(i2, i3));
    }
}
