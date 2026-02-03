package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class grr {
    public static final grr a;
    public static final grr b;
    public static final grr c;
    public static final grr d;
    public static final grr e;
    private static final /* synthetic */ grr[] f;

    static {
        grr grrVar = new grr("TopBar", 0);
        a = grrVar;
        grr grrVar2 = new grr("MainContent", 1);
        b = grrVar2;
        grr grrVar3 = new grr("Snackbar", 2);
        c = grrVar3;
        grr grrVar4 = new grr("Fab", 3);
        d = grrVar4;
        grr grrVar5 = new grr("BottomBar", 4);
        e = grrVar5;
        grr[] grrVarArr = {grrVar, grrVar2, grrVar3, grrVar4, grrVar5};
        f = grrVarArr;
        fczb.a(grrVarArr);
    }

    private grr(String str, int i) {
    }

    public static grr[] values() {
        return (grr[]) f.clone();
    }
}
