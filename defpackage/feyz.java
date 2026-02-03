package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feyz {
    public static final feyz a;
    public static final feyz b;

    @fcsv
    public static final feyz c;
    public static final feyz d;
    public static final feyz e;
    public static final feyz f;
    private static final /* synthetic */ feyz[] h;
    public final String g;

    static {
        feyz feyzVar = new feyz("HTTP_1_0", 0, "http/1.0");
        a = feyzVar;
        feyz feyzVar2 = new feyz("HTTP_1_1", 1, "http/1.1");
        b = feyzVar2;
        feyz feyzVar3 = new feyz("SPDY_3", 2, "spdy/3.1");
        c = feyzVar3;
        feyz feyzVar4 = new feyz("HTTP_2", 3, "h2");
        d = feyzVar4;
        feyz feyzVar5 = new feyz("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
        e = feyzVar5;
        feyz feyzVar6 = new feyz("QUIC", 5, "quic");
        f = feyzVar6;
        feyz[] feyzVarArr = {feyzVar, feyzVar2, feyzVar3, feyzVar4, feyzVar5, feyzVar6};
        h = feyzVarArr;
        fczb.a(feyzVarArr);
    }

    private feyz(String str, int i, String str2) {
        this.g = str2;
    }

    public static feyz[] values() {
        return (feyz[]) h.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.g;
    }
}
