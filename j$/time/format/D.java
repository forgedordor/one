package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class D {
    public static final D ALWAYS;
    public static final D EXCEEDS_PAD;
    public static final D NEVER;
    public static final D NORMAL;
    public static final D NOT_NEGATIVE;
    public static final /* synthetic */ D[] a;

    static {
        D d = new D("NORMAL", 0);
        NORMAL = d;
        D d2 = new D("ALWAYS", 1);
        ALWAYS = d2;
        D d3 = new D("NEVER", 2);
        NEVER = d3;
        D d4 = new D("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = d4;
        D d5 = new D("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = d5;
        a = new D[]{d, d2, d3, d4, d5};
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) a.clone();
    }
}
