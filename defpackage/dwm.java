package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwm {
    public static final dwm a;
    public static final dwm b;
    private static final /* synthetic */ dwm[] c;

    static {
        dwm dwmVar = new dwm("Vertical", 0);
        a = dwmVar;
        dwm dwmVar2 = new dwm("Horizontal", 1);
        b = dwmVar2;
        dwm[] dwmVarArr = {dwmVar, dwmVar2};
        c = dwmVarArr;
        fczb.a(dwmVarArr);
    }

    private dwm(String str, int i) {
    }

    public static dwm[] values() {
        return (dwm[]) c.clone();
    }
}
