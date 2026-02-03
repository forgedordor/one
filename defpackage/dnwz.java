package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnwz {
    public static final dnwz a;
    public static final dnwz b;
    public static final dnwz c;
    public static final dnwz d;
    public static final dnwz e;
    public static final dnwz f;
    public static final dnwz g;
    private static final /* synthetic */ dnwz[] h;

    static {
        dnwz dnwzVar = new dnwz("LOADING_MODEL", 0);
        a = dnwzVar;
        dnwz dnwzVar2 = new dnwz("LOADING_IMAGE", 1);
        b = dnwzVar2;
        dnwz dnwzVar3 = new dnwz("SAVING", 2);
        c = dnwzVar3;
        dnwz dnwzVar4 = new dnwz("SEGMENTATION_TIMEOUT", 3);
        d = dnwzVar4;
        dnwz dnwzVar5 = new dnwz("SEGMENTATION_OOM", 4);
        e = dnwzVar5;
        dnwz dnwzVar6 = new dnwz("SEGMENTATION_UNSATISFIED_LINK", 5);
        f = dnwzVar6;
        dnwz dnwzVar7 = new dnwz("SEGMENTATION_OTHER", 6);
        g = dnwzVar7;
        dnwz[] dnwzVarArr = {dnwzVar, dnwzVar2, dnwzVar3, dnwzVar4, dnwzVar5, dnwzVar6, dnwzVar7};
        h = dnwzVarArr;
        fczb.a(dnwzVarArr);
    }

    private dnwz(String str, int i) {
    }

    public static dnwz[] values() {
        return (dnwz[]) h.clone();
    }
}
