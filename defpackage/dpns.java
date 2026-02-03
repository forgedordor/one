package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpns {
    public static final dpns a;
    public static final dpns b;
    public static final dpns c;
    public static final dpns d;
    public static final dpns e;
    public static final dpns f;
    public static final dpns g;
    private static final /* synthetic */ dpns[] h;

    static {
        dpns dpnsVar = new dpns("Background", 0);
        a = dpnsVar;
        dpns dpnsVar2 = new dpns("Header", 1);
        b = dpnsVar2;
        dpns dpnsVar3 = new dpns("Content", 2);
        c = dpnsVar3;
        dpns dpnsVar4 = new dpns("Footer", 3);
        d = dpnsVar4;
        dpns dpnsVar5 = new dpns("ContentOverlay", 4);
        e = dpnsVar5;
        dpns dpnsVar6 = new dpns("ScreenOverlay", 5);
        f = dpnsVar6;
        dpns dpnsVar7 = new dpns("Snackbar", 6);
        g = dpnsVar7;
        dpns[] dpnsVarArr = {dpnsVar, dpnsVar2, dpnsVar3, dpnsVar4, dpnsVar5, dpnsVar6, dpnsVar7};
        h = dpnsVarArr;
        fczb.a(dpnsVarArr);
    }

    private dpns(String str, int i) {
    }

    public static dpns[] values() {
        return (dpns[]) h.clone();
    }
}
