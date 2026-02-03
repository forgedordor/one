package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class lrz {
    public static final lrz a;
    public static final lrz b;
    public static final lrz c;
    public static final lrz d;
    public static final lrz e;
    public static final lrz f;
    public static final lrz g;
    public static final lrz h;
    public static final lrz i;
    private static final /* synthetic */ lrz[] j;

    static {
        lrz lrzVar = new lrz("PENALTY_LOG", 0);
        a = lrzVar;
        lrz lrzVar2 = new lrz("PENALTY_DEATH", 1);
        b = lrzVar2;
        lrz lrzVar3 = new lrz("DETECT_FRAGMENT_REUSE", 2);
        c = lrzVar3;
        lrz lrzVar4 = new lrz("DETECT_FRAGMENT_TAG_USAGE", 3);
        d = lrzVar4;
        lrz lrzVar5 = new lrz("DETECT_WRONG_NESTED_HIERARCHY", 4);
        e = lrzVar5;
        lrz lrzVar6 = new lrz("DETECT_RETAIN_INSTANCE_USAGE", 5);
        f = lrzVar6;
        lrz lrzVar7 = new lrz("DETECT_SET_USER_VISIBLE_HINT", 6);
        g = lrzVar7;
        lrz lrzVar8 = new lrz("DETECT_TARGET_FRAGMENT_USAGE", 7);
        h = lrzVar8;
        lrz lrzVar9 = new lrz("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        i = lrzVar9;
        lrz[] lrzVarArr = {lrzVar, lrzVar2, lrzVar3, lrzVar4, lrzVar5, lrzVar6, lrzVar7, lrzVar8, lrzVar9};
        j = lrzVarArr;
        fczb.a(lrzVarArr);
    }

    private lrz(String str, int i2) {
    }

    public static lrz[] values() {
        return (lrz[]) j.clone();
    }
}
