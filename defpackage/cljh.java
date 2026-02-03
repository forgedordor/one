package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cljh {
    public static final cljh a;
    public static final cljh b;
    public static final cljh c;
    public static final cljh d;
    public static final cljh e;
    private static final /* synthetic */ cljh[] f;

    static {
        cljh cljhVar = new cljh("UNKNOWN", 0);
        a = cljhVar;
        cljh cljhVar2 = new cljh("ON_SATELLITE_AUTO_CONNECT", 1);
        b = cljhVar2;
        cljh cljhVar3 = new cljh("ON_SATELLITE_MANUAL_CONNECT", 2);
        c = cljhVar3;
        cljh cljhVar4 = new cljh("SATELLITE_MANUAL_ELIGIBLE", 3);
        d = cljhVar4;
        cljh cljhVar5 = new cljh("OFF_SATELLITE", 4);
        e = cljhVar5;
        cljh[] cljhVarArr = {cljhVar, cljhVar2, cljhVar3, cljhVar4, cljhVar5};
        f = cljhVarArr;
        fczb.a(cljhVarArr);
    }

    private cljh(String str, int i) {
    }

    public static cljh[] values() {
        return (cljh[]) f.clone();
    }

    public final boolean a() {
        return this == b || this == c;
    }

    public final boolean b() {
        return this == b;
    }

    public final boolean c() {
        return this == c;
    }
}
