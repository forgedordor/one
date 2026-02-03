package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class pfs {
    public static final pfs a;
    public static final pfs b;
    public static final pfs c;
    private static final /* synthetic */ pfs[] d;

    static {
        pfs pfsVar = new pfs("DEFERRED", 0);
        a = pfsVar;
        pfs pfsVar2 = new pfs("IMMEDIATE", 1);
        b = pfsVar2;
        pfs pfsVar3 = new pfs("EXCLUSIVE", 2);
        c = pfsVar3;
        pfs[] pfsVarArr = {pfsVar, pfsVar2, pfsVar3};
        d = pfsVarArr;
        fczb.a(pfsVarArr);
    }

    private pfs(String str, int i) {
    }

    public static pfs[] values() {
        return (pfs[]) d.clone();
    }
}
