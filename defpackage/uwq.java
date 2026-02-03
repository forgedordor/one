package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
final class uwq {
    public static final uwq a;
    public static final uwq b;
    public static final uwq c;
    private static final /* synthetic */ uwq[] d;

    static {
        uwq uwqVar = new uwq("EMPTY", 0);
        a = uwqVar;
        uwq uwqVar2 = new uwq("SHORT", 1);
        b = uwqVar2;
        uwq uwqVar3 = new uwq("LONG", 2);
        c = uwqVar3;
        uwq[] uwqVarArr = {uwqVar, uwqVar2, uwqVar3};
        d = uwqVarArr;
        fczb.a(uwqVarArr);
    }

    private uwq(String str, int i) {
    }

    public static uwq[] values() {
        return (uwq[]) d.clone();
    }
}
