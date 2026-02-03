package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akbl {
    public static final akbl a;
    public static final akbl b;
    public static final akbl c;
    private static final /* synthetic */ akbl[] d;

    static {
        akbl akblVar = new akbl("UNKNOWN", 0);
        a = akblVar;
        akbl akblVar2 = new akbl("APPROVED", 1);
        b = akblVar2;
        akbl akblVar3 = new akbl("NOT_APPROVED", 2);
        c = akblVar3;
        akbl[] akblVarArr = {akblVar, akblVar2, akblVar3};
        d = akblVarArr;
        fczb.a(akblVarArr);
    }

    private akbl(String str, int i) {
    }

    public static akbl[] values() {
        return (akbl[]) d.clone();
    }
}
