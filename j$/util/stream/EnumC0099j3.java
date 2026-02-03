package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.stream.j3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC0099j3 {
    public static final EnumC0099j3 DOUBLE_VALUE;
    public static final EnumC0099j3 INT_VALUE;
    public static final EnumC0099j3 LONG_VALUE;
    public static final EnumC0099j3 REFERENCE;
    public static final /* synthetic */ EnumC0099j3[] a;

    static {
        EnumC0099j3 enumC0099j3 = new EnumC0099j3("REFERENCE", 0);
        REFERENCE = enumC0099j3;
        EnumC0099j3 enumC0099j32 = new EnumC0099j3("INT_VALUE", 1);
        INT_VALUE = enumC0099j32;
        EnumC0099j3 enumC0099j33 = new EnumC0099j3("LONG_VALUE", 2);
        LONG_VALUE = enumC0099j33;
        EnumC0099j3 enumC0099j34 = new EnumC0099j3("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = enumC0099j34;
        a = new EnumC0099j3[]{enumC0099j3, enumC0099j32, enumC0099j33, enumC0099j34};
    }

    public static EnumC0099j3 valueOf(String str) {
        return (EnumC0099j3) Enum.valueOf(EnumC0099j3.class, str);
    }

    public static EnumC0099j3[] values() {
        return (EnumC0099j3[]) a.clone();
    }
}
