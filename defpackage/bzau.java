package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzau {
    public static final bzau a;
    public static final bzau b;
    private static final /* synthetic */ bzau[] d;
    public final int c;

    static {
        bzau bzauVar = new bzau("MARK_SUCCESS", 0, 2);
        a = bzauVar;
        bzau bzauVar2 = new bzau("MARK_FAILED", 1, 3);
        b = bzauVar2;
        bzau[] bzauVarArr = {bzauVar, bzauVar2};
        d = bzauVarArr;
        fczb.a(bzauVarArr);
    }

    private bzau(String str, int i, int i2) {
        this.c = i2;
    }

    public static bzau[] values() {
        return (bzau[]) d.clone();
    }
}
