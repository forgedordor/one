package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class C {
    public static final C LENIENT;
    public static final C SMART;
    public static final C STRICT;
    public static final /* synthetic */ C[] a;

    static {
        C c = new C("STRICT", 0);
        STRICT = c;
        C c2 = new C("SMART", 1);
        SMART = c2;
        C c3 = new C("LENIENT", 2);
        LENIENT = c3;
        a = new C[]{c, c2, c3};
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) a.clone();
    }
}
