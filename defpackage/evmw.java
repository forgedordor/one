package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum evmw implements evst {
    UI_THEME_UNSPECIFIED(0),
    UI_THEME_GOOGLE_MATERIAL(1),
    UI_THEME_GOOGLE_MATERIAL_NEXT(2);

    private final int e;

    evmw(int i) {
        this.e = i;
    }

    public static evmw b(int i) {
        if (i == 0) {
            return UI_THEME_UNSPECIFIED;
        }
        if (i == 1) {
            return UI_THEME_GOOGLE_MATERIAL;
        }
        if (i != 2) {
            return null;
        }
        return UI_THEME_GOOGLE_MATERIAL_NEXT;
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
