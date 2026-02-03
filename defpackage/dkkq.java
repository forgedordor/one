package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkkq {
    public static final dkkq a;
    public static final dkkq b;
    public static final dkkq c;
    private static final /* synthetic */ dkkq[] d;

    static {
        dkkq dkkqVar = new dkkq("SELECTED", 0);
        a = dkkqVar;
        dkkq dkkqVar2 = new dkkq("NOT_SELECTED", 1);
        b = dkkqVar2;
        dkkq dkkqVar3 = new dkkq("HIDDEN", 2);
        c = dkkqVar3;
        dkkq[] dkkqVarArr = {dkkqVar, dkkqVar2, dkkqVar3};
        d = dkkqVarArr;
        fczb.a(dkkqVarArr);
    }

    private dkkq(String str, int i) {
    }

    public static dkkq[] values() {
        return (dkkq[]) d.clone();
    }
}
