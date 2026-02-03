package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
final class djlo {
    public static final djlo a;
    public static final djlo b;
    private static final /* synthetic */ djlo[] c;

    static {
        djlo djloVar = new djlo("PICKING_DATE", 0);
        a = djloVar;
        djlo djloVar2 = new djlo("PICKING_TIME", 1);
        b = djloVar2;
        djlo[] djloVarArr = {djloVar, djloVar2};
        c = djloVarArr;
        fczb.a(djloVarArr);
    }

    private djlo(String str, int i) {
    }

    public static djlo[] values() {
        return (djlo[]) c.clone();
    }
}
