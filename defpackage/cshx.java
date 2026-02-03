package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cshx {
    public static final cshx a;
    public static final cshx b;
    private static final /* synthetic */ cshx[] d;
    public final String c;

    static {
        cshx cshxVar = new cshx("TEXT_CLASSIFICATION_ROLE", 0, "7955696939296490477");
        a = cshxVar;
        cshx cshxVar2 = new cshx("DESTINATION_CLASSIFICATION_ROLE", 1, "4595216684581506832");
        b = cshxVar2;
        cshx[] cshxVarArr = {cshxVar, cshxVar2};
        d = cshxVarArr;
        fczb.a(cshxVarArr);
    }

    private cshx(String str, int i, String str2) {
        this.c = str2;
    }

    public static cshx[] values() {
        return (cshx[]) d.clone();
    }
}
