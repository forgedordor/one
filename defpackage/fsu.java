package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class fsu {
    public static final fsu a;
    public static final fsu b;
    public static final fsu c;
    public static final fsu d;
    public static final fsu e;
    private static final /* synthetic */ fsu[] f;

    static {
        fsu fsuVar = new fsu("TopBar", 0);
        a = fsuVar;
        fsu fsuVar2 = new fsu("MainContent", 1);
        b = fsuVar2;
        fsu fsuVar3 = new fsu("Snackbar", 2);
        c = fsuVar3;
        fsu fsuVar4 = new fsu("Fab", 3);
        d = fsuVar4;
        fsu fsuVar5 = new fsu("BottomBar", 4);
        e = fsuVar5;
        fsu[] fsuVarArr = {fsuVar, fsuVar2, fsuVar3, fsuVar4, fsuVar5};
        f = fsuVarArr;
        fczb.a(fsuVarArr);
    }

    private fsu(String str, int i) {
    }

    public static fsu[] values() {
        return (fsu[]) f.clone();
    }
}
