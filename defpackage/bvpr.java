package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvpr {
    public static final bvpr a;
    public static final bvpr b;
    public static final bvpr c;
    public static final bvpr d;
    private static final /* synthetic */ bvpr[] e;

    static {
        bvpr bvprVar = new bvpr("UNKNOWN", 0);
        a = bvprVar;
        bvpr bvprVar2 = new bvpr("IS_PRIMARY", 1);
        b = bvprVar2;
        bvpr bvprVar3 = new bvpr("NOT_PRIMARY", 2);
        c = bvprVar3;
        bvpr bvprVar4 = new bvpr("ERROR", 3);
        d = bvprVar4;
        bvpr[] bvprVarArr = {bvprVar, bvprVar2, bvprVar3, bvprVar4};
        e = bvprVarArr;
        fczb.a(bvprVarArr);
    }

    private bvpr(String str, int i) {
    }

    public static bvpr[] values() {
        return (bvpr[]) e.clone();
    }
}
