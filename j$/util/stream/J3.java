package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class J3 {
    public static final J3 MAYBE_MORE;
    public static final J3 NO_MORE;
    public static final J3 UNLIMITED;
    public static final /* synthetic */ J3[] a;

    static {
        J3 j3 = new J3("NO_MORE", 0);
        NO_MORE = j3;
        J3 j32 = new J3("MAYBE_MORE", 1);
        MAYBE_MORE = j32;
        J3 j33 = new J3("UNLIMITED", 2);
        UNLIMITED = j33;
        a = new J3[]{j3, j32, j33};
    }

    public static J3 valueOf(String str) {
        return (J3) Enum.valueOf(J3.class, str);
    }

    public static J3[] values() {
        return (J3[]) a.clone();
    }
}
