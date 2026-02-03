package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnxu {
    public static final cnxu a;
    public static final cnxu b;
    public static final cnxu c;
    public static final cnxu d;
    public static final cnxu e;
    public static final cnxu f;
    private static final /* synthetic */ cnxu[] g;

    static {
        cnxu cnxuVar = new cnxu("SUCCESS", 0);
        a = cnxuVar;
        cnxu cnxuVar2 = new cnxu("DIRTY", 1);
        b = cnxuVar2;
        cnxu cnxuVar3 = new cnxu("SCAN_FAILED", 2);
        c = cnxuVar3;
        cnxu cnxuVar4 = new cnxu("NOT_DEFAULT_SMS_APP", 3);
        d = cnxuVar4;
        cnxu cnxuVar5 = new cnxu("MISSING_PERMISSIONS", 4);
        e = cnxuVar5;
        cnxu cnxuVar6 = new cnxu("STALLED", 5);
        f = cnxuVar6;
        cnxu[] cnxuVarArr = {cnxuVar, cnxuVar2, cnxuVar3, cnxuVar4, cnxuVar5, cnxuVar6};
        g = cnxuVarArr;
        fczb.a(cnxuVarArr);
    }

    private cnxu(String str, int i) {
    }

    public static cnxu[] values() {
        return (cnxu[]) g.clone();
    }
}
