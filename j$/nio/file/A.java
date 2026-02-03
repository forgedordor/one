package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class A implements n {
    public static final A APPEND;
    public static final A CREATE;
    public static final A CREATE_NEW;
    public static final A DELETE_ON_CLOSE;
    public static final A DSYNC;
    public static final A READ;
    public static final A SPARSE;
    public static final A SYNC;
    public static final A TRUNCATE_EXISTING;
    public static final A WRITE;
    public static final /* synthetic */ A[] a;

    static {
        A a2 = new A("READ", 0);
        READ = a2;
        A a3 = new A("WRITE", 1);
        WRITE = a3;
        A a4 = new A("APPEND", 2);
        APPEND = a4;
        A a5 = new A("TRUNCATE_EXISTING", 3);
        TRUNCATE_EXISTING = a5;
        A a6 = new A("CREATE", 4);
        CREATE = a6;
        A a7 = new A("CREATE_NEW", 5);
        CREATE_NEW = a7;
        A a8 = new A("DELETE_ON_CLOSE", 6);
        DELETE_ON_CLOSE = a8;
        A a9 = new A("SPARSE", 7);
        SPARSE = a9;
        A a10 = new A("SYNC", 8);
        SYNC = a10;
        A a11 = new A("DSYNC", 9);
        DSYNC = a11;
        a = new A[]{a2, a3, a4, a5, a6, a7, a8, a9, a10, a11};
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) a.clone();
    }
}
