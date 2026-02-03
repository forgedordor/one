package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpuv {
    public static final dpuv a;
    public static final dpuv b;
    public static final dpuv c;
    public static final dpuv d;
    private static final /* synthetic */ dpuv[] e;

    static {
        dpuv dpuvVar = new dpuv("MATCHING_KEYBOARD", 0);
        a = dpuvVar;
        dpuv dpuvVar2 = new dpuv("ABOVE_KEYBOARD", 1);
        b = dpuvVar2;
        dpuv dpuvVar3 = new dpuv("EXPANDED", 2);
        c = dpuvVar3;
        dpuv dpuvVar4 = new dpuv("CLOSED", 3);
        d = dpuvVar4;
        dpuv[] dpuvVarArr = {dpuvVar, dpuvVar2, dpuvVar3, dpuvVar4};
        e = dpuvVarArr;
        fczb.a(dpuvVarArr);
    }

    private dpuv(String str, int i) {
    }

    public static dpuv[] values() {
        return (dpuv[]) e.clone();
    }
}
