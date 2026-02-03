package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fezn {
    public static final fezn a;
    public static final fezn b;
    public static final fezn c;
    public static final fezn d;
    public static final fezn e;
    private static final /* synthetic */ fezn[] g;
    public final String f;

    static {
        fezn feznVar = new fezn("TLS_1_3", 0, "TLSv1.3");
        a = feznVar;
        fezn feznVar2 = new fezn("TLS_1_2", 1, "TLSv1.2");
        b = feznVar2;
        fezn feznVar3 = new fezn("TLS_1_1", 2, "TLSv1.1");
        c = feznVar3;
        fezn feznVar4 = new fezn("TLS_1_0", 3, "TLSv1");
        d = feznVar4;
        fezn feznVar5 = new fezn("SSL_3_0", 4, "SSLv3");
        e = feznVar5;
        fezn[] feznVarArr = {feznVar, feznVar2, feznVar3, feznVar4, feznVar5};
        g = feznVarArr;
        fczb.a(feznVarArr);
    }

    private fezn(String str, int i, String str2) {
        this.f = str2;
    }

    public static fezn[] values() {
        return (fezn[]) g.clone();
    }
}
