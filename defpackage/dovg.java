package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dovg {
    public static final dovg a;
    public static final dovg b;
    private static final /* synthetic */ dovg[] c;

    static {
        dovg dovgVar = new dovg("NONE", 0);
        a = dovgVar;
        dovg dovgVar2 = new dovg("CLEAR", 1);
        b = dovgVar2;
        dovg[] dovgVarArr = {dovgVar, dovgVar2};
        c = dovgVarArr;
        fczb.a(dovgVarArr);
    }

    private dovg(String str, int i) {
    }

    public static dovg[] values() {
        return (dovg[]) c.clone();
    }
}
