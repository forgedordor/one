package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcyl {
    public static final fcyl a;
    public static final fcyl b;
    public static final fcyl c;
    private static final /* synthetic */ fcyl[] d;

    static {
        fcyl fcylVar = new fcyl("COROUTINE_SUSPENDED", 0);
        a = fcylVar;
        fcyl fcylVar2 = new fcyl("UNDECIDED", 1);
        b = fcylVar2;
        fcyl fcylVar3 = new fcyl("RESUMED", 2);
        c = fcylVar3;
        fcyl[] fcylVarArr = {fcylVar, fcylVar2, fcylVar3};
        d = fcylVarArr;
        fczb.a(fcylVarArr);
    }

    private fcyl(String str, int i) {
    }

    public static fcyl[] values() {
        return (fcyl[]) d.clone();
    }
}
