package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzcg {
    public static final bzcg a;
    public static final bzcg b;
    public static final bzcg c;
    private static final /* synthetic */ bzcg[] d;

    static {
        bzcg bzcgVar = new bzcg("RARELY_CHANGED_PART", 0);
        a = bzcgVar;
        bzcg bzcgVar2 = new bzcg("FREQUENTLY_CHANGED_PART", 1);
        b = bzcgVar2;
        bzcg bzcgVar3 = new bzcg("ADDITIONAL_FIELDS_PART", 2);
        c = bzcgVar3;
        bzcg[] bzcgVarArr = {bzcgVar, bzcgVar2, bzcgVar3};
        d = bzcgVarArr;
        fczb.a(bzcgVarArr);
    }

    private bzcg(String str, int i) {
    }

    public static bzcg[] values() {
        return (bzcg[]) d.clone();
    }
}
