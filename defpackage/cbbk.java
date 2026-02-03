package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbbk {
    public static final cbbk a;
    public static final cbbk b;
    private static final /* synthetic */ cbbk[] c;

    static {
        cbbk cbbkVar = new cbbk("V1", 0);
        a = cbbkVar;
        cbbk cbbkVar2 = new cbbk("V2", 1);
        b = cbbkVar2;
        cbbk[] cbbkVarArr = {cbbkVar, cbbkVar2};
        c = cbbkVarArr;
        fczb.a(cbbkVarArr);
    }

    private cbbk(String str, int i) {
    }

    public static cbbk[] values() {
        return (cbbk[]) c.clone();
    }
}
