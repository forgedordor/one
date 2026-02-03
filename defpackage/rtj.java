package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rtj extends rta {
    private static rtj A;
    public static rtj a;
    public static rtj x;
    private static rtj y;
    private static rtj z;

    public static rtj a() {
        if (z == null) {
            z = (rtj) ((rtj) new rtj().y()).x();
        }
        return z;
    }

    public static rtj b() {
        if (A == null) {
            A = (rtj) ((rtj) new rtj().A()).x();
        }
        return A;
    }

    public static rtj c(Class cls) {
        return (rtj) new rtj().B(cls);
    }

    public static rtj d(rha rhaVar) {
        return (rtj) new rtj().D(rhaVar);
    }

    public static rtj e() {
        if (y == null) {
            y = (rtj) ((rtj) new rtj().J()).x();
        }
        return y;
    }

    @Override // defpackage.rta
    public final boolean equals(Object obj) {
        return (obj instanceof rtj) && super.equals(obj);
    }
}
