package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoff {
    public static final aoff a;
    public static final aoff b;

    @fcsv
    public static final aoff c;
    public static final aoff d;
    public static final aoff e;
    private static final /* synthetic */ aoff[] f;

    static {
        aoff aoffVar = new aoff("NO_CONNECTION", 0);
        a = aoffVar;
        aoff aoffVar2 = new aoff("TERRESTRIAL", 1);
        b = aoffVar2;
        aoff aoffVar3 = new aoff("SATELLITE_MANUAL_ELIGIBLE", 2);
        c = aoffVar3;
        aoff aoffVar4 = new aoff("SATELLITE_AUTO_CONNECT", 3);
        d = aoffVar4;
        aoff aoffVar5 = new aoff("SATELLITE_MANUAL_CONNECT", 4);
        e = aoffVar5;
        aoff[] aoffVarArr = {aoffVar, aoffVar2, aoffVar3, aoffVar4, aoffVar5};
        f = aoffVarArr;
        fczb.a(aoffVarArr);
    }

    private aoff(String str, int i) {
    }

    public static aoff[] values() {
        return (aoff[]) f.clone();
    }

    public final boolean a() {
        return this == d;
    }
}
