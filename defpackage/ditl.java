package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ditl {
    public static final ditl a;
    public static final ditl b;
    private static final /* synthetic */ ditl[] c;

    static {
        ditl ditlVar = new ditl("EXPANDED", 0);
        a = ditlVar;
        ditl ditlVar2 = new ditl("COLLAPSED", 1);
        b = ditlVar2;
        ditl[] ditlVarArr = {ditlVar, ditlVar2};
        c = ditlVarArr;
        fczb.a(ditlVarArr);
    }

    private ditl(String str, int i) {
    }

    public static ditl[] values() {
        return (ditl[]) c.clone();
    }
}
