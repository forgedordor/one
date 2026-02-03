package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecxt {
    public static final ecxt a;
    public static final ecxt b;
    public static final ecxt c;
    private static final /* synthetic */ ecxt[] e;
    public final String d;

    static {
        ecxt ecxtVar = new ecxt("PROD", 0, "%s.googleapis.com");
        a = ecxtVar;
        ecxt ecxtVar2 = new ecxt("AUTOPUSH", 1, "autopush-%s.sandbox.googleapis.com");
        b = ecxtVar2;
        ecxt ecxtVar3 = new ecxt("SANDBOX", 2, "dev-%s.corp.googleapis.com");
        c = ecxtVar3;
        ecxt[] ecxtVarArr = {ecxtVar, ecxtVar2, ecxtVar3};
        e = ecxtVarArr;
        fczb.a(ecxtVarArr);
    }

    private ecxt(String str, int i, String str2) {
        this.d = str2;
    }

    public static ecxt[] values() {
        return (ecxt[]) e.clone();
    }
}
