package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class pzz {
    public static final pzz a;
    public static final pzz b;
    public static final pzz c;
    public static final pzz d;
    private static final /* synthetic */ pzz[] e;

    static {
        pzz pzzVar = new pzz("REPLACE", 0);
        a = pzzVar;
        pzz pzzVar2 = new pzz("KEEP", 1);
        b = pzzVar2;
        pzz pzzVar3 = new pzz("APPEND", 2);
        c = pzzVar3;
        pzz pzzVar4 = new pzz("APPEND_OR_REPLACE", 3);
        d = pzzVar4;
        pzz[] pzzVarArr = {pzzVar, pzzVar2, pzzVar3, pzzVar4};
        e = pzzVarArr;
        fczb.a(pzzVarArr);
    }

    private pzz(String str, int i) {
    }

    public static pzz[] values() {
        return (pzz[]) e.clone();
    }
}
