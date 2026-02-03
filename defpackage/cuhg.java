package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuhg {
    public static final cuhg a;
    public static final cuhg b;
    public static final cuhg c;
    public static final cuhg d;
    private static final /* synthetic */ cuhg[] e;

    static {
        cuhg cuhgVar = new cuhg("COOL_RANCH", 0);
        a = cuhgVar;
        cuhg cuhgVar2 = new cuhg("SAMSUNG_DYNAMIC", 1);
        b = cuhgVar2;
        cuhg cuhgVar3 = new cuhg("MATERIAL_NEXT", 2);
        c = cuhgVar3;
        cuhg cuhgVar4 = new cuhg("SYSTEM_FONT", 3);
        d = cuhgVar4;
        cuhg[] cuhgVarArr = {cuhgVar, cuhgVar2, cuhgVar3, cuhgVar4};
        e = cuhgVarArr;
        fczb.a(cuhgVarArr);
    }

    private cuhg(String str, int i) {
    }

    public static cuhg[] values() {
        return (cuhg[]) e.clone();
    }
}
