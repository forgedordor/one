package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class pza {
    public static final pza a;
    public static final pza b;
    private static final /* synthetic */ pza[] c;

    static {
        pza pzaVar = new pza("EXPONENTIAL", 0);
        a = pzaVar;
        pza pzaVar2 = new pza("LINEAR", 1);
        b = pzaVar2;
        pza[] pzaVarArr = {pzaVar, pzaVar2};
        c = pzaVarArr;
        fczb.a(pzaVarArr);
    }

    private pza(String str, int i) {
    }

    public static pza[] values() {
        return (pza[]) c.clone();
    }
}
