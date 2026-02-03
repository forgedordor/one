package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tqk {
    public static final tqk a;
    public static final tqk b;
    public static final tqk c;
    public static final tqk d;
    public static final tqk e;
    public static final tqk f;
    public static final tqk g;
    public static final tqk h;
    public static final tqk i;
    private static final /* synthetic */ tqk[] j;

    static {
        tqk tqkVar = new tqk("FLOW_UNSPECIFIED", 0);
        a = tqkVar;
        tqk tqkVar2 = new tqk("HOME_IN_FI_IN", 1);
        b = tqkVar2;
        tqk tqkVar3 = new tqk("HOME_IN_FI_OUT_BNR_IN_FI", 2);
        c = tqkVar3;
        tqk tqkVar4 = new tqk("HOME_IN_FI_OUT_BNR_IN_NOT_FI", 3);
        d = tqkVar4;
        tqk tqkVar5 = new tqk("HOME_IN_FI_OUT_BNR_OUT_FI", 4);
        e = tqkVar5;
        tqk tqkVar6 = new tqk("HOME_IN_FI_OUT_BNR_OUT_NOT_FI", 5);
        f = tqkVar6;
        tqk tqkVar7 = new tqk("LEGACY_MD_ENABLE_FAILED", 6);
        g = tqkVar7;
        tqk tqkVar8 = new tqk("HOME_OUT_FI_IN", 7);
        h = tqkVar8;
        tqk tqkVar9 = new tqk("HOME_OUT_FI_OUT", 8);
        i = tqkVar9;
        tqk[] tqkVarArr = {tqkVar, tqkVar2, tqkVar3, tqkVar4, tqkVar5, tqkVar6, tqkVar7, tqkVar8, tqkVar9};
        j = tqkVarArr;
        fczb.a(tqkVarArr);
    }

    private tqk(String str, int i2) {
    }

    public static tqk[] values() {
        return (tqk[]) j.clone();
    }
}
