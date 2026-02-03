package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvpe {
    public static final bvpe a;
    public static final bvpe b;
    public static final bvpe c;
    public static final bvpe d;
    public static final bvpe e;
    public static final bvpe f;
    private static final /* synthetic */ bvpe[] g;

    static {
        bvpe bvpeVar = new bvpe("UNKNOWN", 0);
        a = bvpeVar;
        bvpe bvpeVar2 = new bvpe("SWITCH_ACCOUNT", 1);
        b = bvpeVar2;
        bvpe bvpeVar3 = new bvpe("OPEN_SETTINGS", 2);
        c = bvpeVar3;
        bvpe bvpeVar4 = new bvpe("RESET_PRIMARY_DEVICE", 3);
        d = bvpeVar4;
        bvpe bvpeVar5 = new bvpe("TURN_ON_BNR", 4);
        e = bvpeVar5;
        bvpe bvpeVar6 = new bvpe("DISABLE_FI_SYNC", 5);
        f = bvpeVar6;
        bvpe[] bvpeVarArr = {bvpeVar, bvpeVar2, bvpeVar3, bvpeVar4, bvpeVar5, bvpeVar6};
        g = bvpeVarArr;
        fczb.a(bvpeVarArr);
    }

    private bvpe(String str, int i) {
    }

    public static bvpe[] values() {
        return (bvpe[]) g.clone();
    }
}
