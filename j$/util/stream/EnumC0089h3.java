package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.stream.h3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC0089h3 {
    public static final EnumC0089h3 OP;
    public static final EnumC0089h3 SPLITERATOR;
    public static final EnumC0089h3 STREAM;
    public static final EnumC0089h3 TERMINAL_OP;
    public static final EnumC0089h3 UPSTREAM_TERMINAL_OP;
    public static final /* synthetic */ EnumC0089h3[] a;

    static {
        EnumC0089h3 enumC0089h3 = new EnumC0089h3("SPLITERATOR", 0);
        SPLITERATOR = enumC0089h3;
        EnumC0089h3 enumC0089h32 = new EnumC0089h3("STREAM", 1);
        STREAM = enumC0089h32;
        EnumC0089h3 enumC0089h33 = new EnumC0089h3("OP", 2);
        OP = enumC0089h33;
        EnumC0089h3 enumC0089h34 = new EnumC0089h3("TERMINAL_OP", 3);
        TERMINAL_OP = enumC0089h34;
        EnumC0089h3 enumC0089h35 = new EnumC0089h3("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = enumC0089h35;
        a = new EnumC0089h3[]{enumC0089h3, enumC0089h32, enumC0089h33, enumC0089h34, enumC0089h35};
    }

    public static EnumC0089h3 valueOf(String str) {
        return (EnumC0089h3) Enum.valueOf(EnumC0089h3.class, str);
    }

    public static EnumC0089h3[] values() {
        return (EnumC0089h3[]) a.clone();
    }
}
