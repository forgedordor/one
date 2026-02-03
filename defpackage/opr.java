package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class opr {
    public static final opr a;
    public static final opr b;
    public static final opr c;
    private static final /* synthetic */ opr[] d;

    static {
        opr oprVar = new opr("ITEM_TO_PLACEHOLDER", 0);
        a = oprVar;
        opr oprVar2 = new opr("PLACEHOLDER_TO_ITEM", 1);
        b = oprVar2;
        opr oprVar3 = new opr("PLACEHOLDER_POSITION_CHANGE", 2);
        c = oprVar3;
        opr[] oprVarArr = {oprVar, oprVar2, oprVar3};
        d = oprVarArr;
        fczb.a(oprVarArr);
    }

    private opr(String str, int i) {
    }

    public static opr[] values() {
        return (opr[]) d.clone();
    }
}
