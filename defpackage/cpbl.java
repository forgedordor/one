package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpbl {
    public static final cpbl a;
    public static final cpbl b;
    private static final /* synthetic */ cpbl[] d;
    public final String c;

    static {
        cpbl cpblVar = new cpbl("THUMBNAIL", 0, "t");
        a = cpblVar;
        cpbl cpblVar2 = new cpbl("DISPLAY", 1, "d");
        b = cpblVar2;
        cpbl[] cpblVarArr = {cpblVar, cpblVar2};
        d = cpblVarArr;
        fczb.a(cpblVarArr);
    }

    private cpbl(String str, int i, String str2) {
        this.c = str2;
    }

    public static cpbl[] values() {
        return (cpbl[]) d.clone();
    }
}
