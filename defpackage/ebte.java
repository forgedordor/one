package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebte {
    public static final ebte a;
    public static final ebte b;
    public static final ebte c;
    private static final /* synthetic */ ebte[] d;

    static {
        ebte ebteVar = new ebte("TRANSFORM", 0);
        a = ebteVar;
        ebte ebteVar2 = new ebte("STROKE", 1);
        b = ebteVar2;
        ebte ebteVar3 = new ebte("TEXT", 2);
        c = ebteVar3;
        ebte[] ebteVarArr = {ebteVar, ebteVar2, ebteVar3};
        d = ebteVarArr;
        fczb.a(ebteVarArr);
    }

    private ebte(String str, int i) {
    }

    public static ebte[] values() {
        return (ebte[]) d.clone();
    }
}
