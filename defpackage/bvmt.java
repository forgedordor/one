package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvmt {
    public static final bvmt a;
    public static final bvmt b;
    public static final bvmt c;
    private static final /* synthetic */ bvmt[] d;

    static {
        bvmt bvmtVar = new bvmt("NONE", 0);
        a = bvmtVar;
        bvmt bvmtVar2 = new bvmt("ANONYMOUS", 1);
        b = bvmtVar2;
        bvmt bvmtVar3 = new bvmt("GAIA", 2);
        c = bvmtVar3;
        bvmt[] bvmtVarArr = {bvmtVar, bvmtVar2, bvmtVar3};
        d = bvmtVarArr;
        fczb.a(bvmtVarArr);
    }

    private bvmt(String str, int i) {
    }

    public static bvmt[] values() {
        return (bvmt[]) d.clone();
    }
}
