package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgra {
    public static final cgra a;
    public static final cgra b;
    public static final cgra c;
    public static final cgra d;
    public static final cgra e;
    private static final /* synthetic */ cgra[] g;
    public final int f;

    static {
        cgra cgraVar = new cgra("NONE", 0, 0);
        a = cgraVar;
        cgra cgraVar2 = new cgra("ONE_HOUR", 1, 1);
        b = cgraVar2;
        cgra cgraVar3 = new cgra("EIGHT_HOURS", 2, 8);
        c = cgraVar3;
        cgra cgraVar4 = new cgra("TWENTY_FOUR_HOURS", 3, 24);
        d = cgraVar4;
        cgra cgraVar5 = new cgra("INDEFINITE", 4, 9999);
        e = cgraVar5;
        cgra[] cgraVarArr = {cgraVar, cgraVar2, cgraVar3, cgraVar4, cgraVar5};
        g = cgraVarArr;
        fczb.a(cgraVarArr);
    }

    private cgra(String str, int i, int i2) {
        this.f = i2;
    }

    public static cgra[] values() {
        return (cgra[]) g.clone();
    }
}
