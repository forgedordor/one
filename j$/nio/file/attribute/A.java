package j$.nio.file.attribute;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class A {
    public static final A GROUP_EXECUTE;
    public static final A GROUP_READ;
    public static final A GROUP_WRITE;
    public static final A OTHERS_EXECUTE;
    public static final A OTHERS_READ;
    public static final A OTHERS_WRITE;
    public static final A OWNER_EXECUTE;
    public static final A OWNER_READ;
    public static final A OWNER_WRITE;
    public static final /* synthetic */ A[] a;

    static {
        A a2 = new A("OWNER_READ", 0);
        OWNER_READ = a2;
        A a3 = new A("OWNER_WRITE", 1);
        OWNER_WRITE = a3;
        A a4 = new A("OWNER_EXECUTE", 2);
        OWNER_EXECUTE = a4;
        A a5 = new A("GROUP_READ", 3);
        GROUP_READ = a5;
        A a6 = new A("GROUP_WRITE", 4);
        GROUP_WRITE = a6;
        A a7 = new A("GROUP_EXECUTE", 5);
        GROUP_EXECUTE = a7;
        A a8 = new A("OTHERS_READ", 6);
        OTHERS_READ = a8;
        A a9 = new A("OTHERS_WRITE", 7);
        OTHERS_WRITE = a9;
        A a10 = new A("OTHERS_EXECUTE", 8);
        OTHERS_EXECUTE = a10;
        a = new A[]{a2, a3, a4, a5, a6, a7, a8, a9, a10};
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) a.clone();
    }
}
