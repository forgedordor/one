package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsq {
    public static final gsq a;
    public static final gsq b;
    public static final gsq c;
    private static final /* synthetic */ gsq[] d;

    static {
        gsq gsqVar = new gsq("Hidden", 0);
        a = gsqVar;
        gsq gsqVar2 = new gsq("Expanded", 1);
        b = gsqVar2;
        gsq gsqVar3 = new gsq("PartiallyExpanded", 2);
        c = gsqVar3;
        gsq[] gsqVarArr = {gsqVar, gsqVar2, gsqVar3};
        d = gsqVarArr;
        fczb.a(gsqVarArr);
    }

    private gsq(String str, int i) {
    }

    public static gsq[] values() {
        return (gsq[]) d.clone();
    }
}
