package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhun {
    public static final dhun a;
    public static final dhun b;
    public static final dhun c;
    public static final dhun d;
    public static final dhun e;
    public static final dhun f;
    private static final /* synthetic */ dhun[] g;

    static {
        dhun dhunVar = new dhun("NONE", 0);
        a = dhunVar;
        dhun dhunVar2 = new dhun("WARN", 1);
        b = dhunVar2;
        dhun dhunVar3 = new dhun("HIDE", 2);
        c = dhunVar3;
        dhun dhunVar4 = new dhun("UNKNOWN", 3);
        d = dhunVar4;
        dhun dhunVar5 = new dhun("NOT_AVAILABLE", 4);
        e = dhunVar5;
        dhun dhunVar6 = new dhun("DELETE", 5);
        f = dhunVar6;
        dhun[] dhunVarArr = {dhunVar, dhunVar2, dhunVar3, dhunVar4, dhunVar5, dhunVar6};
        g = dhunVarArr;
        fczb.a(dhunVarArr);
    }

    private dhun(String str, int i) {
    }

    public static dhun[] values() {
        return (dhun[]) g.clone();
    }
}
